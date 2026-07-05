public class pattern {
    public static void main(String[] args) {
        
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=4; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

          int n = 8;
        int row = n * 2 - 1;
        int special = n;
        int star = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= special; j++) {
                System.out.print(" ");
            }

            int mid = star / 2 + 1;
            int num = 1;

            for (int k = 1; k <= star; k++) {

                System.out.print(num);

                if (k < mid) {
                    num++; 
                } else {
                    num--; 
                }
            }

            System.out.println();
            if (i <= row / 2) {
                special--;
                star += 2;
            } else {
                special++;
                star -= 2;
            }

        }
    }
}
