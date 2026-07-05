public class xPattern {
    public static void main(String[] args) {
        int n = 5;

        // X pattern

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(i == j || i+j == n+1){
        //            System.out.print("*");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // next 

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(i+j <= n){
        //             System.out.print("  ");
        //         }else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        // next

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(i+j <= n+1){
        //             System.out.print(j + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        // next

          for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        
    }
}
