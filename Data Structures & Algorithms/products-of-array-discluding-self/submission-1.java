class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                int num = nums[i];
                nums[i] = 1;
                for (int x : nums) {
                    product *= x;
                }
                nums[i] = num;
                output[i] = product;
            }
            else {
                if (nums[i] != 0) {
                    output[i] = output[i-1]*nums[i-1]/nums[i];
                } else {
                    int temp = 1;
                    nums[i] = 1;
                    for (int x : nums) {
                        temp *= x;
                    }
                    nums[i] = 0;
                    output[i] = temp;
                }
            }
        }
        return output;
    }  
}  
