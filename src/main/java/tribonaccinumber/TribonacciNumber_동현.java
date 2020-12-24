package tribonaccinumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TribonacciNumber_동현 {

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
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);
            list.add(1);
            for (int i = 3; i <= n; i++) {
                final int sum = list.get(i - 3) + list.get(i - 2) + list.get(i - 1);
                list.add(sum);
            }

            return list.get(n);
        }
    }
}
