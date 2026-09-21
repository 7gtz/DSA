class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = left + (right - left) / 2;

        while (nums[mid] != target && left < right) {
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            } 

            mid = left + (right - left) / 2;
        } 
        
         if (nums[mid] == target) {
            return mid;
        }
        return -1;
    }
}
