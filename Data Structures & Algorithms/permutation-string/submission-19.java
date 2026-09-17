class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1char = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1char[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;

        }

        if (Arrays.equals(s1char,window)) {
            return true;
        }

        int left = 1, right = s1.length();

        while (right < s2.length()) {
            window[s2.charAt(left-1) - 'a']--;
            window[s2.charAt(right) - 'a']++;

            if (Arrays.equals(s1char,window)) {
                System.out.println(s1char);
                System.out.println(window);
            return true;
            }

            left++;
            right++;
        }

        return false;
    }
}
