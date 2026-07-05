public class DivideAndConcureExcersice {

    // Q 01 mergsort with string

    // public static int mergeSort(String str[], int si, int ei) {
    // if (si >= ei) {
    // return 0;
    // }

    // int mid = si + (ei - si) / 2;
    // int left = mergeSort(str, si, mid);
    // int right = mergeSort(str, mid + 1, ei);
    // int mergTwo = merge(str, si, mid, ei);

    // return left + right + mergTwo;
    // }

    // public static int merge(String str[], int si, int mid, int ei) {
    // String temp[] = new String[ei - si + 1];
    // int i = si;
    // int j = mid + 1;
    // int k = 0;
    // int count = 0;

    // while (i <= mid && j <= ei) {
    // if (str[i].compareTo(str[j]) < 0) {
    // temp[k++] = str[i++];
    // } else {
    // temp[k++] = str[j++];
    // count += (mid - i + 1);
    // }
    // }

    // while (i <= mid) {
    // temp[k++] = str[i++];
    // }

    // while (j <= ei) {
    // temp[k++] = str[j++];
    // }

    // for (int x = 0; x < temp.length; x++) {
    // str[si + x] = temp[x];
    // }
    // return count;
    // }

    // inversion count means who many swaps required to swap array

    // public static void sort(int arr[]){

    // int swap = 0;

    // for(int i=0; i<arr.length; i++){
    // for(int j=0; j<arr.length-i-1; j++){
    // if(arr[j] > arr[j+1]){
    // int temp = arr[j];
    // arr[j] = arr[j+1];
    // arr[j+1] = temp;
    // swap++;
    // }
    // }
    // }

    // System.out.println(swap);
    // }

    public static void main(String[] args) {

        // String str[] = { "sun", "earth", "mars", "mercury" };
        // System.out.println( mergeSort(str, 0, str.length - 1));
        // for (int i = 0; i < str.length; i++) {
        // System.out.print(str[i] + " ");
        // }

        // int arr[] = {1, 1, 1, 1};
        // sort(arr);

        int arr1[] = { 1, 2, 3};
        int arr2[] = { 1, 2, 3 };
        int k = 0;
        int i = 0;
        int j = 0;
        int temp[] = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                temp[k++] = arr1[i++];
            }
            else{
                temp[k++] = arr2[j++];
            }
        }

        while (i <= arr1.length-1) {
            temp[k++] = arr1[i++];
        }

         while (j <= arr2.length-1) {
            temp[k++] = arr2[j++];
        }

        for(int x = 0; x < temp.length; x++){
            System.out.print(temp[x] + " ");
        }

    }
}
