public class practiceArray {

    public static void main(String[] args) {
        // int arr[] = {1, 3, 4, 6, 7};
        // int max = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // max = Math.max(max, arr[i]);
        // }
        // }

        // if (max % 2 != 0) {
        // System.out.println("Not even");
        // } else {
        // System.out.println(max);
        // }

        // write but best practice is start max with Integer.Min_VALUE and then while
        // printing max check max = Integer.MAX_VALUE-------

        // int max = Integer.MIN_VALUE;
        // int Secondmax = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // if (arr[i] > max) {
        // Secondmax = max;
        // max = arr[i];
        // } else if (arr[i] < max) {
        // if (arr[i] > Secondmax) {
        // Secondmax = arr[i];
        // }
        // }
        // }
        // }

        // if (Secondmax == Integer.MIN_VALUE) {
        // System.out.println("Not");
        // } else {
        // System.out.println(Secondmax);
        // }

        // int max = Integer.MIN_VALUE;
        // int max2 = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {

        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == max) {
        //         continue;
        //     }
        //     if (arr[i] > max2) {
        //         max2 = arr[i];
        //     }
        // }

        // System.out.println(max2);

        // int arr[] = {1, 2, 3, 4, 5, 6};

        // for(int i=0; i<arr.length-1; i++){
        //     if(arr[i+1] - arr[i] != 1){
        //         System.out.println(arr[i]+1);
        //     }else{
        //         System.out.println("Not Missing");
        //         break;
        //     }
        // }

        // int arr[] = {2, 3, 3, 7, 7, 7, 9};
        // int max = 0;

        // for(int i=0; i<arr.length; i++){
        //     max = Math.max(max, arr[i]);
        // }

        // int temp[] = new int[max+1];
        // for(int i = 0; i<arr.length; i++){
        //     temp[arr[i]]++;
        // }

        // for(int i=0; i<temp.length; i++){
        //     if(temp[i] != 0){
        //         System.out.println( i + " -> " + temp[i]);
        //     }
        // }

      
    }
}