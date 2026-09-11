class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                newString.append(s.charAt(i));
            }
        }


        if ((newString.toString()).equalsIgnoreCase(newString.reverse().toString())) {
            return true;
        }
        else {
            return false;
        }
    }
}
