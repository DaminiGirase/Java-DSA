public class KSubArray {

    public static boolean isValid(int arr[], int limit, int k){

        int sum = arr[0];
        int count = 1;

        for(int i=1; i<arr.length; i++){
            sum += arr[i];

            if(sum > limit){
                count++;
                sum = arr[i];
            }
        }

        if(count <= k){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {7, 2, 5, 10, 8};
        int k = 2;

        int max = arr[0];
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }

        int low = max;
        int high = sum;
        int ans = 0;

        while (low <= high) {
            int mid = (low+high)/2;

            if(isValid(arr, mid, k)){
               ans = mid;
               high = mid-1;
            }else{
                low = mid+1;
            }
        }

        System.out.println(ans);
    }
}
