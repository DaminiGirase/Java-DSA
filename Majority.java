public class Majority {

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 3, 2, 2 };

        // my approach 

        // int size = arr[0];

        // for (int i = 1; i < arr.length; i++) {
        // size = Math.max(arr[i], size);
        // }

        // int freq[] = new int[size + 1];
        // for (int i = 0; i < arr.length; i++) {
        // freq[arr[i]]++;
        // }

        // for(int i=0; i<freq.length; i++){
        // if(freq[i] > arr.length/2){
        // System.out.println(i);
        // }
        // }

        // movur voiting algirithm n/2

        // int majority = arr[0];
        // int count = 1;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] == majority){
        //         count ++;
        //     }else{
        //         count--;
        //         if(count == 0){
        //             count = 1;
        //             majority = arr[i];
        //         }
        //     }
        // }

        // System.out.println(majority);

        int majority = arr[0];
        int count = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == majority){
                count ++;
            }else{
                count--;
                if(count == 0){
                    count = 1;
                    majority = arr[i];
                }
            }
        }

        System.out.println(majority);

    }
}
