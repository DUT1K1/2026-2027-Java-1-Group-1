void main() {
    for (int i = 1; i <= 15; i++) {
        if (i == 5 || i == 7 || i == 11) {
            continue;
        }
        if (i % 2 == 1) {
            System.out.println(i);
        }
    }
}