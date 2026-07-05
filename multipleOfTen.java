import java.util.*;

public class multipleOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if(num % 10 == 0){
               continue;
            }
            System.out.println(num);
        }
    }
}
