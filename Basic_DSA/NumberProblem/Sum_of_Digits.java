package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Sum_of_Digits {
    public static void main(String[] args) {
        SystemOut.print("Enter the number to spilit and Sum the number");
        int value = SystemIn.input().nextInt();
        int sum = 0;
        while (value != 0) {
            sum += value % 10;
            value /= 10;
        }
        SystemOut.print("Sum of enter number is "+sum);
    }
}
