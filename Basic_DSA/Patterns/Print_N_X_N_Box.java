package Basic_DSA.Patterns;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Print_N_X_N_Box {
    public static void main(String[] args) {
        SystemOut.print("Enter the value to print * ");
        int value = SystemIn.input().nextInt();
        for(int i = 0; i<value; i++){
            for(int j = 0; j<value; j++){
                SystemOut.printN("*");
            }
            SystemOut.print("");
        }
    }
}
