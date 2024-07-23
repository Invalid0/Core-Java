package Basic_DSA.Patterns;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class print_Priramid {
    public static void main(String[] args) {
        SystemOut.print("Enter Number to print an primad pattern");
        int value = SystemIn.input().nextInt();
        for(int i = 0; i<value; i++){
            for(int j = 0; j<i; j++){
                SystemOut.printN("*");
            }
            SystemOut.print("");
        }
    }
}
