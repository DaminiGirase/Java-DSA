public class Recursion {

    // decreasing Order

    // public static void reverse(int n) {
    // if (n == 0) {
    // return;
    // }

    // System.out.print(n + " ");
    // reverse(n - 1);
    // }

    // increasing order

    // public static void increasing(int n) {
    // if (n == 11) {
    // return;
    // }

    // if (n % 2 == 0) {
    // System.out.print(n + " ");
    // }
    // increasing(n + 1);
    // }

    // second way increasing

    // public static void increasing2(int n){
    // if(n == 0){
    // return;
    // }

    // increasing2(n-1);
    // System.out.print(n + " ");
    // }

    // factorial

    // public static int factorial(int n){
    // if(n == 0){
    // return 1;
    // }

    // return n * factorial(n-1);
    // }

    // sum of n numbers

    // public static int sumOfN(int n) {
    // if (n == 0) {
    // return 0;
    // }

    // return n + sumOfN(n - 1);
    // }

    // fibonachi number

    // public static int fibonachi(int n){
    // if(n == 0){
    // return 0;
    // }

    // if(n == 1){
    // return 1;
    // }

    // return fibonachi(n-1) + fibonachi(n-2);
    // }

    // check if array is sorted or not

    // public static boolean array(int arr[], int index) {

    // if (index == arr.length - 1) {
    // return true;
    // }

    // if (arr[index] > arr[index + 1]) {
    // return false;
    // }

    // return array(arr, index+1);
    // }

    // first Occurance

    // public static int firstOccurance(int arr[], int index, int key) {

    // if (index == arr.length-1) {
    // return -1;
    // }

    // if (arr[index] == key) {
    // return index;
    // }

    // return firstOccurance(arr, index + 1, key);
    // }

    // last occurance

    // public static int lastOccurance(int arr[], int index, int key){

    // if(index < 0){
    // return -1;
    // }

    // if(arr[index] == key){
    // return index;
    // }

    // return lastOccurance(arr, index-1, key);
    // }

    // Mam aproach for last occurance

    // public static int lastOccurance(int arr[], int index, int key){
    // if(index == arr.length){
    // return -1;
    // }

    // int isFound = lastOccurance(arr, index+1, key);

    // if(isFound == -1 && arr[index] == key){
    // return index;
    // }
    // return isFound;
    // }

    // print x to the power n

    // public static int nPowerX(int x, int n){
    // return (int) Math.pow(x, n);
    // }

    // mam aproach

    // public static int power(int x, int n){
    // if(n == 0){
    // return 1;
    // }

    // return x * power(x, n-1);
    // }

    // Optimized code of logn complexity

    // public static int OptimizedCode(int x, int n){
    // if(n == 0){
    // return 1;
    // }

    // int half = OptimizedCode(x, n/2);
    // int square = half * half;

    // if(n % 2 != 0){
    // square = x * square;
    // }

    // return square;
    // }

    // Ways to attach tiles

    // public static int Tiles(int n){

    // if(n == 0 || n == 1){
    // return 1;
    // }

    // return Tiles(n-1) + Tiles(n-2);

    // for understanding

    // int vertical = Tiles(n-1);
    // int horizontal = Tiles(n - 2);
    // return vertical+horizontal;
    // }

    // remove duplicates alphabetic output (non recirsion)

    // public static String removeDuplicate(String str) {

    // StringBuilder sb = new StringBuilder();
    // int count[] = new int[26];

    // for (int j = 0; j < str.length(); j++) {
    // char ch = str.charAt(j);
    // count[ch - 'a']++;
    // }

    // for (int k = 0; k < 26; k++) {
    // if (count[k] >= 1) {
    // char ch = (char) (k + 'a');
    // sb.append(ch);
    // }

    // }

    // return sb.toString();
    // }

    // remove duplicates (non recirsion)

    // public static String removeD(String str){
    // StringBuilder sb = new StringBuilder();
    // boolean map[] = new boolean[26];

    // for(int i=0; i<str.length(); i++){
    // char ch = str.charAt(i);

    // if(map[ch - 'a'] == false){
    // sb.append(ch);
    // (map[ch - 'a']) = true;
    // }
    // }
    // return sb.toString();
    // }

    // recursion remove duplicate

    // public static void removeDuplicate(String str, int indx, StringBuilder
    // sb,boolean map[]){

    // if(indx == str.length()){
    // System.out.println(sb);
    // return;
    // }

    // char current = str.charAt(indx);

    // if(map[current - 'a'] == false){
    // sb.append(current);
    // map[current - 'a'] = true;

    // }
    // removeDuplicate(str, indx+1, sb, map);
    // }

    // friends pairing

    // public static int FriendPairing(int n){
    // if(n==1 || n==2){
    // return n;
    // }

    // return FriendPairing(n-1) + (n-1) * FriendPairing(n-2);
    // }

    // Binary String Printing

    public static int BinaryString(int n, int lastdigit, String str) {
        if (n == 0) {
            System.out.println(str);
            return 1;
        }

        int count = 0;
        count += BinaryString(n - 1, 0, str + "0");
        if (lastdigit == 0) {
            count += BinaryString(n - 1, 1, str + "1");
        }

        return count;
    }

    static int max = Integer.MIN_VALUE;

    public static int MaxIn(int arr[], int index) {
        if (index == arr.length) {
            return max;
        }

        if (arr[index] > max) {
            max = arr[index];
        }

        return MaxIn(arr, index + 1);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 8, 80, 90 };
        System.out.println(MaxIn(arr, 0));

        // reverse(5);
        // increasing(1);
        // increasing2(10);

        // System.out.println(factorial(5));
        // System.out.println(sumOfN(4));
        // System.out.println(fibonachi(5));

        // int arr[] = { 1, 9, 4, 5 };
        // System.out.println(array(arr, 0));

        // int arr[] = { 3, 5, 7, 8, 9 , 3, 7};

        // System.out.println(firstOccurance(arr, 0, 7));

        // System.out.println(lastOccurance(arr, 0, 7));

        // System.out.println(nPowerX(2, 4));
        // System.out.println(OptimizedCode(2, 7));

        // int total = Tiles(3);
        // System.out.println(total);

        // String str = "ddaamini";
        // removeDuplicate(str, 0, new StringBuilder(), new boolean[26]);

        // System.out.println(FriendPairing(3));

        // System.out.println(BinaryString(4, 0, new String("")));
    }
}
