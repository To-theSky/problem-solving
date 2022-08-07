package leetcode.p392;

import static org.assertj.core.api.Assertions.assertThat;
public class P392 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        assertThat(solution.isSubsequence("abc","ahbgdc")).isTrue();
        assertThat(solution.isSubsequence("axc","ahbgdc")).isFalse();
        assertThat(solution.isSubsequence("a","a")).isTrue();
        assertThat(solution.isSubsequence("acb","ahbgdc")).isFalse();
    }

    static class Solution {
        public boolean isSubsequence(String s, String t) {

            if(s.length() == 0 && t.length() == 0)
                return true;
                
            
            if(t.length() == 0)
                return false;
            
            int index = 0;
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                
                for (int j = index; j < t.length(); j++) {
                    char target = s.charAt(i);
                    index = t.indexOf(target,index);
                    
                    if(index == -1) {
                        return false;
                    } else {
                        index++;
                        count++;
                        break;
                    }

                }
            }
            
            if(count == s.length()) {
                return true;
            }
            return false;
        }
    }

}
