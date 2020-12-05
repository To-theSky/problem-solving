package productOfArray;

import static org.assertj.core.api.Assertions.assertThat;

/* O(n)으로 풀것 */
public class ProductOfArray_동현 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int nums[];
        int ans[];

        nums = new int[]{1, 2, 3, 4};
        ans = new int[]{24, 12, 8, 6};
        assertThat(solution.productExceptSelf(nums)).isEqualTo(ans);
    }

    static class Solution {
        public int[] productExceptSelf(int[] nums) {

            int length = nums.length;

            int[] L = new int[length];
            int[] R = new int[length];
            int[] answer = new int[length];

            L[0] = 1;
            for (int i = 1; i < length; i++) {
                L[i] = nums[i - 1] * L[i - 1];
            }

            R[length - 1] = 1;
            for (int i = length - 2; i >= 0; i--) {
                R[i] = nums[i + 1] * R[i + 1];
            }

            for (int i = 0; i < length; i++) {
                answer[i] = L[i] * R[i];
            }

            return answer;
        }
    }
}
