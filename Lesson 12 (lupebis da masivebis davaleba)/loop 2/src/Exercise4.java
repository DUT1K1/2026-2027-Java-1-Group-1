void main() {
    Scanner sc = new Scanner(System.in);
    int binaryNum = sc.nextInt();

    int decimalNum = 0;
    int multiplier = 1;

    while (binaryNum > 0) {
        int lastDigit = binaryNum % 10;

        decimalNum += lastDigit * multiplier;
        binaryNum /= 10;
        multiplier *= 2;
    }
    System.out.println(decimalNum);
}