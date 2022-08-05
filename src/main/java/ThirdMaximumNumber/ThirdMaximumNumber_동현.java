package ThirdMaximumNumber;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class ThirdMaximumNumber_동현 {
    
     public static void main(String[] args) {
          Solution solution = new Solution();
          
          assertThat(solution.thirdMax(new int[]{3,2,1})).isEqualTo(1);
          assertThat(solution.thirdMax(new int[]{1,2})).isEqualTo(2);
          assertThat(solution.thirdMax(new int[]{2,2,3,1})).isEqualTo(1);
          assertThat(solution.thirdMax(new int[]{1,1,2})).isEqualTo(2);
          assertThat(solution.thirdMax(new int[]{-3,-2,-1,0})).isEqualTo(-2);
      }
      
      static class Solution {
          public int thirdMax(int[] nums) {
              Arrays.sort(nums);
              HashMap<Integer,Integer> hashMap = new HashMap<>();
              Integer result = null;
              int count = 0;
              
              for(int i = 0; i < nums.length; i++) {
                  hashMap.put(nums[i],nums[i]);
              }
              
              if(nums.length < 3 || hashMap.size() < 3) {
                  return nums[nums.length - 1];
              }
              
              
              for(int i = nums.length - 1; i >= 0; i--) {
                  if(count == 3)
                      return result;
                  
                  if (result == null || result != nums[i]) {
                      result = nums[i];
                      count++;
                  }
              }
              
              return result;
          }
      }
}
