package howManyNumbersAreSmallerThantheCurrentNumber;

import townJudge.TownJudge_동현;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class HowManyNumbersAreSmallerThantheCurrentNumber_동현 {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] output = new int[]{4, 0, 1, 1, 3};
        assertThat(solution.smallerNumbersThanCurrent(nums)).isEqualTo(output);

        nums = new int[]{6, 5, 4, 8};
        output = new int[]{2, 1, 0, 3};
        assertThat(solution.smallerNumbersThanCurrent(nums)).isEqualTo(output);

        nums = new int[]{7, 7, 7, 7};
        output = new int[]{0, 0, 0, 0};
        assertThat(solution.smallerNumbersThanCurrent(nums)).isEqualTo(output);
    }

    static class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] ans = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] > nums[j])
                        count++;
                }
                ans[i] = count;
            }

            return ans;
        }
    }
}
