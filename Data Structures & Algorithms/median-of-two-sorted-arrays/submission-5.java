class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int[] smallArr = nums1;
        int[] bigArr = nums2;

        int smallLen = smallArr.length;
        int bigLen = bigArr.length;
        int totalCount = smallLen + bigLen;

        int leftSize = (totalCount + 1) / 2;

        int minS = 0;
        int maxS = smallLen;

        while (minS <= maxS) {
            int takeSmall = minS + (maxS - minS) / 2;

            int takeLarge = leftSize - takeSmall;

            int smallL = (takeSmall == 0) ? Integer.MIN_VALUE : smallArr[takeSmall - 1];
            int smallR = (takeSmall == smallLen) ? Integer.MAX_VALUE : smallArr[takeSmall];
            int longL = (takeLarge == 0) ? Integer.MIN_VALUE : bigArr[takeLarge - 1];
            int longR = (takeLarge == bigLen) ? Integer.MAX_VALUE : bigArr[takeLarge];

            if (smallL <= longR && smallR >= longL) {
                if (totalCount % 2 == 1) return Math.max(smallL, longL);
                return ((long) Math.max(smallL, longL) + Math.min(smallR, longR)) / 2.0;
            } else if (smallL > longR) {
                maxS = takeSmall - 1;
            } else {
                minS = takeSmall + 1;
            }

        }
        throw new IllegalArgumentException("Input arrays must be sorted.");

    }
}
