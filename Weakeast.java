import java.util.*;

public class Weakeast {

    static class Solder implements Comparable<Solder> {
        int solder;
        int indx;

        Solder(int solder, int indx) {
            this.solder = solder;
            this.indx = indx;
        }

        @Override
        public int compareTo(Solder s) {
            if (this.solder == s.solder) {
                return this.indx - s.indx;
            } else {
                return this.solder - s.solder;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        PriorityQueue<Solder> p = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                count += arr[i][j] == 1 ? 1 : 0;
            }

            p.add(new Solder(count, i));
        }

        int k = 2;

        for (int i = 0; i < k; i++) {
            System.out.println("R" + p.remove().indx);
        }
    }
}