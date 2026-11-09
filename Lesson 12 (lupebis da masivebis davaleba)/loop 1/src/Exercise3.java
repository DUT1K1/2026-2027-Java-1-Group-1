void main() {
    int divisor = 2;
    int number = 5;

    if (number == 1) {
        System.out.println("რიცხვი მარტივი არაა!");
    }
    while (divisor < number) {
        if (number % divisor == 0) {
            System.out.println("რიცხვი მარტივი არაა!");
            break;
        }
        divisor++;
    }
    if (number == divisor) {
        System.out.println("რიცხვი მარტივია!");
    }
}