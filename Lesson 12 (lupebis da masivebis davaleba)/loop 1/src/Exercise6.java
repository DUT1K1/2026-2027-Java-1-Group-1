void main() {
    int amount = 15;
    int a = 0;
    int b = 1;
    System.out.println(a);
    System.out.println(b);

    for (int i = 0; i < amount - 2; i++) {
        int newNum = a + b;
        System.out.println(newNum);
        a = b;
        b = newNum;
    }
}