import java.util.*;

public class trianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Q 1 st

        // char ch = 'A';

        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(ch++ + " ");
        // }
        // System.out.println();
        // }

        // Q 2 nd

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++)
        // System.out.print(" ");
        // for (int k = 1; k <= i; k++)
        // System.out.print("* ");
        // System.out.println();
        // }

        // for (int i = n - 1; i >= 1; i--) {
        // for (int j = 1; j <= n - i; j++)
        // System.out.print(" ");
        // for (int k = 1; k <= i; k++)
        // System.out.print("* ");
        // System.out.println();
        // }

        // Q 3 rd

        // for (int i = 1; i <= 1; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i < n; i++) {
        // for (int j = 1; j <= 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            for (int k = 1; k <= n; k++)
                System.out.print("* ");

            System.out.println();
        }

    }
}
