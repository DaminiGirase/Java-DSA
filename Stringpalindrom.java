public class Stringpalindrom {

    // Palindrom in array

    // public static boolean palindromInArray(int nums[]) {
    // for (int i = 0; i < nums.length / 2; i++) {
    // if (nums[i] != nums[nums.length - i - 1]) {
    // System.out.println("No");
    // return false;
    // }
    // }
    // System.out.println("Yes");
    // return true;
    // }

    // Palindrom in String

    // public static boolean palindromInString(String str){
    // for(int i=0; i<str.length(); i++){
    // if(str.charAt(i) != str.charAt(str.length()-i-1)){
    // System.out.println("Not Palindrom");
    // return false;
    // }
    // }
    // System.out.println("Palindrom!");
    // return true;
    // }

    // shotest path

    // public static float shortPath(String str) {

    // int x = 0, y = 0;
    // float totalPath = 0;

    // for (int i = 0; i < str.length(); i++) {
    // if (str.charAt(i) == 'E') {
    // x++;
    // }

    // else if (str.charAt(i) == 'W') {
    // x--;
    // }

    // else if (str.charAt(i) == 'N') {
    // y++;
    // }

    // else {
    // y--;
    // }

    // totalPath = (float) Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
    // }
    // return totalPath;
    // }

    // find largest string alphabetically

    public static void largest(String str[]) {

        String largestS = str[0];
        for (int i = 0; i < str.length; i++) {
            if (largestS.compareTo(str[i]) < 0) {
                largestS = str[i];
            }
        }

        System.out.println(largestS);
    }

    public static void main(String[] args) {

        String str[] = { "apple", "mango", "banana" };
        largest(str);

        // String str = "WNEENESENNN";
        // System.out.println(shortPath(str));

        // System.out.println("DaminiGirase".substring(0, 6));

        // String str = "racecar";
        // palindromInString(str);

        // int nums[] = {1, 2, 2, 1, 6};
        // palindromInArray(nums);
    }
}
