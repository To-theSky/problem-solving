package MakeArrayUnique;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class MakeArray_동현 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[];
        int ans;

        arr = new int[]{1, 2, 2};
        ans = 1;
        assertThat(solution.minIncrementForUnique(arr)).isEqualTo(ans);

        arr = new int[]{3, 2, 1, 2, 1, 7};
        ans = 6;
        assertThat(solution.minIncrementForUnique(arr)).isEqualTo(ans);
    }
    static class Solution {
        public int minIncrementForUnique(int[] A) {
            int ans = 0;
            Arrays.sort(A);
            if (A.length == 0)
                return ans;
            //1, 1, 2, 2, 3, 7

            int beforeNumber = A[0];
            for (int i = 1; i < A.length; i++) {
                if (beforeNumber < A[i]) {
                    beforeNumber = A[i];
                }else {
                    ans += (beforeNumber - A[i]) + 1;
                    beforeNumber++;
                }
            }
            return ans;
        }
    }
}
