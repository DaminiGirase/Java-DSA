public class averageOfThree {

    // average

    // public static int average(int a, int b, int c){
    // int sum = a+b+c;
    // return (int)(sum/3);
    // }

    // even odd

    // public static boolean isEven(int n) {
    // if (n % 2 == 0) {
    // return true;
    // }

    // return false;
    // }

    // palindrom

    // public static void isPalindrom(int n) {
    // int rev = 0, temp;

    // temp = n;
    // while (n > 0) {
    // rev = rev * 10 + n % 10;
    // n /= 10;
    // }

    // if (temp == rev) {
    // System.out.println("Number is Palindrom!");
    // } else {
    // System.out.println("Number is not Palindrom!");
    // }
    // }

    // sum of digits

    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        // System.out.println( average(2, 3, 4));

        // System.out.println(isEven(12));

        // isPalindrom(347);

        System.out.println("Sum of Digits: " + sumOfDigits(1234));

    }
}
