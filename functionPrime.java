import java.util.*;

public class functionPrime {

    public static int isPrime(int n) {
        int flag = 1;

        if (n <= 1) {
            System.out.println("Not a Prime");
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }
        return flag;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        primeInRange(n);

        int flag = isPrime(n);
        if (flag == 1) {
            System.out.println("\n Number is Prime");
        } else {
            System.out.println("\n Not a Prime");
        }

    }
}
