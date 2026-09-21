class Solution {

    public boolean binary(int nums[], int target, int left, int right) {

        if (left > right) return false;

        int mid = left + (right - left) / 2;

        if (nums[mid] < target) {
            left = mid + 1;
            return binary(nums, target, left, right);
        } else if (nums[mid] > target) {
            right = mid - 1;
            return binary(nums, target, left, right);
        } else if (nums[mid] == target) {
            return true;
        }

        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        // first = int[idx][0]

        int left = 0, right = matrix.length - 1;
        if (target < matrix[0][0]) return false;
        if (target > matrix[matrix.length - 1][matrix[0].length - 1]) return false;
        while (left < right) {

            int mid = left + (right - left) / 2;

            if (matrix[mid][0] < target) {
                if (matrix[mid][matrix[0].length - 1] > target) {
                    return binary(matrix[mid], target, 0, matrix[mid].length - 1);
                } else if (matrix[mid][matrix[0].length - 1] == target) {
                    return true;
                } else {
                    left = mid + 1;
                }

            } else if (matrix[mid][0] > target) {
                right = mid - 1;

            } else if (matrix[mid][0] == target) {
                return true;
            }
        }

        if (matrix[right][0] <= target) {
            return binary(matrix[right], target, 0, matrix[right].length - 1);

        } else {
            return binary(matrix[left], target, 0, matrix[left].length - 1);

        }

    }
}
