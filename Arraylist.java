import java.util.*;

public class Arraylist {

    public static void swap(ArrayList<Integer> list, int ind1, int ind2){

        int temp = list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(2);
        list.add(45);
        list.add(4);
        list.add(14);

        Collections.sort(list);
        System.out.println(list);
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


        // System.out.println(list);
        // swap(list, 2, 4);
        // System.out.println(list);

        // size
        // System.out.println(list.size());
        // list.remove(4);
        // list.set(4, 7);

        // max in list

        // int max = Integer.MIN_VALUE;

        // for(int i=list.size()-1; i>=0; i--){
        // max = Math.max(max, list.get(i));
        // }
        // System.out.println(max);

        // print list in reverse

        // for(int i=list.size()-1; i>=0; i--){
        // System.out.print(list.get(i) + " ");
        // }


        // int arr[] = {1, 3, 4, 5, 8};

        // int temp = arr[2];
        // arr[2] = arr[4];
        // arr[4] = temp;

        // for(int i=0; i<arr.length; i++){
        // System.out.print(arr[i] + " ");
        // }

    }
}
