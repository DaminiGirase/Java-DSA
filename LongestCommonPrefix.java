public class LongestCommonPrefix {

    public static String LongCommonPreffix(String strs[]){

         int min = Integer.MAX_VALUE;

        for (int i = 0; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }

        String ans = "";
        for (int j = 0; j < min; j++) {
            char ch = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if(strs[i].charAt(j) != ch){
                    return ans;
                }
            }

            ans += ch;
        }
        return ans;
    }
    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight" };

        System.out.println(LongCommonPreffix(strs));
       
    }
}
