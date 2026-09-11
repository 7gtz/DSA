class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length-1;
        int i = 0;
        while (i < numbers.length)
            if (numbers[i] + numbers[n] > target) {
                n--;
            } else if (numbers[i] + numbers[n] == target && i != n) {
                return new int[] {i+1,n+1};
            } else {
                i++;
            }
        
        return new int[] {0,0};
    }
}
