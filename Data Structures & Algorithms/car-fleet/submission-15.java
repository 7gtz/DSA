class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();

        int[][] pair = new int[position.length][2];
        
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a,b) -> Integer.compare(a[0], b[0]));

        for (int i = pair.length - 1; i >= 0; i--) {
            double time = (double) (target - pair[i][0]) / pair[i][1];
            if (stack.isEmpty()) {
                stack.push(time);
            } else if (time > stack.peek()) {
                stack.push(time);
            }
        }


        System.out.println(stack);
        return stack.size();
    }
}
