package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Armstrong_Number {
    public static void main(String[] args) {
        SystemOut.print("Enter a number to check Armstrong Number or Not");
        int value = SystemIn.input().nextInt();
        int copyValue = value;
        int ans = 0;
        while (value != 0) {
            int mod = value % 10;
            ans += mod * mod * mod;
            value /= 10;
        }
        String checkValue = (copyValue != ans) ? "This Number is not an Armstrong Number" : "This number is an Armstrong Number ";
        SystemOut.print(checkValue + ans);
    }
}
