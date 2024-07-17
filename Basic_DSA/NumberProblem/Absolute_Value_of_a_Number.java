package Basic_DSA.NumberProblem;

import java.util.Scanner;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Absolute_Value_of_a_Number {
    public static void main(String[] args) {
        SystemOut.print("Enter Number To Calucate Absolute Value");
        int value =SystemIn.input().nextInt();
        int validate = (value >= 0) ? value : -value;
        SystemOut.print("absolute value = "+validate);
    }
}
 