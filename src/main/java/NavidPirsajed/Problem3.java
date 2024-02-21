package NavidPirsajed;
/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

import java.util.HashSet;
import java.util.Set;

public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;

        Set<Character> buffer = new HashSet<>();

        int longestSubString = 0;
        int currentCount = 0;

        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                // ch = (ch == ' ') ? '_' : ch;
                arr[i] = 'a';
            } else {
                arr[i] = s.charAt(i);
            }
        }

        s = new String(arr);

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);

            if (!buffer.add(ch)) {
                buffer.clear();
                buffer.add(ch);
                currentCount = 1;
                if (s.charAt(i - 1) != ch) {
                    buffer.add(s.charAt(i - 1));
                    currentCount++;
                }
            } else {
                currentCount++;
            }
            longestSubString = (longestSubString < currentCount) ? currentCount : longestSubString;
        }

        res = longestSubString;

        return res;

    }

    // @lc code=start
    // Main method for testing
    public static void main(String[] args) {
        Problem3 solution = new Problem3();
        System.out.println(solution.lengthOfLongestSubstring("anviaj"));

    }
    // @lc code=end
}
