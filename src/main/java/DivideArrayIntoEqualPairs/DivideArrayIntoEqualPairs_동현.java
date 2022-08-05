package DivideArrayIntoEqualPairs;

import java.util.Arrays;


import static org.assertj.core.api.Assertions.assertThat;

public class DivideArrayIntoEqualPairs_동현 {
    
     public static void main(String[] args) {
          Solution solution = new Solution();
          
          int[] nums = {3,2,3,2,2,2};
          assertThat(solution.divideArray(nums)).isEqualTo(true);

         int[] num2 = {1,2,3,4};
         assertThat(solution.divideArray(num2)).isEqualTo(false);
      }
      
      static class Solution {
          public boolean divideArray(int[] nums) {

              Arrays.sort(nums);
              
              for(int i = 0; i< nums.length; i = i + 2) {
                  if(nums[i] != nums[i+1]) {
                      return false;
                  }
              }
              return true;
          }
      }
}
