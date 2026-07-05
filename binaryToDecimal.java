
public class binaryToDecimal {
    public static void main(String[] args) {

        // Binary to decimail

        // int n = 101;
        // int decimal = 0;
        // int power = 0;

        // while (n > 0) {
        // int num = n % 10;
        // decimal += (int) (num * Math.pow(2, power));
        // power++;
        // n /= 10;
        // }

        // System.out.println("Decimal is: " + decimal);

        int n = 5;
        int power = 0;
        int binary = 0;

        while (n > 0) {
            int rem = n % 2;
            binary = binary + rem * (int) (Math.pow(10, power));
            power++;
            n /= 2;
        }
        System.out.println("Dcimail to Binary: " + binary);
    }
}
