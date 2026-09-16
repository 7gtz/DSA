class Solution {
    public int characterReplacement(String s, int k) {
        int length = 0;

        HashMap<Character,Integer> m = new HashMap();

        int left = 0, maxFreq = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            m.put(s.charAt(right), m.getOrDefault(s.charAt(right), 0) + 1);
            
            maxFreq = Math.max(m.get(s.charAt(right)),maxFreq);

            while (((right - left + 1) - maxFreq) > k) {
                m.put(s.charAt(left), m.get(s.charAt(left)) -1);
                left++;
            }

            maxLength = Math.max(maxLength, (right - left + 1));

        }
        
        return maxLength;
    }
}
