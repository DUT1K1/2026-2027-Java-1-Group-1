void main() {
    int number = 1000;
    int digit = 0;

    while (number > 0) {
        number /= 10;
        digit++;
    }
    System.out.println(digit);
}