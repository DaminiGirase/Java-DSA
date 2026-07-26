import java.util.*;

public class NextGreater {

    public static void nextGreater(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int next[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                next[i] = -1;
            } else {
                next[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i] + " ");
        }
    }

    public static void nextG(int arr[]) {

        int right[] = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        for (int i = 0; i < right.length; i++) {
            System.out.print(right[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        nextG(arr);

        // My Aproach

        // int result[] = new int[arr.length];
        // result[arr.length-1] = -1;

        // for(int i=0; i<arr.length; i++){
        // for(int j=i+1; j<arr.length; j++){
        // if(arr[j]>arr[i]){
        // result[i] = arr[j];
        // break;
        // }else{
        // result[i] = -1;
        // }
        // }
        // }

        // for(int i=0; i<result.length; i++){
        // System.out.print(result[i] + " ");
        // }
    }
}
