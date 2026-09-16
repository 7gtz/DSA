class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int length = 0, idx = 0;

        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (sb.indexOf(String.valueOf(element)) == -1) {
                sb.append(element);
                if (length < sb.length()) {
                    length = sb.length();
                    idx = i-length+1;
                }

            } else {

                sb.delete(0, sb.indexOf(String.valueOf(element)) + 1);
                sb.append(element);
                if (length < sb.length()) {
                    length = sb.length();
                    idx = i-length+1;
                }
                
            }

        } return length;
    }
}
