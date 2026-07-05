import java.util.*;

public class interHiring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt()); 
            }

            String str = sc.next();

            ArrayList<Integer> available = new ArrayList<>();

           
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '0') {
                    available.add(list.get(i));
                }
            }

            if (available.size() < k) {
                System.out.println(-1);
                continue;   
            }

         
            Collections.sort(available);

            int sum = 0;

           
            for (int i = 0; i < k; i++) {
                sum += available.get(i);
            }

            System.out.println(sum);
        }
    }
}