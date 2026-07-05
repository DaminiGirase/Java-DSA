public class RecursionExcercise {

    // Q 01

    // public static void countOcurance(int arr[], int index, int key){
    // if(index == arr.length){
    // return;
    // }

    // if(arr[index] == key){
    // System.out.print(index + " ");
    // }

    // countOcurance(arr, index+1, key);
    // }

    // Q 02

    // public static int stringLength(String str, int i) {

    // if (i == str.length()) {
    // return 0;
    // }

    // return 1 + stringLength(str, i + 1);
    // }

    // Q 03

    // public static void numberToString(String str[], int n) {

    // if (n == 0) {
    // return;
    // }

    // int digits = n % 10;
    // numberToString(str, n / 10);

    // System.out.print(str[digits] + " ");
    // }

    // Q 04

    // public static int TowerOfHanoi(int n, char source, char destination, char
    // helper) {
    // if (n == 0) {
    // return 0;
    // }

    // int count = 0;

    // count += TowerOfHanoi(n - 1, source, helper, destination);

    // System.out.println(n + " Moves From " + source + " To " + destination);
    // count++;

    // count += TowerOfHanoi(n - 1, helper, destination, source);

    // return count;
    // }

    // Q sum of digits if greater than 10 again sum

    // public static int sumofDigits(int n) {
    // if (n < 10) {
    // return n;
    // }
    // int sum = 0;
    // while (n > 0) {
    // sum += n % 10;
    // n /= 10;
    // }

    // return sumofDigits(sum);
    // }

    // Q sum of digits

    // public static int sumofDigits(int n) {

    // if (n == 0) {
    // return 0;
    // }

    // return n % 10 + sumofDigits(n / 10);

    // }

    // public static int countDigits(int n) {
    // if (n == 0) {
    // return 0;
    // }

    // return 1 + countDigits(n/10);
    // }

    // palindrom of string

    // public static boolean isPalindrom(String str, int i){
    // if(i == str.length()){
    // return false;
    // }

    // if(str.charAt(i) == str.charAt(str.length()-i-1)){
    // return true;
    // }

    // return isPalindrom(str, i+1);
    // }

      // Q same character at first and last

    public static int subString(String str, int i, int j) {
        if (i == str.length()) {
            return 0;
        }

        int count = 0;

        if (j == str.length()) {
           return subString(str, i + 1, i + 1);
           
        }

        if (str.charAt(i) == str.charAt(j)) {
            System.out.println(str.substring(i, j + 1));
            count = 1;
        }

        
        return count + subString(str, i, j + 1);
    }

    static int count = 0;
    public static int countOcurance(int arr[], int index, int key){
        if(index == arr.length){
            return count;
        }

        if(arr[index] == key){
            count++;
        }
        return countOcurance(arr, index+1, key);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 3, 2, 7, 2, 2};
       System.out.println( countOcurance(arr, 0, 3));

        // String str = "damini";
        // System.out.println(stringLength(str, 0));

        // String str[] = {"zero", "one", "two", "three", "four", "five", "six",
        // "seven", "eight", "nine"};
        // int n = 1947;
        // numberToString(str, n);

        // System.out.println(TowerOfHanoi(3, 'A', 'C', 'B'));

        // System.out.println(sumofDigits(1453));

        // System.out.println(countDigits(1234));

        // String str = "girase";
        // System.out.println(isPalindrom(str, 0));

        // Q same character at first and last

        // String str = "abcab";
        // int count = 0;

        // for (int i = 0; i < str.length(); i++) {
        // for (int j = i; j < str.length(); j++) {

        // if(str.charAt(i) == str.charAt(j)){
        // System.out.println(str.substring(i, j+1));
        // count++;
        // }
        // }

        // }

        // System.out.println("Total: " + count);

    //     String str = "abcab";
    //    System.out.println(subString(str, 0, 0)); 
    }
}
