void main() {
    String binary = "";
    int decimal = 14;
    while (decimal > 0) {
        int remainder = decimal % 2;
        binary = remainder + binary;
        decimal /= 2;
    }

    int binNum = Integer.parseInt(binary);

    int position = 0;
    while (binNum > 0) {
        int lastDigit = binNum % 10;
        if (lastDigit == 1) {
            System.out.print((int)Math.pow(2, position) + " ");
        }

        position++;
        binNum /= 10;
    }
}