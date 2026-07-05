import java.util.*;
public class d {
    public static void main(String[] args) {
        // for(int i='a'; i<='z'; i++){
        //     System.out.println(i-96);
        // }

        int arr[][] = {{2, 2}, {5, 4}};
         for(int i=0; i<arr.length; i++){
            Arrays.sort(arr[i]);
       }


       for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            if(arr[i][j] == arr[i][j+1] || arr[i][j] != arr[i][j+1]){
             System.out.println(arr[i][j]);
             j++;   
            }
        }
    }

}
}