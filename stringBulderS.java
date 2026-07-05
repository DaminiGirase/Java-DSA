// import java.util.Arrays;

public class stringBulderS {

    // Introduction to StringBuilder

    // public static void stringbuilder() {
    // StringBuilder sb = new StringBuilder(" ");

    // for (char ch = 'a'; ch <= 'z'; ch++) {
    // sb.append(ch);
    // }
    // System.out.println(sb + " ");
    // }

    // reverse words in String

    // public static void reverse(String words[]) {

    // int left = 0;
    // int right = words.length - 1;

    // while (left <= right) {
    // String temp = words[left];
    // words[left] = words[right];
    // words[right] = temp;

    // left++;
    // right--;
    // }

    // }

    // first letter Capital

    // public static String capitalFirst(String str) {
    // StringBuilder sb = new StringBuilder("");

    // char ch = Character.toUpperCase(str.charAt(0));
    // sb.append(ch);

    // for (int i = 1; i < str.length(); i++) {
    // if (str.charAt(i) == ' ' && i < str.length() - 1) {
    // sb.append(str.charAt(i));
    // i++;
    // sb.append(Character.toUpperCase(str.charAt(i)));
    // } else {
    // sb.append(str.charAt(i));
    // }
    // }
    // return sb.toString();

    // }

    // remove duplications from string

    // public static String remove(String str) {
    //     StringBuilder sb = new StringBuilder(" ");
       
    //      char arr[] = str.toCharArray();
    //      Arrays.sort(arr);

    //        for (int i = 0; i < str.length(); i++) {  
    //         Integer count = 1;
    //         while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
    //             count++;
    //             i++;
    //         }
    //         sb.append(arr[i]);
    //         if (count > 1) {
    //             sb.append(count.toString());
    //         }
    //     }

    //     return sb.toString();
    // }

    public static void remove(String str){
           int freq[] = new int[26];

        for (int i = 0; i < str.length(); i++) {     
            freq[str.charAt(i) - 'a']++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] >= 1){
               System.out.print((char)(i + 'a'));
            }
        }

    }

    public static void main(String[] args) {

        String str = "aaabdddbaaccceeedd";
          remove(str);
       


        // String str = "hi i am damini girase";
        // System.out.println(capitalFirst(str));

        // String words[] = str.split(" ");
        // reverse(words);

        // for(int i=0; i<words.length; i++){
        // System.out.print(words[i] + " ");
        // }

        // stringbuilder();
    }
}
