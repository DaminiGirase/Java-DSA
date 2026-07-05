import java.util.*;

public class pairSum2Arraylist {

    public static boolean isPresent(ArrayList<Integer> list, int target, int n) {

        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int si = bp + 1;
        int ei = bp;

        while (si != ei) {
            if (list.get(si) + list.get(ei) == target) {
                return true;
            } else if (list.get(si) + list.get(ei) < target) {
                si = (si + 1) % n;
            } else {
                ei = (n + ei - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 100;
        int n = list.size();

        if (isPresent(list, target, n)) {
            System.out.println("Present");
        } else {
            System.out.println("not");
        }

    }

}
