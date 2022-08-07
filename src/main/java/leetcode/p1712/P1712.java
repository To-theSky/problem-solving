package leetcode.p1712;

import static org.assertj.core.api.Assertions.assertThat;
//다시 풀어보기
public class P1712 {
    
     public static void main(String[] args) {
          Solution solution = new Solution();
          
          assertThat(solution.waysToSplit(new int[]{1,1,1})).isEqualTo(1);
          assertThat(solution.waysToSplit(new int[]{1,2,2,2,5,0})).isEqualTo(3);
          assertThat(solution.waysToSplit(new int[]{3,2,1})).isEqualTo(0);
      }
      
      static class Solution {
          public int waysToSplit(int[] nums) {

              int res = 0, n = nums.length ;

              //presum
              for(int i = 1 ; i < n ; i++ )
                  nums[i] += nums[i-1];


              for(int i = 0; i <=  n - 3 ; i++ ){
                  int l = i + 1 , r = n - 2, m;
                  int ans = -1;

                  while(l <= r){
                      m = l + (r - l )/2;
                      if(nums[m] >= 2L* nums[i] ){
                          ans = m;
                          r = m -1;
                      }else{
                          l = m +1;
                      }
                  }

                  if(ans == -1)continue;

                  l = ans; r = n - 2;
                  int ans2 = -1;

                  while(l <= r){
                      m = l + (r - l )/2;

                      if(nums[n-1] + nums[i] >= 2*nums[m]  ){
                          ans2 = m;
                          l  = m + 1;
                      }else{
                          r = m - 1;
                      }
                  }
                  if(ans2 == -1)continue;

                  res = (res + ans2 - ans + 1)%1000000007;
              }

              return res;
          }
      }
}
