

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;

        // Store all pairwise XORs
        Set<Integer> pairs = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                pairs.add(nums[i] ^ nums[j]);
            }
        }

        // Extend pairs with third element
        BitSet triplets = new BitSet();
        for (int pair : pairs) {
            for (int num : nums) {
                triplets.set(pair ^ num);
            }
        }

        return triplets.cardinality(); // Count distinct XOR values
    }
}
