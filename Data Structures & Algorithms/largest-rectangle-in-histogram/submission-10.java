class Solution {
    public int largestRectangleArea(int[] heights) {
        int area = 0;
        int[] result = new int[heights.length];
        Stack<int[]> stack = new Stack<>();
        // idx, height

        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                int[] bar = stack.pop();
                int left = bar[0];
                int height = bar[1];
                int width = i - left;
                area = Math.max(area, height * width);
                start = left;
            }

            stack.push(new int[] {start, heights[i]});
            
        }

        while (!stack.isEmpty()) {
                int[] bar = stack.pop();
                int left = bar[0];
                int height = bar[1];
                int width = heights.length - left;
                area = Math.max(area, height * width);

        }

        return area;
    }
}
