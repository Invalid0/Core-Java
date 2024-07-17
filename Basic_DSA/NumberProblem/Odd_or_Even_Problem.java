package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Odd_or_Even_Problem {
    public static void main(String[] args) {
        SystemOut.print("Enter the number to check Even or Odd");
        int value = SystemIn.input().nextInt();
        String validate = (value % 2 == 0) ? "Even" : "Odd";
        SystemOut.print("value you entered is = "+validate); 
    }
}
