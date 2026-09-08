class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!hmap.containsKey(nums[i])) {
                hmap.put(nums[i],1);
            }
            else {
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
        }

        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<Map.Entry<Integer,Integer>>(hmap.entrySet());

        entryList.sort(Comparator.comparing(Map.Entry<Integer,Integer>::getValue).reversed());

        // displaying answer
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = entryList.get(i).getKey();
        }
        return ans;
    }
}
