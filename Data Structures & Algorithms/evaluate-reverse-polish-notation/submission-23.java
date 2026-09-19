class Solution {
    public int evalRPN(String[] tokens) {
        String operators = "+/*";

        Stack<Integer> math = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String term = tokens[i];

            if (term.equals("-") || operators.indexOf(term.charAt(0)) != -1) {

                int num2 = math.peek();
                math.pop();
                int num1 = math.peek();
                math.pop();

                math.push(switch (term) {
                    case "+" -> num1 + num2;
                    case "-" -> num1 - num2;
                    case "*" -> num1 * num2;
                    case "/" -> num1 / num2;
                    default -> throw new IllegalArgumentException("Unknown Operator: " + term);
                });
            
            } else {
                math.push(Integer.parseInt(term));
            }

        }
        return math.peek();
    }
}
