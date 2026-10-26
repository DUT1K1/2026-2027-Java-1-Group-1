void main() {
    // 1
//    double c = 12.42;
//    double f = c * ((double) 9 / 5) + 32;
//    System.out.println(f);


    // 2
//    double f = 54;
//    double c = (f - 32) * (5.0 / 9.0);
//    System.out.println(c);


    // 3
//    int year = 2000;
//    if (year % 400 == 0) {
//        System.out.println("ნაკიანია");
//    } else if (year % 100 == 0) {
//        System.out.println("არაა ნაკიანი!");
//    } else if (year % 4 == 0) {
//        System.out.println("ნაკიანია");
//    } else {
//        System.out.println("არაა ნაკიანი!");
//    }


    // 4
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("გთხოვთ შეიყვანოთ X კოორდინატი: ");
//    int x = scanner.nextInt();
//    System.out.print("გთხოვთ შეიყვანოთ Y კოორდინატი: ");
//    int y = scanner.nextInt();
//    if (x == 0 && y == 0) {
//        System.out.println("სათავეშია");
//    } else if (x == 0) {
//        System.out.println("Y ღერძზეა");
//    } else if (y == 0) {
//        System.out.println("X ღერძზეა");
//    } else if (x > 0 && y > 0) {
//        System.out.println("I");
//    } else if (x < 0 && y > 0) {
//        System.out.println("II");
//    } else if (x < 0 && y < 0) {
//        System.out.println("III");
//    } else if (x > 0 && y < 0) {
//        System.out.println("IV");
//    }


    // 5
    Scanner scanner = new Scanner(System.in);
    System.out.print("გთხოვთ შეიყვანოთ ოპერატორი (+, -, *, /): ");
    String op = scanner.nextLine();
    System.out.print("გთხოვთ შეიყვანოთ პირველი რიცხვი: ");
    int a = scanner.nextInt();
    System.out.print("გთხოვთ შეიყვანოთ მეორე რიცხვი: ");
    int b = scanner.nextInt();

    switch (op) {
        case "+":
            System.out.println(a + b);
            break;
        case "-":
            System.out.println(a - b);
            break;
        case "*":
            System.out.println(a * b);
            break;
        case "/":
            if (b == 0) {
                System.out.println("0-ზე გაყოფა არ შეიძლება!");
                break;
            }
            System.out.println((double) a / b);
            break;
        default:
            System.out.println("ასეთი ოპერაცია არ არსებობს!");
    }
}