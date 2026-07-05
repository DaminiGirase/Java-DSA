public class sortExcersice {

    // public static void countingSort(int nums[]){
    // int largest = nums[0];
    // for(int i=0; i<nums.length; i++){
    // largest = Math.max(largest, nums[i]);
    // }

    // int count[] = new int[largest+1];
    // for(int i=0; i<nums.length; i++){
    // count[nums[i]]++;
    // }

    // int j=0;
    // for(int i=count.length-1; i>=0; i--){
    // while (count[i] > 0) {
    // nums[j] = i;
    // j++;
    // count[i]--;
    // }
    // }
    // }

    // public static void insertionSort(int nums[]){
    // for(int i=0; i<nums.length; i++){
    // int key = nums[i];
    // int j = i- 1;
    // while (j >= 0 && nums[j] < key) {
    // nums[j+1] = nums[j];
    // j--;
    // }

    // nums[j+1] = key;
    // }
    // }

    // public static void selectionSort(int nums[]){
    // for(int i=0; i<nums.length-1; i++){
    // int minIndex = i;
    // for(int j=i+1; j<nums.length; j++){
    // if(nums[minIndex] < nums[j]){
    // minIndex = j;
    // }
    // }
    // int temp = nums[minIndex];
    // nums[minIndex] = nums[i];
    // nums[i] = temp;
    // }
    // }

    // public static void bubbleSort(int nums[]) {
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         for (int j = 0; j < nums.length - 1 - i; j++) {
    //             if (nums[j] < nums[j + 1]) {
    //                 int temp = nums[j];
    //                 nums[j] = nums[j + 1];
    //                 nums[j + 1] = temp;
    //             }
    //         }
    //     }
    // }

    public static void mergSort(int nums[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = (si + ei) / 2;
        mergSort(nums, si, mid);
        mergSort(nums, mid+1, ei);
        merge(nums, si, mid, ei);
    }

    public static void merge(int nums[], int si, int mid, int ei){
        int i = si, j = mid+1, k = 0;
        int temp[] = new int[ei-si+1];

        while (i <= mid && j <= ei) {
            if(nums[i] < nums[j]){
                temp[k++] = nums[j++];
            }else{
                temp[k++] = nums[i++];
            }
        }

        while (i <= mid) {
             temp[k++] = nums[i++];
        }

        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        for(int x=0; x<temp.length; x++){
            nums[si + x] = temp[x];
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        // countingSort(nums);

        // insertionSort(nums);

        // selectionSort(nums);

        // bubbleSort(nums);

        mergSort(nums, 0, nums.length-1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
