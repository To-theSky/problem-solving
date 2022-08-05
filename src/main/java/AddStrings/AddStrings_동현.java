package AddStrings;

import static org.assertj.core.api.Assertions.assertThat;

public class AddStrings_동현 {
     public static void main(String[] args) {
          Solution solution = new Solution();
          
          System.out.println('3'-'0');
          assertThat(solution.addStrings("11","123")).isEqualTo("134");
      }
      
      static class Solution {
          public String addStrings(String num1, String num2) {
              StringBuilder sb = new StringBuilder("");
              int idx1 = num1.length() - 1;
              int idx2 = num2.length() - 1;
              int carry = 0;
              while(idx1 >= 0 || idx2 >= 0 || carry > 0) {
                  int number = 0;
                  if(idx1 >= 0) {
                      number = num1.charAt(idx1) - '0';
                  }
                  
                  if(idx2 >= 0)
                      number = number + num2.charAt(idx2) - '0';
                  
                  number = number + carry;
                  carry = number / 10;

                  char digit=(char)(number%10+'0');
                  idx1--;
                  idx2--;
                  sb = sb.append(digit);
              }
              
              sb.reverse();
              return sb.toString();
          }
      }
}
