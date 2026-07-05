import java.util.*;

public class sumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int num = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        // while (true) {
        //     System.out.println("Enter num: ");
        //     int num = sc.nextInt();
        //     if (num % 2 == 0) {
        //         evenSum += num;
        //     } else {
        //         oddSum += num;
        //     }

        //     System.out.println("Even sum is: " + evenSum);
        //     System.out.println("Odd sum is: " + oddSum);
            
        //     if(num == 0){
        //          break;
        //     }
        // }

        // second aproach

       for(int i=0; i<num; i++){
        System.out.println("Enter numbers: ");
        int input = sc.nextInt();
         if(input %2 == 0){
            evenSum += input;
         }else{
            oddSum += input;
         }
       }

        System.out.println("Even sum is: " + evenSum);
        System.out.println("Odd sum is: " + oddSum);
    }
}
