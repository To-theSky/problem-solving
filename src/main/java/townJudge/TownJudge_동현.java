package townJudge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
            //1차원, 나를 믿는 사람의 수, 2차원 내가 믿는 사람의 수
            int[][] trustArrays = new int[N][2];

            for (int i = 0; i < trust.length; i++) {
                trustArrays[trust[i][1] - 1][0]++;
                trustArrays[trust[i][0] - 1][1]++;
            }


            int ans = -1;
            for (int i = 0; i < trustArrays.length; i++) {
                if (trustArrays[i][0] == N-1 && trustArrays[i][1] == 0) {
                    ans = i +1;
                }
            }

            return ans;
        }
    }
}
