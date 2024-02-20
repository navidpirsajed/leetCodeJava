package NavidPirsajed;

public class Problem3 {
    public int lengthOfLongestSubstring(String s) {

    }

    // Main method for testing
    public static void main(String[] args) {
        Problem3 solution = new Problem3();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb")); // Output: 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew")); // Output: 3
        System.out.println(solution.lengthOfLongestSubstring("")); // Output: 0
        System.out.println(solution.lengthOfLongestSubstring(" ")); // Output: 1
        System.out.println(solution.lengthOfLongestSubstring("au")); // Output: 2
        System.out.println(solution.lengthOfLongestSubstring("dvdf")); // Output: 3
    }
}
