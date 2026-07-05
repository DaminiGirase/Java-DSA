public class rohmbus {
    public static void main(String[] args) {

        // solid rohmbus

        // int row = 5;
        // int col = 10;

        // for(int i=1; i<=row; i++){

        //     for(int j=1; j<=col; j++){
        //         if((i+j) <= col/2){
        //             System.out.print("  ");
        //         }
        //     }

        //         for(int j=(col/2)+1; j<=col; j++) {
        //                System.out.print("* ");
        //         } 

        //     System.out.println();
        // }

        // hollow Rohmbus

        // int n=5;

        // for(int i=1; i<=n; i++){
     
        //     for(int j=1; j<=(n-i); j++){
        //         System.out.print("  ");
        //     }

        //     for(int j=1; j<=n; j++){
        //         if(i==1 || i==n || j==1 || j==n){
        //              System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }

        //     System.out.println();
        // }

        // number pattern

        // int n = 5;

        // for(int i=n; i>=1; i--){
        //     for(int j=n; j>=1; j--){
        //         if(i+j <= n+1){
        //             System.out.print(j +  " ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // number palindrom diamond

        int n = 5;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }

            for(int j=i-1; j>=1; j--){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
