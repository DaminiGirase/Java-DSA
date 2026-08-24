public class ArraySliding {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        // using O(n)
        int w = 3;
        int curr = 0;
        for (int i = 0; i < w; i++) {
            curr += arr[i];
        }

        int maxSum = curr;
        for (int i = 1; i <= arr.length - w; i++) {
            curr = curr - arr[i - 1] + arr[i + w - 1];
            maxSum = Math.max(maxSum, curr);
        }
        // System.out.println(maxSum);

        // Brute force

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length-w+1; i++){
            curr = 0;
            for(int j=i; j<i+w; j++){
              curr+=arr[j];
            }
             max = Math.max(curr, max);
        }
        System.out.println(max);
    }
}
