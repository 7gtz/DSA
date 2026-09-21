class Solution {
    public int binary(int[] nums, int target, int left, int right) {
        int mid = left + (right - left) / 2;

        if (left > right) return -1;

        if (nums[mid] < target) {
            left = mid + 1;
            return binary(nums, target, left, right);
        } else if (nums[mid] > target) {
            right = mid - 1;
            return binary(nums, target, left, right);
        } else {
            return mid;
        }
    }

    public int search(int[] nums, int target) {
        return binary(nums, target, 0, nums.length - 1);
        
    }
}
