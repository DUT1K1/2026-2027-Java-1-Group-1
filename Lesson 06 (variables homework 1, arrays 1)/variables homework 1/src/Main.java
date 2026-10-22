void main() {
    // 1.1)
//    int a = 10;
//    int b = 20;
//
//    int c = a;
//    a = b;
//    b = c;
//    System.out.println("a = " + a);
//    System.out.println("b = " + b);

    // 1.2)
//    int a = 10;
//    int b = 20;
//
//    a = a + b;
//    b = a - b;
//    a = a - b;

    // 2)
//    float x = 10.234f;
//    int y = (int) x;
//    System.out.println(x - y);
//    System.out.println(10.234 % 1);

    // 3)
//    int x = 123;
//    if (x >= 100 && x <= 999) {
//        System.out.println(true);
//    } else {
//        System.out.println(false);
//    }
//
//    int n = 345;
//    boolean f = (n >= 100 && n <= 999) || (n <= -100 && n >= -999);
//    System.out.println(f);

    // 4)
//    char r = 'r';
//    char capitalR = (char) (r - 32);
//    System.out.println(capitalR);


    // 5)
//    double a = 11.5;
//    int result = (int) (a + 0.5);
//    System.out.println(result);


    // 6)
//    int a = 8;
//    int b = 1;
//    double k = 3;

//    int sideA = (a + k - 1) / k;
//    int sideB = (b + k - 1) / k;
//    System.out.println(sideA * sideB);

//    int sideA = (int) Math.ceil(a / k);
//    int sideB = (int) Math.ceil(b / k);
//    System.out.println(sideA * sideB);


    // 7) ამ დავალებაში დრო უნდა ჩავასწორო
//    int seconds = 3675;
//    int hours = 0;
//    int minutes = 0;
//
//    if (seconds >= 3600) {
//        hours = seconds / 3600;
//        seconds %= 3600;
//    }
//    if (seconds >= 60) {
//        minutes = seconds / 60;
//        seconds %= 60;
//    }
//    System.out.println(hours + ":" + minutes + ":" + seconds);
//    System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);


    // 8)
    int totalSeconds = 3665;
    int hours = totalSeconds / 3600;
    totalSeconds %= 3600;
    int minutes = totalSeconds / 60;
    int seconds = totalSeconds % 60;

    System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
}