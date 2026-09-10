class Solution {

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int seqLength = 1;
        int maxSeq = 1;
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) continue;
            if (nums[i+1]-1 == nums[i]){
                seqLength++;
                maxSeq = Math.max(seqLength,maxSeq);
            } else {
                seqLength = 1;
            }
        }
        return maxSeq;

    }
}
