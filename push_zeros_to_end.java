public class push_zeros_to_end {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
            int n = nums.length;
            int count = 0;

            for(int i=0; i<n; i++){
                if(nums[i] == 0){
                    count++;
                }
            }
            for(int i=0; i<=count; i++){
                for(int j=0; j<n-1-i; j++){
                    if(nums[j] == 0 && nums[j+1] != 0){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
            }

            for(int ele : nums){
                System.out.print(ele+" ");
            }
            System.out.println();
    }
}
