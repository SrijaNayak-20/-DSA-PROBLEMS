import java.util.*;

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        // Count frequency of each character
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Build left half
        StringBuilder left = new StringBuilder();
        char middle = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                middle = (char) (i + 'a'); // odd-count character goes in the middle
            }
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) (i + 'a'));
            }
        }

        // Construct final palindrome
        String right = new StringBuilder(left).reverse().toString();
        return middle == 0 ? left.toString() + right : left.toString() + middle + right;
    }
}
