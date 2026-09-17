class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> hmap1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            hmap1.put(s1.charAt(i), hmap1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int left = 0, right = s1.length() - 1;

        while (right < s2.length()) {
            HashMap<Character, Integer> hmap2 = new HashMap<>();

            for (int i = left; i <= right; i++) {
                hmap2.put(s2.charAt(i), hmap2.getOrDefault(s2.charAt(i), 0) + 1);
            }
            
            if (hmap2.entrySet().equals(hmap1.entrySet())) {
                return true;
            }

            right++;
            left++;
        }
        return false;
    }
}
