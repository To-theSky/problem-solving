package productOfArray;

import static org.assertj.core.api.Assertions.assertThat;

/* O(n)으로 풀것 */
public class ProductOfArray_장호 {
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
            return null;
        }
    }
}
