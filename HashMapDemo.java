import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        // 1 HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("China", 100);
        map.put("Us", 50);

        System.out.println("HM " + map);

        // 2 LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("China", 100);
        lhm.put("Us", 50);

        System.out.println("LHM " + lhm);

         // 3 TreeMap
        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("India", 150);
        thm.put("China", 100);
        thm.put("Us", 50);

        System.out.println("THM " + thm);

        // one way

        // Set<String> k = map.keySet();
        // for (String key : k) {
        // System.out.println(key + " -> " + map.get(key));
        // }

        // second way

        // for (String k : map.keySet()) {
        // System.out.println(k + " -> " + map.get(k));
        // }

        // third way

        // for (Map.Entry<String, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + "->" + entry.getValue());
        // }

        // System.out.println(map);
        // System.out.println(map.get("India"));
        // System.out.println(map.containsKey("Us"));
        // System.out.println(map.remove("China"));

        // System.out.println(map);

        // System.out.println(map.size());
        // System.out.println(map.isEmpty());

    }
}