// import java.util.Arrays;
// import java.util.Collections;

public class sorting {

    // public static void bubbleSort(int nums[]){
    // for(int i=0; i<nums.length-1; i++){
    // int swap = 0;
    // for(int j=0; j<nums.length-1-i; j++){
    // if(nums[j] > nums[j+1]){
    // int temp = nums[j];
    // nums[j] = nums[j+1];
    // nums[j+1] = temp;
    // swap++;
    // }
    // if(swap < 1){
    // break;
    // }
    // }
    // }
    // }

    // public static void selectionSort(int nums[]) {
    // for (int i = 0; i < nums.length-1; i++) {
    // int minIndex = i;
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[minIndex] > nums[j]) {
    // minIndex = j;
    // }
    // }
    // int temp = nums[minIndex];
    // nums[minIndex] = nums[i];
    // nums[i] = temp;
    // }
    // }

    // public static void insertionSort(int num[]) {
    // for (int i = 0; i < num.length-1; i++) {
    // int key = num[i];
    // int j = i - 1;

    // while (j >= 0 && num[j] > key) {
    // num[j + 1] = num[j];
    // j--;
    // }

    // num[j + 1] = key;
    // }
    // }

    // public static void countingSort(int nums[]) {
    // int largest = nums[0];

    // for (int i = 0; i < nums.length; i++) {
    // largest = Math.max(largest, nums[i]);
    // }

    // int count[] = new int[largest + 1];

    // for (int i = 0; i < nums.length; i++) {
    // count[nums[i]]++;
    // }

    // int j = 0;
    // for (int i = 0; i < count.length; i++) {
    // while (count[i] > 0) {
    // nums[j] = i;
    // j++;
    // count[i]--;
    // }
    // }

    // }

    // max using mergeSort

    // public static int mergeSort(int arr[], int si, int ei) {
    //     if (si >= ei) {
    //         return 0;
    //     }

    //     int mid = si + (ei - si) / 2;
    //     mergeSort(arr, si, mid);
    //     mergeSort(arr, mid + 1, ei);
    //     int larget = merge(arr, si, mid, ei);
    //     return larget;
    // }

    // public static int merge(int arr[], int si, int mid, int ei) {
    //     int i = si;
    //     int j = mid + 1;
    //     int temp[] = new int[ei - si + 1];
    //     int k = 0;

    //     int largest = arr[0];
    //     while (i <= mid && j <= ei) {
    //         if (arr[i] < arr[j]) {
    //             largest = arr[j];
    //             temp[k++] = arr[i++];

    //         } 
    //         else {
    //             temp[k++] = arr[j++];
    //         }

    //     }

    //     while (i <= mid) {
    //         temp[k++] = arr[i++];
    //     }

    //     while (j <= ei) {
    //         temp[k++] = arr[j++];
    //     }

    //     for (int x = 0; x < temp.length; x++) {
    //         arr[si + x] = temp[x];
    //     }

    //     return largest;
    // }

    // Quick Sort

    // public static void quickSort(int arr[], int si, int ei) {
    // if (si >= ei) {
    // return;
    // }

    // int pIndx = partion(arr, si, ei);
    // quickSort(arr, si, pIndx - 1);
    // quickSort(arr, pIndx + 1, ei);
    // }

    // public static int partion(int arr[], int si, int ei) {
    // int pivot = arr[ei];
    // int i = si - 1;
    // for (int j = si; j < ei; j++) {
    // if (arr[j] <= pivot) {
    // i++;
    // int temp = arr[j];
    // arr[j] = arr[i];
    // arr[i] = temp;
    // }
    // }

    // i++;
    // int temp = pivot;
    // arr[ei] = arr[i];
    // arr[i] = temp;
    // return i;
    // }

    public static void main(String[] args) {
        // int nums[] = { 5, 3, 8, 2, 9 };

        // bubbleSort(nums);
        // selectionSort(nums);
        // insertionSort(nums);

        // Arrays.sort(nums, 0, 3);
        // Arrays.sort(nums, 0, 3, Collections.reverseOrder()); for this Integer is used

        // countingSort(nums);

        // System.out.println(mergeSort(nums, 0, nums.length - 1));
        // quickSort(nums, 0, nums.length - 1);

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print(nums[i] + " ");

        // }

    }
}
