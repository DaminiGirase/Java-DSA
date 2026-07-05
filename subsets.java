public class subsets {

    public static void SubArrays(int arr[], int index, String current){
        if(index == arr.length){
            if(!current.isEmpty()){
                System.out.println(current); 
            }
             return;
        }

        SubArrays(arr, index+1, current+arr[index] + " ");

        SubArrays(arr, index+1, current);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        SubArrays(arr, 0, "");

       
    }
}