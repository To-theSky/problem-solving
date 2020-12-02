package townJudge;

import static org.assertj.core.api.Assertions.assertThat;

public class TownJudge_동현 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int N;
        int trust[][];
        int ans;

        N = 2;
        trust = new int[][]{{1, 2}};
        ans = 2;
        assertThat(solution.findJudge(N, trust)).isEqualTo(ans);

        N = 3;
        trust = new int[][]{{1, 3}, {2, 3}};
        ans = 3;
        assertThat(solution.findJudge(N, trust)).isEqualTo(ans);

        N = 3;
        trust = new int[][]{{1, 3}, {2, 3}, {3, 1}};
        ans = -1;
        assertThat(solution.findJudge(N, trust)).isEqualTo(ans);

        N = 3;
        trust = new int[][]{{1, 2}, {2, 3}};
        ans = -1;
        assertThat(solution.findJudge(N, trust)).isEqualTo(ans);
    }

    static class Solution {
        public int findJudge(int N, int[][] trust) {
            return 0;
        }
    }
}
