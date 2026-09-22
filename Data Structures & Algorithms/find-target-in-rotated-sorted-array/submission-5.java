class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length - 1, startidx = 0;

        while (startidx < right) {

            int mid = startidx + (right - startidx)/2;
            if (nums[mid] > nums[right]) {
                startidx = mid + 1;
            } else {
                right = mid;
            }            
        }
        
        if (target < nums[0]) {
            
            right = nums.length - 1;

            while (startidx <= right) {
                int mid = startidx + (right - startidx)/2;
                if (target > nums[mid]) {
                    startidx = mid + 1;
                } else if (target < nums[mid]) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
        } else {
            if (target == nums[0]) return 0;
            right = (startidx == 0) ? nums.length - 1 : startidx - 1;
            int left = 0;
            while (left <= right) {
                int mid = left + (right - left)/2;
                if (target > nums[mid]) {
                    left = mid + 1;
                } else if (target < nums[mid]) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
        }
    return -1;
    }
}
