import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int arr[] = { 8, 8, 7, 6, 6, 5, 4, 3, 3 };
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // for(Integer ket : set){
        // System.out.println(ket);
        // }

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
        }

        // for(Integer ket : set1){
        // System.out.println(ket);
        // }

        TreeSet<Integer> set2 = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            set2.add(arr[i]);
        }

        // for (Integer ket : set2) {
        //     System.out.println(ket);
        // }
    }
}
