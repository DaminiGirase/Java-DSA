// import java.util.Arrays;

public class arrayExcersise {

    // Q 01 duplicate in sorted

    // public static boolean repeate(int array[]) {
    // for (int i = 0; i < array.length; i++) {
    // for (int j = i + 1; j < array.length; j++) {
    // if (array[i] == array[j]) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    public static void main(String[] args) {

        // First Occurance-------------------
        // int arr[] = { 1, 1, 3, 4, 4, 5 };
        // int  found = -1;

        // for (int i = 0; i < arr.length; i++) {
        //     boolean idUnique = true;
        //     for (int j = 0; j < arr.length; j++) {
        //         if (i != j && arr[i] == arr[j]) {
        //            idUnique = false;
        //             break;
        //         }
        //     }
        //     if(idUnique){
        //         found = arr[i];
        //         break;
        //     }
        // }
        // if(found == -1){
        //       System.out.println("not");
        // }else{
        //     System.out.println(found);
        // }

        String str = "add";
        int freq[] = new int[128];

        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[str.charAt(i)] == 1){
                System.out.println(str.charAt(i));
                break;
            }
        }


        // Q 01
        // int array[] = { 1, 2, 3, 4 };
        // System.out.println(repeate(array));

        // Q 02

        // int nums[] = { -1, 0, 1, 2, -1, -4 };

        // Arrays.sort(nums);

        // for (int i = 0; i < nums.length; i++) {
        // if(i>0 && nums[i] == nums[i-1]) continue;
        // for (int j = i + 1; j < nums.length; j++) {
        // if(j>i+1 && nums[j] == nums[j-1]) continue;
        // for (int k = j + 1; k < nums.length; k++) {
        // if(k>j+1 && nums[k] == nums[k-1]) continue;
        // if(nums[i] + nums[j] + nums[k] == 0)
        // System.out.print("[" + nums[i] + "," + nums[j] + "," + nums[k] + "]" + " ");
        // }
        // }
        // }

        // Q 04

        // int height[] = {4, 2, 0, 3, 2, 5};

        // int n = height.length;
        // int leftMax[] = new int[n];
        // int rightMax[] = new int[n];

        // int water = 0;

        // leftMax[0] = height[0];
        // for(int i=1; i<n; i++){
        // leftMax[i] = Math.max(leftMax[i-1], height[i]);
        // }

        // rightMax[n-1] = height[n-1];
        // for(int i=n-2; i>=0; i--){
        // rightMax[i] = Math.max(rightMax[i+1], height[i]);
        // }

        // for(int i=0; i<n; i++){
        // int waterLevel = Math.min(leftMax[i], rightMax[i]);
        // water += waterLevel - height[i];
        // }

        // System.out.println(water);

        // int arr[] = {1, 3, 4, 5};
        // int n = 1;
        // for(int i=n; i<arr.length-1; i++){
        // arr[i] = arr[i+1];
        // }

        // for(int i=0; i<arr.length-1; i++){
        // System.out.print(arr[i] + " ");
        // }

    }
}