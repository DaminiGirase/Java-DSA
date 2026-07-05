import java.util.*;
public class Solution {

    static class Pair{
        char ch;
        int freq;

        Pair(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }
    }

    public static String removeDuplicates(String s, int k) {
        
        Stack<Pair> st = new Stack<>();

        for(int i=s.length()-1; i>=0; i--){
            if(!st.isEmpty() && st.peek().ch == s.charAt(i)){
                st.peek().freq++;
                if(st.peek().freq == k){
                    st.pop();
                }
            }else{
                st.push(new Pair(s.charAt(i), 1));
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
           char ch = st.peek().ch;
           int freq = st.peek().freq;
           st.pop();
           for(int i=1; i<=freq; i++){
              sb.append(ch);
           }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
       System.out.println(removeDuplicates("Daaamiiiiniii", 3)); 
    }
}
