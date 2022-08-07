package leetcode.p205;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class P205 {
    
     public static void main(String[] args) {
         Solution solution = new Solution();
         
         assertThat(solution.isIsomorphic("a","b")).isTrue();
         assertThat(solution.isIsomorphic("egg","add")).isTrue();
         assertThat(solution.isIsomorphic("foo","bar")).isFalse();
         assertThat(solution.isIsomorphic("paper","title")).isTrue();
         assertThat(solution.isIsomorphic("ab","cd")).isTrue();
         assertThat(solution.isIsomorphic("bbbaaaba","aaabbbba")).isFalse();
         
      }

    static class Solution {
        public boolean isIsomorphic(String s, String t) {

            int[] mappingDictStoT = new int[256];
            Arrays.fill(mappingDictStoT, -1);

            int[] mappingDictTtoS = new int[256];
            Arrays.fill(mappingDictTtoS, -1);

            for (int i = 0; i < s.length(); ++i) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);

                // Case 1: No mapping exists in either of the dictionaries
                if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
                    mappingDictStoT[c1] = c2;
                    mappingDictTtoS[c2] = c1;
                }

                // Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
                // it doesn't match in either of the dictionaries or both 
                else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
                    return false;
                }
            }

            return true;
        }
    }
}
