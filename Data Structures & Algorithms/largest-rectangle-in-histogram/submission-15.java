class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();

        int n = heights.length;
        int area = 0;
        int width;

        for (int i = 0; i <= n; i++) {

            int h = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && heights[stack.peek()] >= h) {
                int height = heights[stack.pop()];
                if (!stack.isEmpty()) {
                    width = i - stack.peek() - 1;
                } else {
                    width = i;
                }
                area = Math.max(area, width * height);
            }
            if (i < n) stack.push(i);
        }

        return area;
    }
}
