package sumclosest3;

import integertoRoman.IntegertoRoman_동현;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/3sum-closest/
 */
public class SumClosest3_동현 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = new int[]{-1, 2, 1, -4};
        assertThat(solution.threeSumClosest(nums, 1)).isEqualTo(2);

        nums = new int[]{-0, 0, 0};
        assertThat(solution.threeSumClosest(nums, 1)).isEqualTo(0);

        nums = new int[]{1,1,1,0};
        assertThat(solution.threeSumClosest(nums, -100)).isEqualTo(2);

        //-1 0 1 2 3 4 5 6 7     ,, 3
        //small : 0 large : 18
    }

    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Set<Integer> list = new HashSet<>();
            int for1 = 0;
            int for2 = 0;
            int for3 = 0;

            for (int i = 0; i < nums.length - 2; i++) {
                for1 = nums[i];
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for2 = nums[j];
                    for (int k = j + 1; k < nums.length; k++) {
                        for3 = nums[k];
                        list.add(for1 + for2 + for3);
                    }
                }
            }

            LinkedList<Integer> list2 = new LinkedList<>(list);
            list2.add(target);
            Collections.sort(list2);

            int i = list2.indexOf(new Integer(target));
     
            int before = getBefore(list2,i,target);
            int after = getAfter(list2,i,target);

            boolean contains = list.contains(target);

            if (contains) {
                return target;
            } else {
                // -1 1
                int abs1 = Math.abs(before - target);
                int abs2 = Math.abs(after - target);

                if (abs1 < abs2) {
                    return before;
                } else {
                    return after;
                }
            }
        }
        public static int getBefore(List<Integer> list, int index, int target) {
            Integer result = 0;
            try {
                 result = list.get(index - 1);
            } catch (IndexOutOfBoundsException e) {
                return list.get(1);
            }
            return result;
        }

        public static int getAfter(List<Integer> list, int index, int target) {
            Integer result = 0;
            try {
                 result = list.get(index + 1);
            } catch (IndexOutOfBoundsException e) {
                return list.get(list.size()-2);
            }
            return result;
        }
    }
}
