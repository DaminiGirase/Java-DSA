import java.util.Arrays;

public class MinAbsoluteDifference {

    public static void MinAbs(int A[], int B[]){
        Arrays.sort(A);
        Arrays.sort(B);

        int minnD = 0;

        for(int i=0; i<A.length; i++){
             minnD += Math.abs(A[i] - B[i]);
        }

        System.out.println(minnD);
    }
    public static void main(String[] args) {
        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};

        MinAbs(A, B);
    }
}
