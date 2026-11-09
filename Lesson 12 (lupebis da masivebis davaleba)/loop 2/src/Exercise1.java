void main() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    double sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    System.out.println(sum / n);
}