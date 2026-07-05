public class BackTracking {

    // for Array

    // public static void back(int arr[], int i, int val) {
    //     if (i == arr.length) {
    //         print(arr);
    //         System.out.println();
    //         return;
    //     }

    //     arr[i] = val;
    //     back(arr, i + 1, val + 1);
    //     arr[i] = arr[i] - 2;
    // }

    // public static void print(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    // substring

    // public static void subString(String str, String ans, int i){
    //     if(i == str.length()){
    //         if(ans.length() == 0){
    //             System.out.println("null");
    //         }
    //         System.out.println(ans);
    //         return;
    //     }

    //     subString(str, ans+str.charAt(i), i+1);
    //     subString(str, ans, i+1);
    // }

    // first and last equal

    // public static void subbString(String str, String ans, int i){
    //     if(i == str.length()){
          
    //          if(ans.length() > 0 && ans.charAt(0) == ans.charAt(ans.length()-1)){
    //             System.out.println(ans);
    //         }
           
    //         return;
    //     }

    //     subbString(str, ans+str.charAt(i), i+1);
    //     subbString(str, ans, i+1);

    // }

    // permutations

    // public static void permutation(String str, String ans){
    //     if(str.length() == 0){
    //         System.out.println(ans);
    //         return;
    //     }

    //     for(int i=0; i<str.length(); i++){
    //         char ch = str.charAt(i);
    //         String newString = str.substring(0, i) + str.substring(i+1);
    //         permutation(newString, ans+ch);
    //     }
    // }

    public static void main(String[] args) {

    //     int arr[] = new int[5];
    //     back(arr, 0, 1);
    //     print(arr);

    // String str = "abc";
    // subString(str, "", 0);

    // String str = "abc";
    // permutation(str, "");

    }
}
