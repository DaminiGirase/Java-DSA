import java.util.*;

public class MaxAreaHistogram {

    // my aproach

    public static int maxArea(int arr[]) {

        int result[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int minL = -1;
            int minR = arr.length;
            for (int k = i; k >= 0; k--) {
                if (arr[k] < arr[i]) {
                    minL = k;
                    break;
                }
            }

            for (int x = i + 1; x < arr.length; x++) {
                if (arr[x] < arr[i]) {
                    minR = x;
                    break;
                }
            }

            result[i] = arr[i] * (minR - minL - 1);
        }

        int maxA = result[0];
        for (int i = 0; i < result.length; i++) {
            if (result[i] > maxA) {
                maxA = result[i];
            }
        }
        return maxA;
    }

    // mam aproach

    public static int maxHis(int arr[]){
        int maxA = 0;
        int msR[] = new int[arr.length];
        int msL[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                msR[i] = arr.length;
            }else{
                msR[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();

         for(int i=0; i<arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                msL[i] = -1;
            }else{
                msL[i] = s.peek();
            }
            s.push(i);
        }

        for(int i=0; i<arr.length; i++){
            maxA = Math.max(maxA, arr[i] * (msR[i]-msL[i]-1));
        }

        return maxA;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxHis(arr));
    }
}
