package palindromeumber;

import AverageOfLevelsInBinaryTree.AverageOfLevel_장호;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeNumber_동현 {

    public static void main(String[] args) {
        PalindromeNumber_동현.Solution solution = new PalindromeNumber_동현.Solution();

        assertThat(solution.isPalindrome(121)).isTrue();
        assertThat(solution.isPalindrome(11111)).isTrue();
        assertThat(solution.isPalindrome(11)).isTrue();
        assertThat(solution.isPalindrome(-121)).isFalse();

    }

    static class Solution {
        public boolean isPalindrome(int x) {
            String input = String.valueOf(x);
            char[] chars = input.toCharArray();
            
            int startIndex = 0;
            int endIndex = input.length() - 1;

            while (startIndex < endIndex) {
                if (chars[startIndex] != chars[endIndex]) {
                    return false;
                }
                startIndex++;
                endIndex--;
            }
            return true;
        }
    }
}
