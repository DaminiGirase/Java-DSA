import java.util.HashMap;

public class IternaryTicket {

    public static String getStart(HashMap<String, String> map) {

        // one way TC = O(n^2) for searching key

        // for (String key : map.keySet()) {
        // if (!map.containsValue(key)) {
        // System.out.println(key);
        // return key;
        // }
        // }
        // return null;

        // another way TC = O(n)

        HashMap<String, String> revMap = new HashMap<>();
        for (String key : map.keySet()) {
            revMap.put(map.get(key), key);
        }

        for (String key : map.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = getStart(map);
        System.out.print(start);
        for (String key : map.keySet()) {
            System.out.print(" -> " + map.get(start));
            start = map.get(start);
        }

        System.out.println();
    }
}
