class Solution {

    public String encode(List<String> strs) {
        StringBuilder temp = new StringBuilder();

        for (String x : strs) {
            temp.append(x.length());
            temp.append("#");
            temp.append(x);
        }

        return temp.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded_strs = new ArrayList<String>();

        int i = 0;
        StringBuilder tempNumber = new StringBuilder();
        while (i < str.length()) {
            if (str.charAt(i) != '#') {
                tempNumber.append(str.charAt(i));
                i++;
                continue;
            } else {
                int number = Integer.parseInt(tempNumber.toString());
                tempNumber.setLength(0);
                i++;
                decoded_strs.add(str.substring(i,i+number));
                i += number;
            }
        }


        return decoded_strs;
    }
}
// 6#string#num#string
//