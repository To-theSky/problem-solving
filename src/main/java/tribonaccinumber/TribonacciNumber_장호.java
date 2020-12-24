package tribonaccinumber;

import static org.assertj.core.api.Assertions.assertThat;

public class TribonacciNumber_장호 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int input,output;

        input = 4; output = 4;
       assertThat(solution.tribonacci(input)).isEqualTo(output);

        input = 25; output = 1389537;
        assertThat(solution.tribonacci(input)).isEqualTo(output);
    }

    static class Solution {

        public int tribonacci(int n) {
            return 0;
        }
    }
}
