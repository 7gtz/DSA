class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> answer = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {

            int target = -1*nums[i];
            int j = i+1;
            int k = nums.length-1;
            while (j < nums.length && k > j && i < nums.length) {
                if (nums[j] + nums[k] > target) {
                    k--;
                } else if (nums[j] + nums[k] == target && i != j && i != k) {
                    List<Integer> subAns = new ArrayList<Integer>();
                    Collections.addAll(subAns,nums[i],nums[j],nums[k]);
                    Collections.sort(subAns);
                    if (!answer.contains(subAns)) {
                        answer.add(subAns);
                    }
                    j++;
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        return answer;
    }
}
