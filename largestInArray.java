
public class largestInArray {
    public static void largest(int numbers[]){
        int lar = numbers[0];
        for(int i=0; i<numbers.length; i++){
             if(lar < numbers[i]){
                 lar = numbers[i];
             }
        }

        System.out.println("Largest is: " + lar);
    }
    public static void main(String[] args) {
       int numbers[] = {-1, -9, -8, -10};
       largest(numbers);
    }
}

