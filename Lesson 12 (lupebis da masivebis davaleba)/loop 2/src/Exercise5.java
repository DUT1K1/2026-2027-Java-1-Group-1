void main() {
    String binary = "";
    int decimal = 23;
    while (decimal > 0) {
        int remainder = decimal % 2;
        binary = remainder + binary;
        decimal = decimal / 2;
    }
    System.out.println(binary);
}