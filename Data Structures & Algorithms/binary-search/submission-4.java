class Solution {

    public int binarySearch(int left, int right, int[] nums, int target) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;
        if (nums[mid] == target) return mid;

        if (nums[mid] < target) {
            return binarySearch(mid + 1, right, nums, target);
        } else {
            return binarySearch(left, mid - 1, nums, target);
        }

    }

    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
        
    }
}
