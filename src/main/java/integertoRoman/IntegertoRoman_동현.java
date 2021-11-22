package integertoRoman;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegertoRoman_동현 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertThat(solution.intToRoman(3)).isEqualTo("III");
        assertThat(solution.intToRoman(4)).isEqualTo("IV");
        assertThat(solution.intToRoman(58)).isEqualTo("LVIII");
    }

    static class Solution {
        public String intToRoman(int num) {
            String result = "";

            while(num != 0) {
                Result sResult = RomanNumber.subtract(num);
                num = sResult.subtractInt;
                result = result + sResult.symbol;
            }
            return result;
        }
    }

    enum RomanNumber {
        I("I", 1),
        V("V", 5),
        X("X", 10),
        L("L", 50),
        C("C", 100),
        D("D", 500),
        M("M", 1000);

        String symbol;
        int value;

        RomanNumber(String symbol, int value) {
            this.symbol = symbol;
            this.value = value;
        }

        public static Result subtract(int num) {
            RomanNumber[] romanNumbers = values();
            for (int i = romanNumbers.length-1; i >= 0; i--) {
                RomanNumber target = romanNumbers[i];
                //뺄수 있는지?
                if (target.value <= num) {
                    return new Result(num - target.value,target.symbol);
                }
                //마이너스가 있는지.
                for (int j = i-1; j >= 0; j--) {
                    //중복체크 ex) DM
                    Collection<Integer> values = Arrays.stream(values()).map(r -> r.value).collect(Collectors.toList());
                    boolean check1 = !values.contains(romanNumbers[i].value - romanNumbers[j].value);
                    int check2 = romanNumbers[i].value - romanNumbers[j].value;
                    if (check1 && num >= check2) {
                        return new Result(num - romanNumbers[i].value + romanNumbers[j].value, romanNumbers[j].symbol+romanNumbers[i].symbol);
                    }
                }
            }
            throw new RuntimeException();
        }
    }
    
    static class Result { 
        public int subtractInt;
        public String symbol;

        public Result(int subtractInt, String symbol) {
            this.subtractInt = subtractInt;
            this.symbol = symbol;
        }
    }
}
