public class Array2DCollege {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 0, 0},
                { 0, 4, 0 },
                { 0, 0, 9 } };

        // int max = arr[0][0];
        // for(int i=0; i<arr.length; i++){
        // max = arr[i][0];
        // for(int j=0; j<arr[i].length; j++){
        // if(arr[i][j] > max){
        // max = arr[i][j];
        // }
        // }
        // System.out.println(max);
        // }

        // for(int i=0; i<arr.length; i++){
        // for(int j=i+1; j<arr[i].length; j++){
        // int temp = arr[i][j];
        // arr[i][j] = arr[j][i];
        // arr[j][i] = temp;
        // }
        // }

        for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        }

        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
              if(i != j && arr[i][j] != 0){
                check = false;
                break;
              }
            }
        }
        System.out.println(check);
    }
}
