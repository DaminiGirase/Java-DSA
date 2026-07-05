import java.util.*;

public class functions {

    public static int binomial(int n, int r){
        int f = 1, b = 1, c = 1;

        for(int i=1; i<=n; i++){
            f = f * i;
        }

         for(int i=1; i<=r; i++){
            b = b * i;
        }

         for(int i=1; i<=n-r; i++){
            c = c * i;
        }
    
        return (f / (b * c));
        

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n and r: ");
    int n = sc.nextInt();
    int r = sc.nextInt();

    System.out.println("Binomial Coefficient: " + binomial(n, r));
}
    
}