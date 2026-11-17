public class Numbers {
    public int add(int a, int b) {
        return a + b;
    }

    public void printSum(int a, int b) {
        System.out.println(add(a, b));
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int result = n * factorial(n - 1);
        return result;
    }

    public void badRecursion() {
        badRecursion();
    }
}
