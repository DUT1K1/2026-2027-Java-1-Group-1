void main() {
    //n1
//        int[] b = new int[12];
//
//        for (int i = 0; i < b.length; i++) {
//            b[i] = i + 1;
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }
//
//        System.out.println();
    //n2
    //sum
//        float sum = 0;
//        int product = 1;
//        int length = b.length;
//        for (int i = 0; i < length; i++) {
//            sum += b[i];
//            product *= b[i];
//        }
//        System.out.print("sum: " + (int) sum +
//                "\nproduct: " + product +
//                "\naverage: " + sum/length);

    //n3
//        Random random = new Random();
//        int[] a = new int[20];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt(21);
//        }
//        int min = a[0];
//        int max = a[0];
//
//        for(int i : a) {
//            System.out.print(i + " ");
//        }
//        for (int i = 0; i < a.length; i++) {
//            if(a[i] < min) {
//                min = a[i];
//            }
//            if(a[i] > max) {
//                max = a[i];
//            }
//        }
//        System.out.println();
//        System.out.println("Min: " + min +
//                "\nMax: " + max);

    //n4
//        int[] numbers = new int[15];
//        for (int index = 0; index < numbers.length; index++) {
//            numbers[index] = index + 1;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();

    //n5
//        float sum = 0;
//        int product = 1;
//        int length = numbers.length;
//        for(int i : numbers) {
//            sum += i;
//            product *= i;
//        }
//        System.out.println("Sum: " + (int) sum +
//                "\nProduct: " + product +
//                "\nAverage: " + sum/length);

    //n6
//        int[] numbers = {1, 2, 3, 4, 5};
//        int x = 10;
//        int counter = 0;
//        for (int i : numbers) {
//            if (i == x) {
//                System.out.println("X is in the array!!!");
//                break;
//            }
//            counter++;
//        }
//        if(counter == numbers.length) {
//            System.out.println("X is not in the array!!!");
//        }

    //7.1
//        int[] numbers = {1,2,3,4,5};
//        int[] newNums = new int[numbers.length + 1];
//        int numberToAdd = 77777;
//
//        newNums[0] = numberToAdd;
//        for (int i = 0; i < numbers.length; i++) {
//            newNums[i + 1] = numbers[i];
//        }
//        String arrayToPrint = Arrays.toString(newNums);
//        System.out.println(arrayToPrint);

    //7.2
//        int[] numbers = {1,2,3,4,5};
//        int[] newNums = Arrays.copyOf(numbers, 1000);
//        int numberToAdd = 999;
//        newNums[newNums.length - 1] = numberToAdd;
//
//        for (int i = 0; i < newNums.length; i++) {
//            System.out.print(newNums[i] + " ");
//        }


    //8
//        int[] numbers = {1,2,3};
//        int target = 5;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i; j < numbers.length; j++) {
//                if(numbers[i] + numbers[j] == target &&  i != j) {
//                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
//                    break;
//                }
//            }
//        }

    //9
    Scanner sc = new Scanner(System.in);
    //old array
    int[] numbers = {1, 2, 3, 4, 5};

    //printing the array
    for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i] + " ");
    }
    //receiving users input
    System.out.println();
    System.out.print("Please Input Number You Want To Remove: ");
    int numToRemove = sc.nextInt();

    //create new array
    int[] newNumbers = new int[numbers.length - 1];

    //getting index we want to delete
    int indexToDelete = -1;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == numToRemove) {
            indexToDelete = i;
            break;
        }
    }

    if (indexToDelete != -1) {
        //copying all elements without numbers[indexToDelete] element
        int currInd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i != indexToDelete) {
                newNumbers[currInd] = numbers[i];
                currInd++;
            }
        }

        //printing the array
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.print(newNumbers[i] + " ");
        }
    } else {
        System.out.println("Number Is Not In The Array");
    }
}