package NavidPirsajed;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0, start = 0;

        int[] index = new int[128];

        for (int i = 0; i < index.length; i++) {
            index[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            start = Math.max(index[s.charAt(i)], start);
            maxLen = Math.max(i - start + 1, maxLen);
            index[s.charAt(i)] = i + 1;
        }

        return maxLen;
    }
}

// @lc code=end

/**
 * Problem3
 */
public class Problem3 extends Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcs"));
    }
}
