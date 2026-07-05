// import java.util.*;

public class whileLoop {

    public static void main(String[] args) {

        // remove last digit

        // while (num>0) {
        // System.out.println(num);
        // int i = num%10;
        // num/=10;
        // }

        // int num = 1234;
        // int prev = num % 10;
        // num /= 10;
        // boolean increasing = true;
        // while (num > 0) {
        // int curr = num % 10;
        // if (curr >= prev) {
        // increasing = false;

        // }
        // prev = curr;
        // num /= 10;
        // }

        // if(increasing){
        // System.out.println("Increasing");
        // }else{
        // System.out.println("Decreasing");
        // }

        // int num = 2232;

        // boolean isEven = true;
        // while (num!=0) {
        // int i = num%10;
        // if(i%2 == 1){
        // isEven = false;
        // }
        // num/=10;
        // }

        // if(isEven){
        // System.out.println("Even");
        // }else{
        // System.out.println("odd");
        // }

        // int num = 233344442;
        // int digit = 3;
        // int count = 0;
        // while (num != 0) {
        // int j = num%10;

        // if(j == digit){
        // count++;
        // }
        // num/=10;
        // }

        // System.out.println(count);

        // second largest ------------

        // int max = -1;
        // int secondMax = -1;
        // int num = 454455;

        // while (num != 0) {
        // int curr = num % 10;
        // if (curr > max) {
        // secondMax = max;
        // max = curr;
        // }else if(curr > secondMax && curr != max){
        // secondMax = curr;
        // }
        // num /= 10;
        // }
        // System.out.println(secondMax);

        // int num = 1221;
        // int temp = num;
        // int rev = 0;
        // while (num != 0) {
        // rev = rev * 10 + num % 10;
        // num /= 10;
        // }

        // if (temp == rev) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("no");
        // }

        // second small-----------------------------

        // int minFirst = Integer.MAX_VALUE;
        // int minSecond = Integer.MAX_VALUE;
        // int num = 2345415;

        // while (num!=0) {
        // int curr = num%10;
        // if(curr < minFirst){
        // minSecond = minFirst;
        // minFirst = curr;
        // }else if(curr < minSecond && curr != minFirst){
        // minSecond = curr;
        // }
        // num/=10;
        // }
        // System.out.println(minSecond);

        // differance sum of even and odd

        // int num = 223;
        // int evenSum = 0;
        // int oddSum = 0;
        // while (num>0) {
        // int i = num%10;
        // if(i%2 == 0){
        // evenSum += i;
        // }else{
        // oddSum += i;
        // }
        // num/=10;
        // }

        // System.out.println(evenSum-oddSum);

        // int sum = 0;
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
        // int n = sc.nextInt();
        // sum = 0;
        // while (n > 0) {
        // int i = n % 10;
        // sum += i;
        // n /= 10;
        // }

        // System.out.println(sum);

        // }

        // third larges digit

        // int num = 25646784;
        // int largest = -1;
        // int second = -1;
        // int third = -1;

        // while (num > 0) {
        // int curr = num % 10;

        // if (curr > largest) {
        // second = largest;
        // largest = curr;
        // } else if (curr > second && curr != largest) {
        // third = second;
        // second = curr;
        // }else if(curr > third && curr != second){
        // third = curr;
        // }
        // num/=10;
        // }
        // System.out.println(third);

        // int num = 145;
        // int temp = num;
        // int sum = 0;

        // while (num > 0) {
        // int j = num % 10;

        // int fact = 1;
        // int i = j;
        // while (i > 0) {
        // fact = fact * i;
        // i--;
        // }
        // sum += fact;
        // num /= 10;
        // }

        // if (sum == temp) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("no");
        // }

        // ------------------------------------

        // int num = 489765;
        // int digit = 9;
        // int result = 0;

        // while (digit >= 0) {
        // int temp = num;
        // while (temp > 0) {
        // int i = temp % 10;
        // if (digit == i) {
        // result = result * 10 + i;
        // }
        // temp /= 10;
        // }
        // digit--;
        // }

        // int greatest = result;
        // int prev = greatest % 10;
        // greatest /= 10;

        // int povot = -1;
        // while (greatest > 0) {
        // int curr = greatest % 10;

        // if (curr > prev) {
        // povot = curr;
        // break;
        // }
        // prev = curr;
        // greatest/=10;
        // }

        // int remaining = greatest/10;
        // int secondGreater = remaining*10+prev;
        // secondGreater = secondGreater*10+povot;

        // System.out.println(secondGreater);

        // ------------------------------------------------------

        // int last = greatest%10;
        // greatest/=10;
        // int second = greatest%10;
        // greatest/=10;

        // int s = greatest;
        // int secondGreat = s*10 +last;
        // secondGreat = secondGreat*10 + second;

        // System.out.println(result);
        // System.out.println(secondGreat);

        // int num = 31542;
        // int digit = 0;
        // int result = 0;
        // while (digit <= 9) {
        // int temp = num;
        // while (temp > 0) {
        // int i = temp%10;
        // if(digit == i){
        // result = result*10 + i;
        // }
        // temp/=10;
        // }
        // digit++;
        // }

        // ------------------------------------------------------

        // int num = 3567;
        // while (num>0) {
        // int i = num%10;
        // System.out.println(i);
        // num/=10;
        // }
        // ------------------------------------------
        // int num = 12453;
        // int prev = num%10;
        // num/=10;
        // boolean s = true;
        // while (num>0) {
        // int curr = num%10;
        // if(prev == curr){
        // s = false;
        // }
        // prev = curr;
        // num/=10;
        // }

        // if(s){
        // System.out.println("true");
        // }else{
        // System.out.println("false");
        // }

        // replace 0 with 5

        // one way------------

        // int num = 345000005;
        // int number = 0;
        // int place = 1;

        // while (num > 0) {
        // int i = num % 10;
        // if (i == 0) {
        // i = 5;
        // }
        // number = number + i * place;
        // place *= 10;
        // num /= 10;
        // }

        // second way------------------------
        // int original = 0;
        // while (number>0) {
        // original = original*10+number%10;
        // number/=10;
        // }
        // System.out.println(number);

        // int num = 1234;
        // int last = num % 10;
        // num /= 10;
        // int temp = num;
        // int place = 1;

        // while (temp > 0) {
        //     place *= 10;
        //     temp /= 10;
        // }
        // int rotate = place * last + num;
        // System.out.println(rotate);

        // int num = 123;
        // int newAdd = 456;
        // int place = 1;
        // int s = 0;

        // while (newAdd>0) {
        //     int i=newAdd%10;
        //      s = s*10+i;
        //     place*=10;
        //     newAdd/=10;
        // }

        // int newN = num*place+s;
        // System.out.println(newN);

        // int num = 13456;
        // int prev1 = num%10;
        // num/=10;
        // int prev2 = num%10;
        // num/=10;

        // boolean d = false;
        // while (num>0) {
        //     int curr1 = num%10;
        //     num/=10;
        //     int curr2 = num%10;
        //     num/=10;
        //     if(prev1 == curr1 && prev2 == curr2){
        //           d = true;
        //     }

        //     prev1 = curr1;
        //     prev2 = curr2;
        // }

        // if(d){
        //     System.out.println("True");
        // }else{
        //     System.out.println("False");
        // }


        // int num = 12345;
        // int prev = num%10;
        // num/=10;
        // boolean t = false;

        // while (num>0) {
        //     int curr = num%10;
        //     if(prev%2==0 && curr%2!=0){
        //            t = true;
        //            break;
        //     }
        //     prev = curr;
        //     num/=10;
        // }

        // if(t){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("no");
        // }

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print("  ");
            }
             for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
             for(int j=1; j<i; j++){
                System.out.print("* ");
            }

           System.out.println();
        }

         for(int i=3; i>=1; i--){
            for(int j=1; j<=4-i; j++){
                System.out.print("  ");
            }
             for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
             for(int j=1; j<i; j++){
                System.out.print("* ");
            }

           System.out.println();
        }
    }
}