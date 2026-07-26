import java.util.*;

public class HashMapExcersice {
    public static void main(String[] args) {
        String str = "aabbbccdddd";
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Character, Integer> entry : list) {
            int freq = entry.getValue();
            while (freq-- > 0) {
                sb.append(entry.getKey());
            }
        }
        System.out.println(sb);
    }
}
