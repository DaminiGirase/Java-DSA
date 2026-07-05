
// merge sort and quick sort also the problems of divide and conure

public class DivideAndConcure {

    // first way-------------------------------------------------

    // public static int rotateArray(int arr[], int target, int si, int ei) {
    // if (si > ei) {
    // return -1;
    // }

    // int mid = si + (ei - si) / 2;

    // if (arr[mid] == target) {
    // return mid;
    // }

    // if (arr[si] <= arr[mid]) {
    // if (arr[si] <= target && target <= arr[mid]) {
    // return rotateArray(arr, target, si, mid - 1);
    // } else {
    // return rotateArray(arr, target, mid + 1, ei);
    // }
    // }
    // else{
    // if(arr[mid] <= target && target <= arr[ei]){
    // return rotateArray(arr, target, mid+1, ei);
    // }else{
    // return rotateArray(arr, target, mid-1, si);
    // }
    // }

    // }

    // using modulo arithmatic--------------------------------------

    public static boolean isPresent(int arr[], int target){

        int n = arr.length;
        int bp = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[i+1]){
                bp = i;
                break;
            }
        }

        int si = bp+1;
        int ei = bp;

        while (si != ei) {
            if(arr[si] == target || arr[ei] == target){
                return true;
            }

            si = (si+1)%n;
            ei = (n+ei-1)%n;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(isPresent(arr, target));
        // System.out.println(rotateArray(arr, target, 0, arr.length));

        // second way-----------------------------------------------

        // int si = 0, ei = arr.length - 1;
        // while (si <= ei) {
        //     int mid = si + (ei - si) / 2;

        //     if (arr[mid] == target) {
        //         System.out.println(mid);
        //     }

        //     if (arr[si] <= arr[mid]) {
        //         if (arr[si] <= target && target <= arr[mid]) {
        //             ei = mid - 1;
        //         } else {
        //             si = mid + 1;
        //         }
        //     }

        //     else {
        //         if (arr[mid] <= target && target <= arr[ei]) {
        //             si = mid + 1;
        //         } else {
        //             ei = mid - 1;
        //         }
        //     }

        // }

    }
}
