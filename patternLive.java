public class patternLive {
    public static void main(String[] args) {
        int n = 5;

        // horizonta line

        // for (int i = 1; i <= n; i++) {
        // System.out.print("* ");
        // }

        // // vertical line

        // for (int i = 1; i <= n; i++) {
        // System.out.println("* ");
        // }

        // // hrizontal from bottem

        // for (int i = 5; i >= 1; i--) {
        // System.out.print("* ");
        // }

        // box pattern

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 || i == n || j == 1 || j == n)
        //             System.out.print("* ");
        //         else
        //             System.out.print("  ");
        //     }
        //     System.out.println();
        // }

        // D pattern 

        //  for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 || i == n || j == n/2 || j == n)
        //             System.out.print("* ");
        //         else
        //             System.out.print("  ");
        //     }
        //     System.out.println();
        // }

        // right upwords triangle

          for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (i+j <= n+1 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
