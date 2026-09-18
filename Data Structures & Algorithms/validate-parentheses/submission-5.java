class Solution {
    public boolean isValid(String s) {

        String open = "({[";
        String close = ")}]";
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {

            // check for order, first half should have only opening
            if (open.indexOf(s.charAt(i)) != -1) {
                stack.push(s.charAt(i));
                System.out.println(stack);
            }
            
            else {
                switch (s.charAt(i)) {
                    case ')':
                        if (stack.isEmpty() || stack.peek() != '(') {
                            return false;
                        }
                        else {
                            stack.pop();
                            System.out.println(stack);
                            break;
                        }
                    case '}':
                        if (stack.isEmpty() || stack.peek() != '{') {
                            return false;
                        }
                        else {
                            stack.pop();
                            System.out.println(stack);
                            break;
                        }
                    case ']':
                        if (stack.isEmpty() || stack.peek() != '[') {
                            return false;
                        }
                        else {
                            stack.pop();
                            System.out.println(stack);
                            break;
                        }
                }
            }
        }

        return stack.isEmpty();

    }
}
