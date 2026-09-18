class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> brackets = new HashMap<>();

        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {

            if (brackets.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty() && s.charAt(i) == brackets.get(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
