package currentNumber;

import static org.assertj.core.api.Assertions.assertThat;

public class CurrentNumber_동현 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[];
        int ans[];

        nums = new int[]{8, 1, 2, 2, 3};
        ans = new int[]{4, 0, 1, 1, 3};
        assertThat(solution.smallerNumbersThanCurrent(nums)).isEqualTo(ans);

        nums = new int[]{6, 5, 4, 8};
        ans = new int[]{2, 1, 0, 3};
        assertThat(solution.smallerNumbersThanCurrent(nums)).isEqualTo(ans);

        nums = new int[]{7, 7, 7, 7};
        ans = new int[]{0, 0, 0, 0};
        assertThat(solution.smallerNumbersThanCurrent(nums)).isEqualTo(ans);
    }

    static class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            return null;
        }
    }
}
