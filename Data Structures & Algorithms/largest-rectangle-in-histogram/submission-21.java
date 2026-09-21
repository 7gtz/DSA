class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int area = 0;

        for (int i = 0; i < heights.length + 1; i++) {

            int height = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > height) {
                int right = i - 1;
                int bar = heights[stack.pop()];
                int width = (stack.isEmpty()) ? i : right - stack.peek();
                area = Math.max(area, bar * width);
            }

            if (i < heights.length) stack.push(i);

        }
        return area;
    }
}
