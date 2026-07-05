import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(" Not Prime number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print( i + " ");
               isPrime = false;
            }
        }
       
        if(isPrime == true){
            System.out.println("Prime");
        }else{
            System.out.println("Not a prime");
        }
    }

}