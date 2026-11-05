void main() {
    int[] arr = {4, 9, 2, 9, 7};

    int max = -2_000_000_000;
    int secondMax = -2_000_000_000;

    //
    // max = 9
    // secondMax = 7
    for (int x : arr) {
        if (x > max) {
            secondMax = max;
            max = x;
        } else if (x > secondMax && x != max) {
            secondMax = x;
        }
    }

    System.out.println(secondMax + " (" +
            max + " უდიდესია, ხოლო მეორე უდიდესი არის " + secondMax + ")");
}