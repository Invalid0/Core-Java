package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Swap_Two_Numbers {
    public static void main(String[] args) {
        SystemOut.print("Enter two number to swap two numbers");
        int value_1 = SystemIn.input().nextInt();
        int value_2 = SystemIn.input().nextInt();
        int storeValue_1 = value_1;
        value_1 = value_2;
        value_2 = storeValue_1;
        SystemOut.print("Value_1 = "+value_1+" Value_2 = "+value_2);
    }
}
