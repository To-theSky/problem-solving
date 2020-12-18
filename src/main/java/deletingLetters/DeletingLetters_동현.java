package deletingLetters;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class DeletingLetters_동현 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s;
        int cost[];
        int ans;

        s = "bbbaaa";
        cost = new int[]{4,9,3,8,8,9};
        ans = 23;
        assertThat(solution.minCost(s, cost)).isEqualTo(ans);

        s = "abaac";
        cost = new int[]{1, 2, 3, 4, 5};
        ans = 3;
        assertThat(solution.minCost(s, cost)).isEqualTo(ans);

        s = "abc";
        cost = new int[]{1, 2, 3};
        ans = 0;
        assertThat(solution.minCost(s, cost)).isEqualTo(ans);

        s = "aabaa";
        cost = new int[]{1, 2, 3, 4, 1};
        ans = 2;
        assertThat(solution.minCost(s, cost)).isEqualTo(ans);
    }
    static class Solution {
        public int minCost(String s, int[] cost) {
            char[] originString = s.toCharArray();
            int ans = 0;

            for(int i=0; i<originString.length-1; i++ ) {
                if(isIdenticalLetterOccur(originString[i],originString[i+1])){
                    int[] result = deleteLetters(originString, cost, originString[i], i);
                    ans += result[0];
                    i += result[1]-1;
                }
            }
            return ans;
        }

        private int[] deleteLetters(char[] originString, int[] cost, char c, int index) {
            int[] returnArray = new int[2];
            int ans = 0;
            int scope = findDuplicateScope(originString,c,index);

            int[] rangeCost = Arrays.copyOfRange(cost, index, index + scope);
            Arrays.sort(rangeCost);

            for(int i=0; i<scope-1; i++) {
                ans += rangeCost[i];
            }

            returnArray[0] = ans;
            returnArray[1] = scope;
            return returnArray;
        }


        private int findDuplicateScope(char[] originString, char c,int index) {
            int ans = 1;
            for(int i=index+1; i<originString.length; i++) {
                if(originString[i] == c) {
                    ans++;
                }
                else {
                    return ans;
                }
            }
            return ans;
        }

        private boolean isIdenticalLetterOccur(char p1, char p2) {
            return p1==p2;
        }
    }

}
