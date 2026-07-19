class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;  // XOR cancels duplicates
        }
        return result;
    }
}
