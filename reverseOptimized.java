public class reverseOptimized {

    public static void reverse(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 10, 6, 8, 9, 2 , 90};

        reverse(numbers);

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
