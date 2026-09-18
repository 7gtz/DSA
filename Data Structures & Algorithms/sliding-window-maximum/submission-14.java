class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 1) {
            return new int[] {nums[0]};
        }


        int right = k - 1, left = 0;

        int max = -10001;

        for (int i = 0; i < k; i++) {
                max = Math.max(nums[i], max);

            }
            
        int answer[] = new int[nums.length - k + 1];

        answer[0] = max;

        while (right < nums.length - 1) {  
            right++;
            if (nums[left] == max) {
                max = -10001;
                for (int i = left + 1; i <= right ; i++) max = Math.max(max,nums[i]);
            } else {
                max = Math.max(max, nums[right]);
            }
            left++;
            answer[left] = max;
        }
    return answer;
    }
}

