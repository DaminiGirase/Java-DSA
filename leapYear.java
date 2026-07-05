import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Year: ");
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Leap year!");
        } else {
            System.out.println("Not a Leap Year!");
        }

        int a = 10, b = 20;

        System.out.println(a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);

        char digit = '1';
        int val = digit - '0';
        System.out.println(val);
    }
}
