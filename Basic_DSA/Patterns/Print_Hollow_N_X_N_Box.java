package Basic_DSA.Patterns;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Print_Hollow_N_X_N_Box {
    public static void main(String[] args) {
        SystemOut.print("Enter Number to print hollow *");
        int value = SystemIn.input().nextInt();

        for(int i = 0; i<value; i++){
            for (int j=0; j<value; j++){
                if (j == 0 || i == 0 || i == value -1 || j == value - 1){
                    SystemOut.printN("*");
                } else {
                    SystemOut.printN(" ");
                }
                
            }
            SystemOut.print("");
        }
    }
}
