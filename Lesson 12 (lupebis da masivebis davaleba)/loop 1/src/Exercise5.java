void main() {
    int digitSum = 0;
    int currentNum = 0;

    for (int i = 100; i < 1000; i++) {
        currentNum = i;
        while (currentNum != 0) {
            int digit = currentNum % 10;
            digitSum += digit;
            currentNum /= 10;
        }
        if (i % digitSum == 0) {
            System.out.println(i);
        }
        digitSum = 0;
    }
}