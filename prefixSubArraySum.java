public class prefixSubArraySum {
    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        int prefix[] = new int[numbers.length];
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        prefix[0] = numbers[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("MAXSUM is: " + maxSum);
    }
}
