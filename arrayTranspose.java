public class arrayTranspose {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 93 }, { 4, 599, 6 }, { 7, 8, 9 } };
        int max = 0;

        for(int i=0; i<arr.length; i++){
            max = arr[i][0];
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println(max);
        }

        // int sum = 0;
        // int ind = -1;
        // int maxsum = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     sum = 0;
        //     for (int j = 0; j < arr[i].length; j++) {
        //         sum += arr[i][j];
        //     }
        //     if (sum > maxsum) {
        //         maxsum = sum;
        //         ind = i;
        //     }
        // }

        // System.out.println(ind);

        // int n = arr.length;
        // int temp[][] = new int[n][n];

        // right rotate------------
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // temp[j][n - 1 - i] = arr[i][j];
        // }
        // }

        // left rotate-------------------------

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // temp[n-j-1][i] = arr[i][j];
        // }
        // }

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i+1; j < arr[i].length; j++) {
        // int temp = arr[i][j];
        // arr[i][j] = arr[j][i];
        // arr[j][i] = temp;
        // }
        // }

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // int temp[][] = new int[3][3];

        // for(int i=0; i<arr.length; i++){
        // for(int j=0; j<arr[i].length; j++){
        // temp[j][i] = arr[i][j];
        // }
        // }

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.print(temp[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
