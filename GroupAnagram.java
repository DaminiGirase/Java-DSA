import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {

        String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String word : str) {
            char ch[] = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        System.out.println(map.values());
    }
}
