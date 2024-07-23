package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Sum_of_Natural_Numbers_Method_2 {
    public static void main(String[] args) {
        SystemOut.print("Enter the number to caluclate sum of natural number with O(1)");
        int value = SystemIn.input().nextInt();
        int ans = value * (value + 1) / 2;
        SystemOut.print("sum of natural number is = " + ans);
    }
}
