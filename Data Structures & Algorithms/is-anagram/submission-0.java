class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        } else {
            HashMap<Character,Integer> hmap1 = new HashMap<Character,Integer>();
            for (int i = 0; i < s.length(); i++) {
                if (hmap1.containsKey(s.charAt(i))) {
                    hmap1.put(s.charAt(i),hmap1.get(s.charAt(i))+1);
                } else {
                    hmap1.put(s.charAt(i),1);
                }
            }
            HashMap<Character,Integer> hmap2 = new HashMap<Character,Integer>();
            for (int i = 0; i < t.length(); i++) {
                if (hmap2.containsKey(t.charAt(i))) {
                    hmap2.put(t.charAt(i),hmap2.get(t.charAt(i))+1);
                } else {
                    hmap2.put(t.charAt(i),1);
                }
            }
            if (hmap1.entrySet().equals(hmap2.entrySet())) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
