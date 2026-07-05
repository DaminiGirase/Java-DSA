import java.util.*;

public class arraysCollege {
  public static void swap(int arr[], int left, int right) {
    while (left <= right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }
  }

  public static void main(String[] args) {

   int arr[] = {1,2,3,4,5,6,7};

int left = 0;
int right = arr.length - 1;

int result[] = new int[arr.length];
int k = 0;

while(left <= right){

    result[k++] = arr[left++];
    
    if(left <= right){
        result[k++] = arr[right--];
    }
}

for(int i=0;i<result.length;i++){
    System.out.print(result[i] + " ");
}
    //------------------------------
//     int k=2;
//     int ans[] = new int[arr.length];
//     for(int i=0; i<arr.length; i++){
//       System.out.print(i + " ");
      
//     }

// System.out.println();
//     for(int i=0; i<arr.length; i++){
//       System.out.print((k+i)%arr.length + " ");
//     }
    
// System.out.println();
//     for(int i=0; i<arr.length; i++){
//       ans[(i+k)%arr.length] = arr[i];
//     }

//     for(int i=0; i<arr.length; i++){
//       System.out.print(ans[i] + " ");
//     }

// given array is rotation of that array-------------

    // int arr[] = { 1, 2, 3, 4, 5 };
    // int brr[] = { 3, 4, 5, 1, 2 };
    // int br = 0;

    // for (int i = 0; i < brr.length - 1; i++) {
    //   if (brr[i] > brr[i + 1]) {
    //     br = i + 1;
    //   }
    // }
    // int st = br;
    // boolean t = true;
    // for (int i = 0; i < arr.length; i++) {
    //   if (arr[i] != brr[st]) {
    //     t = false;
    //     break;
    //   }
    //   st = (st + 1) % brr.length;
  
    // }
    // System.out.println(t);
   


    // shift zero to last------------
    // int arr[] = { 0, 0, 0, 3, 4, 7, 8 };
    // int count = 0;

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] != 0) {
    // arr[count] = arr[i];
    // count++;
    // }
    // }

    // for (int i = count; i < arr.length; i++) {
    // arr[i] = 0;
    // }

    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }

    // -----------------------------------------
    // int arr[] = {1, 2, 2, 1, 5};
    // for(int i=0; i<arr.length; i++){
    // if(arr[i] != arr[arr.length-i-1]){
    // System.out.println("No");
    // break;
    // }else{
    // System.out.println("Yes");
    // break;
    // }
    // }

    // ----------------------------------------
    // anti clock wise rotation

    // int arr[] = { 1, 2, 3, 4, 5 };
    // int ratation = 2;
    // swap(arr, 0, ratation - 1);
    // swap(arr, ratation, arr.length - 1);
    // swap(arr, 0, arr.length - 1);

    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }

    // new ---------------------
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter number of elements: ");
    // int n = sc.nextInt();
    // int arr[] = new int[n];

    // System.out.print("Enter array element: ");
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // System.out.print(arr[i] + " ");
    // }

    // equilibrium sum

    // int arr[] = { 2, 3, -1, 8, 4 };

    // int leftSum[] = new int[arr.length];
    // int rightSum[] = new int[arr.length];

    // leftSum[0] = arr[0];
    // for(int i=1; i<arr.length; i++){
    // leftSum[i] = leftSum[i-1] + arr[i];
    // }

    // rightSum[arr.length-1] = arr[arr.length-1];
    // for(int i=arr.length-2; i>=0; i--){
    // rightSum[i] = rightSum[i+1] + arr[i];
    // }

    // for(int i=0; i<arr.length; i++){
    // if(leftSum[i] == rightSum[i]){
    // System.out.println(i);
    // break;
    // }
    // }

    // int totalSum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // totalSum += arr[i];
    // }

    // int leftSum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // totalSum = totalSum - arr[i];
    // if (leftSum == totalSum) {
    // System.out.println(i);
    // break;
    // }
    // leftSum += arr[i];
    // }

    // clockWise rotation

    // int arr[] = { 1, 2, 3, 4, 5 };

    // int rotation = 3;

    // int left = 0;
    // int right = arr.length - 1;
    // while (left <= right) {
    // int temp = arr[left];
    // arr[left] = arr[right];
    // arr[right] = temp;

    // left++;
    // right--;
    // }

    // int fk = 0;
    // int lk = rotation-1;
    // while (fk<=lk) {
    // int t = arr[fk];
    // arr[fk] = arr[lk];
    // arr[lk] = t;

    // fk++;
    // lk--;
    // }

    // int rf = rotation;
    // int rl = arr.length-1;
    // while (rf<=rl) {
    // int t = arr[rf];
    // arr[rf] = arr[rl];
    // arr[rl] = t;

    // rf++;
    // rl--;
    // }

    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }

    // rotate array number of times

    // int wiseOrNot = 0;

    // if (wiseOrNot == 1) {
    // for (int i = 0; i < rotation; i++) {
    // int first = arr[0];
    // for (int j = 1; j < arr.length; j++) {
    // arr[j - 1] = arr[j];
    // }
    // arr[arr.length - 1] = first;
    // }
    // }else{
    // for(int i=0; i<rotation; i++){
    // int last = arr[arr.length-1];
    // for(int j=arr.length-1; j>0; j--){
    // arr[j] = arr[j-1];
    // }
    // arr[0] = last;
    // }
    // }

    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
  }
}
