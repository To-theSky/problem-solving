package deletingLetters;

import java.util.ArrayDeque;
import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class DeletingLetters_장호 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s;
        int cost[];
        int ans;

        s = "aaabbbabbbb";
        cost = new int[]{3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1};
        ans = 26;
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
            int cnt = 0, index = 0;
            char ss[] = s.toCharArray();
            char target = ss[0];

            for (int i = 1; i < s.length();i++) {
                if (target == ss[i]) {
                    cnt += Math.min(cost[index], cost[i]);
                    if (cost[index] < cost[i]) {
                        index = i;
                    }
                } else {
                    target = ss[i];
                    index = i;
                }
            }
            return cnt;
        }
    }
}
