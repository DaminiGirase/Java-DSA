import java.util.*;

public class HeapInsert {

    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        // public void add(int data) {

        // arr.add(data);

        // int ch = arr.size() - 1;
        // int par = (ch - 1) / 2;

        // while (arr.get(ch) < arr.get(par)) {
        // int temp = arr.get(ch);
        // arr.set(ch, arr.get(par));
        // arr.set(par, temp);

        // ch = par;
        // par = (ch - 1) / 2;
        // }
        // }

        public void add(int data) {
            arr.add(data);       // add data in last of the tree

            int ch = arr.size() - 1;   // child index
            int par = (ch - 1) / 2;     // parent index

            while (arr.get(ch) < arr.get(par)) {   // jabtak child less hai parent se for min heap par<child
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

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {  // check if left child less than parent
                minIdx = left;
            }

            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }

            if (minIdx != i) {           // if minindx changed due to above condn true
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);   // call till complete heap is correct
            }
        }

        public int remove() {

            int data = arr.get(0);  // remove root

            int temp = arr.get(0);   // swap root with last element
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            arr.remove(arr.size() - 1);  // remove root

            heapify(0);  // call heapify for current root
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
