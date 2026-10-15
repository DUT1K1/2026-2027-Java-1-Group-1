void main() {
//    int i = 0;
//    int j = 5;
//    while (i <= j) {
//        System.out.println(i++);
//    }


    // 24       18
    // 6        18
    // 6        12
    // 6        6
//    int a = 24;
//    int b = 18;
//    while (a != b) {
//        System.out.println("a = " + a + ", b = " + b);
//        if (a > b) {
//            a -= b;
//        } else {
//            b -= a;
//        }
//    }
//    System.out.println("a = " + a + ", b = " + b);


//    int i = 1;
//    do {
//        System.out.println(i++);
//    } while (i <= 3);


//    int i = 1;
//    while (i > 0) {
//        System.out.println(i++);
//    }



//    for (int i = 5; i <= 10; i += 2) {
//        System.out.println(i);
//    }





//    int n = 0;
//    int i = 0;
//    while (true) {
//        i++;
//        n += i;
//        System.out.println(n);
//        if (n >= 500) {
//            break;
//        }
//    }


//    for (int i = 0; i < 10; i++) {
//        if (i % 2 == 0) {
//            continue;
//        }
//        System.out.println(i);
//    }

//    System.out.print("hello");
//    System.out.print("I'm David");
    for (int i = 0; i < 6; i++) {
        int x = 0;
        for (int j = 0; j < 5; j++) {
            System.out.print("(" + i + ", " + j + ")\t");
            x = j;
        }
        System.out.print("(" + i + ", " + ++x + ")");
        System.out.println();
    }

}