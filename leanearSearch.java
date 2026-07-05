import java.util.*;

public class leanearSearch {
    public static String leanearSearch(String arr[], String key) {
    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return arr[i];
            }
        }
    
       return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        String arr[] = new String[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.print("Enter key Want to search: ");
        String key = sc.next();

        String found = leanearSearch(arr, key);

         if(found==""){
            System.out.println("Not Present");
        }else{
            System.out.println("Element Present in Array");
        }

    }
}
