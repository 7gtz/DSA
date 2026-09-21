class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int maxPile = Arrays.stream(piles).max().getAsInt();
        int res = maxPile;
        // ans in range of 1 to maxPile

        int left = 1, right = maxPile;

        while (left <= right) {

            int mid =  left + (right - left)/2;
            long totalTime = 0;
            for (int i = 0; i < piles.length; i++) {
                totalTime += Math.ceil((double) piles[i] / mid);
            }
            if (totalTime > h) {
                left = mid + 1;
            } else if (totalTime <= h) {
                res = mid;
                right = mid - 1;
            }
        }
        return res;

    }
}
