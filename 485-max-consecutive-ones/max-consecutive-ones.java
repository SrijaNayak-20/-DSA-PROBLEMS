class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        int count = 0;
        
        for (int num : nums) {
            if (num == 1) {
                count++;
                maxConsecutive = Math.max(maxConsecutive, count);
            } else {
                count = 0;
            }
        }
        
        return maxConsecutive;
    }
}