void main() {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int numToGuess = random.nextInt(1, 101);

    int userNumber = scanner.nextInt();
    while (userNumber != numToGuess) {
        if (userNumber < numToGuess) {
            System.out.println("Try Higher!");
            userNumber = scanner.nextInt();
        }
        if (userNumber > numToGuess) {
            System.out.println("Try Lower!");
            userNumber = scanner.nextInt();
        }
    }
    System.out.println(userNumber + " was the correct answer!");
}