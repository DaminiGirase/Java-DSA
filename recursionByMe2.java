public class recursionByMe2 {

    public static void evenN(int n) {
        if (n == 0) {
            return;
        }

        if (n % 2 != 0) {
            System.out.print(n + " ");
        }

        evenN(n - 1);
    }

    public static void skip3(int n) {
        if (n == 0) {
            return;
        }
        skip3(n - 1);
        if (n % 3 != 0) {
            System.out.print(n + " ");
        }
    }

    public static int sumOfSquare(int n) {
        if (n == 0) {
            return 0;
        }

        return n * n + sumOfSquare(n - 1);
    }

    public static int product(int n) {
        if (n == 0) {
            return 1;
        }

        return n * product(n - 1);
    }

    public static int count(int n) {
        if (n == 0) {
            return 0;
        }

        return 1 + count(n / 10);
    }

    public static int countZero(int n) {
        if (n == 0) {
            return 0;
        }

        int count = (n % 10 == 0) ? 1 : 0;
        return count + countZero(n / 10);
    }

    public static int largestDigit(int n) {
        if (n == 0) {
            return 0;
        }

        int large = n % 10;
        return large > largestDigit(n / 10) ? large : largestDigit(n / 10);

    }

    public static int countEven(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 == 0 ? 1 + countEven(n / 10) : countEven(n / 10);
    }

    public static void reverse(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n % 10);
        reverse(n / 10);
    }

    public static boolean ispalin(int n) {
        return n == rever(n, 0);
    }

    public static int rever(int n, int rev) {
        if (n == 0) {
            return rev;
        }

        return rever(n / 10, rev * 10 + n % 10);
    }

    public static int power(int x, int y) {
        if (y == 0) {
            return 1;
        }

        return x * power(x, y - 1);
    }

    public static void main(String[] args) {
        // skip3(10);

        System.out.println(power(2, 4));
        // System.out.println(sumOfSquare(3));
        // System.out.println(product(3));
        // System.out.println(countEven(2345678));

        // reverse(100);
        // int n = 1232167;
        // System.out.println(ispalin(n));
    }
}
