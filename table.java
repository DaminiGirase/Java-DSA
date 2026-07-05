import java.util.*;

public class table {
    public static void main(String[] args) {

        System.out.print("Enter a number whose Table you want to print: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            int table = n*i;
            System.out.print(table + " ");
        }
    }
}
