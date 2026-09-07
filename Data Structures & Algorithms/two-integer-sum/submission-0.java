class Solution {
    public int[] twoSum(int[] nums, int target) {
        int goal;
        int idx;
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {

            goal = target - nums[i];
            if (hmap.containsKey(goal)) {
                idx = hmap.get(goal);
                int[] answer = {idx,i};
                return answer;
            }
            hmap.put(nums[i],i);
        }
        return new int[]{};
    }
}
