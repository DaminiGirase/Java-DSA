import java.util.*;
import java.util.LinkedList;

public class WordLadder {
    static class Pair {
        String word;
        int steps;

        public Pair(String word, int steps) {
            this.word = word;
            this.steps = steps;
        }
    }

    public static int WordLadd(String beingWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        Set<String> st = new HashSet<>(wordList);

        q.add(new Pair(beingWord, 1));

        while (!q.isEmpty()) {
            Pair curr = q.remove();
            String word = curr.word;
            int step = curr.steps;

            if (word.equals(endWord) == true) {
                return step;
            }

            for (int pos = 0; pos < word.length(); pos++) {
                char arr[] = word.toCharArray();
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    arr[pos] = ch;

                    String str = new String(arr);
                    if (st.contains(str) == true) {
                        q.add(new Pair(str, step + 1));
                        st.remove(str);
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("log");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        String beingWord = "hit";
        String endWord = "cog";

        System.out.println(WordLadd(beingWord, endWord, wordList));
    }
}