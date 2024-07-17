package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Reverse_a_Number {
    public static void main(String[] args) {
        SystemOut.print("Enter num to Reverse a number");
        int value = SystemIn.input().nextInt();
        int ans = 0;
        while (value != 0) {
            int mod = value % 10;
            ans = ans * 10 + mod;
            value /= 10;
        }
        SystemOut.print("Value = "+ans);
    }
}
