public class recursionPattern {

    public static void patternUlta(int i, int j, int n, int m) {
        if (i == 0) {
            return;
        }

        if (j == i - 1) {
            System.out.println();
            patternUlta(i - 1, 0, n, m);
            return;
        }

        System.out.print("* ");
        patternUlta(i, j + 1, n, m);

    }

    public static void patternSidha(int i, int j, int n, int m) {
        if (i == n) {
            return;
        }

        if (j <= i) {
            System.out.print("* ");
            patternSidha(i, j + 1, n, m);
            return;
        }

        System.out.println();
        patternSidha(i + 1, 0, n, m);

    }

    public static void triangle(int i, int j, int row, int special) {
        if (i == row) {
            return;
        }

        if (j < special) {
            System.out.print("* ");
            triangle(i, j + 1, row, special);
            return;
        }
        System.out.println();
        if (i < (row / 2)) {
            triangle(i + 1, 0, row, special + 1);
        } else {
            triangle(i + 1, 0, row, special - 1);
        }

    }

    public static void Apattern(int i, int j, int k, int row, int special, int star) {
        if (i == row) {
            return;
        }

        if (j < special) {
            System.out.print("  ");
            Apattern(i, j + 1, k, row, special, star);
            return;
        }

        if (k < star) {
            System.out.print("* ");
            Apattern(i, j, k + 1, row, special, star);
            return;
        }

        System.out.println();
        if (i < (row / 2)) {
            Apattern(i + 1, 0, 0, row, special - 1, star + 2);
        } else {
            Apattern(i + 1, 0, 0, row, special + 1, star - 2);
        }

    }

    public static void printSub(String str, int i, int j) {
        if (i == str.length()) {
            return;
        }

        if (j <= str.length()) {
            if (j<i) {
                System.out.print(str.substring(i, j) + " ");
            }
            printSub(str, i, j + 1);
            return;
        }

        printSub(str, i + 1, 0);
    }

    public static void main(String[] args) {

        // String str = "damini";
        // printSub(str, 0, 0);

        // patternSidha(0, 0, 3, 3);
        // patternUlta(3, 0, 3, 3);
        int n = 4;
        // triangle(0, 0, 2 * n - 1, 1);

        Apattern(0, 0, 0, 2 * n - 1, n, 1);

        // int n = 3;
        // int row = 2 * n - 1;
        // int special = 1;
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= special; j++) {
        // System.out.print("* ");
        // }

        // if (i <= (row / 2)) {
        // special++;
        // } else {
        // special--;
        // }
        // System.out.println();
        // }
    }
}
