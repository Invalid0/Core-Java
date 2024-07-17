package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Factor_of_a_Number {
    public static void main(String[] args) {
        SystemOut.print("Enter a number to caluclate a Factor of a number");
        int firstNum = SystemIn.input().nextInt();
        int secondNum = SystemIn.input().nextInt();
        String ans = (firstNum % secondNum == 0) ? "Yes" : "No";
        SystemOut.print("Factor of a number "+ans);
    }
}
