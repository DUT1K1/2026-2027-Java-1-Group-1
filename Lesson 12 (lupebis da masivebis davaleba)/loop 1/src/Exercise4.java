void main() {
    int a = 16;
    int b = 64;

    while (a != b) {
        if (a > b) {
            a -= b;
        }
        if (b > a) {
            b -= a;
        }
    }
    System.out.println(a);
    System.out.println(b);
}