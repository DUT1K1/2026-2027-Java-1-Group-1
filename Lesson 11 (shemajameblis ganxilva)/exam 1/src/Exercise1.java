void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("შეიყვანეთ დადებითი რიცხვი: ");
    int number = scanner.nextInt();

    int sum = 0;
    int count = 0;
    while (number > 0) {
        sum += number % 10;
        count++;
        number /= 10;
    }

    System.out.println("ციფრების ჯამი: " + sum);
    System.out.println("ციფრების რაოდენობა: " + count);
}