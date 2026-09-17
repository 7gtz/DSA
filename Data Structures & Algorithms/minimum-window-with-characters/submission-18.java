class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }
        
        HashMap<Character, Integer> need = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0;

        int required = need.size();
        int formed = 0;

        int minLength = Integer.MAX_VALUE;
        int bestLeft = 0;

        for (int right = 0; right < s.length(); right++) {

            window.put(s.charAt(right), window.getOrDefault(s.charAt(right), 0) + 1);

            if (need.containsKey(s.charAt(right)) && need.get(s.charAt(right)).equals(window.get(s.charAt(right)))) {
                formed++;
            }

            while (formed == required) {
                if (minLength > right - left + 1) {
                    minLength = right - left + 1;            

                    bestLeft = left;
                }

                window.put(s.charAt(left), window.get(s.charAt(left)) - 1);
                
                if (need.containsKey(s.charAt(left)) && window.get(s.charAt(left)) < need.get(s.charAt(left))) {
                    formed--;
                }
                left++;


            }

        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(bestLeft, bestLeft + minLength);
    }
}
