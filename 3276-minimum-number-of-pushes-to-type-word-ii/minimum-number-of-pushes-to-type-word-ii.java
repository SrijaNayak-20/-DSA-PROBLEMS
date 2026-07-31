import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int[] count = new int[26];

        // Count frequency of each character
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }

        // Sort frequencies in ascending order
        Arrays.sort(count);

        // Calculate pushes: higher frequency letters get lower cost
        for (int i = 0; i < 26; i++) {
            ans += count[25 - i] * (i / 8 + 1);
        }

        return ans;
    }
}
