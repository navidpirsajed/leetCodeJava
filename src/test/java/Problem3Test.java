import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import NavidPirsajed.Problem3;

public class Problem3Test {

    private final Problem3 solution = new Problem3();

    @Test
    public void testLengthOfLongestSubstringExample1() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"),
                "The length of the longest substring without repeating characters in 'abcabcbb' should be 3.");
    }

    @Test
    public void testLengthOfLongestSubstringExample2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"),
                "The length of the longest substring without repeating characters in 'bbbbb' should be 1.");
    }

    @Test
    public void testLengthOfLongestSubstringExample3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"),
                "The length of the longest substring without repeating characters in 'pwwkew' should be 3.");
    }

    @Test
    public void testLengthOfLongestSubstringExample4() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"),
                "The length of the longest substring without repeating characters in 'dvdf' should be 3.");
    }

    @Test
    public void testLengthOfLongestSubstringExample5() {
        assertEquals(1, solution.lengthOfLongestSubstring("   "),
                "The length of the longest substring without repeating characters in '   ' should be 1.");
    }

    @Test
    public void testLengthOfLongestSubstringExample6() {
        assertEquals(5, solution.lengthOfLongestSubstring("anviaj"),
                "The length of the longest substring without repeating characters in 'anviaj' should be 5.");
    }

    @Test
    public void testEmpty() {
        assertEquals(1, solution.lengthOfLongestSubstring(" "),
                "The length of the longest substring without repeating characters in \' \' should be 1.");
    }
}
