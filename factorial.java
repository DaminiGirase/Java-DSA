import java.util.*;

public class factorial {

    static int factorial1(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial1(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rum = sc.nextInt();


       int n = factorial1(num);
       int r = factorial1(rum);
       int n_r = factorial1(num-rum);

       int binomial = n / (r * n_r);
       System.out.println(binomial);
    }

}