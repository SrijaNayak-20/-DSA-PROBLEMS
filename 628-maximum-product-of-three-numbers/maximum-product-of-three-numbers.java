class Solution {
    public int maximumProduct(int[] nums) {
        int mx1 = Integer.MIN_VALUE, mx2 = Integer.MIN_VALUE, mx3 = Integer.MIN_VALUE;
        int mi1 = Integer.MAX_VALUE, mi2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > mx1) { mx3 = mx2; mx2 = mx1; mx1 = num; }
            else if (num > mx2) { mx3 = mx2; mx2 = num; }
            else if (num > mx3) { mx3 = num; }

            if (num < mi1) { mi2 = mi1; mi1 = num; }
            else if (num < mi2) { mi2 = num; }
        }

        return Math.max(mx1 * mx2 * mx3, mx1 * mi1 * mi2);
    }
}
