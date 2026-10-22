void main(String[] args) {
    // exercise 1
    // {10, 20, 30, 40}
    // 100
//    int[] sumArray = {10, 20, 30, 40};
//    int sum = 0;
//    for (int x : sumArray) {
//        sum += x;
//    }
//    System.out.println(sum);

    // exercise 2
    // {12, 4, 19, 7, 23}
    // 23
//    int[] maxNum = {12, 4, 19, 7, 23};
//    int max = maxNum[0];
//    for (int curr : maxNum) {
//        if (curr > max) {
//            max = curr;
//        }
//    }
//    System.out.println(max);

    // Exercise 3
    // {12, 4, 19, 7, 23}
    // 23 7 19 4 12
//    int[] arr = {12, 4, 19, 7, 23};
//    for (int i = arr.length - 1; i >= 0; i--) {
//        System.out.print(arr[i] + "\t");
//    }


    // Exercise 4
    // {12, 19, 23, 1}
//    int[] sumArray = {12, 19, 23, 1};
//    int sum = 0;
//    for (int x : sumArray) {
//        sum += x;
//    }
//    double avg = sum / (double) sumArray.length;
//    System.out.println("Avg: " + avg);

    // Exercise 5
    // {12, 19, 23, 1}
    // Even: 1, Odd: 3
//    int[] arr = {12, 19, 23, 1};
//    int even = 0;
//    int odd = 0;
//    for (int x : arr) {
//        if (x % 2 == 0) {
//            even++;
//        } else {
//            odd++;
//        }
//    }
//    System.out.println("Even: " + even + ", Odd: " + odd);

    // Exercise 6
    // {1,2,3}
    // {5,6,7}
    // {1,2,3,5,6,7}
//    int[] arr1 = {1,2,3};
//    int[] arr2 = {5,6,7};
//    int[] merged = new int[arr1.length + arr2.length];
//    for (int i = 0; i < arr1.length; i++) {
//        merged[i] = arr1[i];
//    }
//    for (int i = 0; i < arr2.length; i++) {
//        merged[arr1.length + i] = arr2[i];
//    }
//    System.out.println(Arrays.toString(merged));


    // Exercise 7
    // {10, 20, 30}, 20
//    int[] arr = {10, 20, 30};
//    int search = 10;
//    boolean found = false;
//
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == search) {
//            System.out.println("Found at index: " + i);
//            found = true;
//            break;
//        }
//    }
//
//    if (!found) {
//        System.out.println("Not found!");
//    }


    // Exercise 8
    // {1,2,3} -> Array is sorted
    // {3,1,2} -> Array is not sorted
    int[] arr = {1,2,3,0};
    boolean sorted = true;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i - 1] > arr[i]) {
            sorted = false;
            break;
        }
    }
    if (sorted) {
        System.out.println("Array is sorted");
    } else {
        System.out.println("Array is not sorted");
    }
}