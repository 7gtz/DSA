class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int height1 = heights[i];
        int height2 = heights[j];

        int area = Math.min(height1,height2)*(j-i);

        while (j > i) {
            height1 = heights[i];
            height2 = heights[j];            

            int newArea = Math.min(height1,height2)*(j-i);
            if (newArea > area) { area = newArea; }
            if (height1 <= height2) {
                i++;
            } else {
                j--;
            }
        }
        return area;

    }
}
