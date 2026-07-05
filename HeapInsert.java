import java.util.*;

public class HeapInsert {

    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {

            arr.add(data);

            int ch = arr.size() - 1;
            int par = (ch - 1) / 2;

            while (arr.get(ch) < arr.get(par)) {
                int temp = arr.get(ch);
                arr.set(ch, arr.get(par));
                arr.set(par, temp);

                ch = par;
                par = (ch - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int minIdx = i;
            int left = (2 * i + 1);
            int right = (2 * i + 2);

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {

            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            arr.remove(arr.size() - 1);

            heapify(0);
            return data;

        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

    }

    public static void main(String[] args) {

        Heap hp = new Heap();

        hp.add(3);
        hp.add(4);
        hp.add(1);
        hp.add(5);
       
        while (!hp.isEmpty()) {
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}
