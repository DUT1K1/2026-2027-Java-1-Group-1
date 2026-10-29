void main(String[] args) {
    // 16)
//    int[] prices = {1,5,9,2,10,7};
//    int minPrice = prices[0];
//    int maxPrice = prices[0];
//    int minIndex = 0;
//    int maxIndex = 0;
//
//    for (int i = 0; i < prices.length; i++) {
//        if (prices[i] < minPrice) {
//            minPrice = prices[i];
//            minIndex = i;
//        }
//        if (prices[i] > maxPrice) {
//            maxPrice = prices[i];
//            maxIndex = i;
//        }
//    }
//
//    System.out.println(
//            minIndex + " მაღაზიაში ყველაზე იაფია" +
//                    "და ღირს " + minPrice + " ლარი"
//    );
//    System.out.println(
//            maxIndex + " მაღაზიაში ყველაზე ძვირია" +
//                    "და ღირს " + maxPrice + " ლარი"
//    );


    // 17)
//    for (int i = 0; i <= 100; i++) {
//        if (i % 5 == 0 && i % 7 == 0) {
//            System.out.println("HEYHOW");
//        } else if (i % 7 == 0) {
//            System.out.println("HOW");
//        } else if (i % 5 == 0) {
//            System.out.println("HEY");
//        } else {
//            System.out.println(i);
//        }
//    }


    // 18)
//    Scanner sc = new Scanner(System.in);
//    Random rand = new Random();
//
//    System.out.print(
//            "გთხოვთ შეარჩიოთ რიგების რაოდენობა: "
//    );
//    int rows = sc.nextInt();
//    System.out.print(
//            "გთხოვთ შეარჩიოთ სვეტების რაოდენობა: "
//    );
//    int cols = sc.nextInt();
//
//    int[][] array = new int[rows][cols];
//    for (int i = 0; i < rows; i++) {
//        for (int j = 0; j < cols; j++) {
//            array[i][j] = rand.nextInt(101);
//        }
//    }
//
//    System.out.println("თქვენი მასივია:");
//    for (int i = 0; i < rows; i++) {
//        for (int j = 0; j < cols; j++) {
//            System.out.print(array[i][j] + "\t");
//        }
//        System.out.println();
//    }
//
//    int min = array[0][0];
//    int max = array[0][0];
//    int minRow = 0, minCol = 0;
//    int maxRow = 0, maxCol = 0;
//
//    for (int i = 0; i < rows; i++) {
//        for (int j = 0; j < cols; j++) {
//            if (array[i][j] > max) {
//                max = array[i][j];
//                maxRow = i;
//                maxCol = j;
//            }
//            if (array[i][j] < min) {
//                min = array[i][j];
//                minRow = i;
//                minCol = j;
//            }
//        }
//    }
//
//    System.out.println(
//            "მინიმალური ელემენტია: " + min + " ინდექსზე ("
//            + minRow + ", " + minCol + ")"
//    );
//    System.out.println(
//            "მაქსიმალური ელემენტია: " + max + " ინდექსზე ("
//                    + maxRow + ", " + maxCol + ")"
//    );


    // 19)
//    Scanner sc = new Scanner(System.in);
//    Random rand = new Random();
//
//    System.out.print(
//            "გთხოვთ შეარჩიოთ n: "
//    );
//    int n = sc.nextInt();
//
//    int[][] array = new int[n][n];
//    for (int i = 0; i < n; i++) {
//        for (int j = 0; j < n; j++) {
//            array[i][j] = rand.nextInt(10);
//        }
//    }
//
//    System.out.println("თქვენი მასივია:");
//    for (int i = 0; i < n; i++) {
//        for (int j = 0; j < n; j++) {
//            System.out.print(array[i][j] + "\t");
//        }
//        System.out.println();
//    }
//
//    int diagonalSum = 0;
//    for (int i = 0; i < n; i++) {
//        diagonalSum += array[i][i];
//        diagonalSum += array[i][n - i - 1];
//    }
//
//    if (n % 2 == 1) {
//        diagonalSum -= array[n/2][n/2];
//    }
//
//    System.out.println(diagonalSum);


    // 20)
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.print(
            "გთხოვთ შეარჩიოთ n: "
    );
    int n = sc.nextInt();

    int[][] array = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            array[i][j] = rand.nextInt(10);
        }
    }

    System.out.println("თქვენი მასივია:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(array[i][j] + "\t");
        }
        System.out.println();
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            int temp = array[i][j];
            array[i][j] = array[j][i];
            array[j][i] = temp;
        }
    }

//    System.out.println("მასივის ტრანსპოზიცია:");
//    for (int i = 0; i < n; i++) {
//        for (int j = 0; j < n; j++) {
//            System.out.print(array[i][j] + "\t");
//        }
//        System.out.println();
//    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n / 2; j++) {
            int temp = array[i][j];
            array[i][j] = array[i][n - j - 1];
            array[i][n - j - 1] = temp;
        }
    }

    System.out.println("მობრუნებული მასივი:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(array[i][j] + "\t");
        }
        System.out.println();
    }
}