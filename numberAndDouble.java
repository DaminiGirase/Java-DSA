public class numberAndDouble {
    public static void main(String[] args) {
        int nums[] = {7,1,14,11};

        boolean found = false;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == 2 * nums[j] || nums[j] == 2 * nums[i] || nums[i] == nums[j]){
                    found = true;
                }
            }
        }

        System.out.println(found);

    }
}
