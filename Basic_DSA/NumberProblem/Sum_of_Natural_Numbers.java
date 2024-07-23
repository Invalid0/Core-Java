package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Sum_of_Natural_Numbers {
    public static void main(String[] args) {
        SystemOut.print("Enter the num to cluclate the sum of natural number");
        int value = SystemIn.input().nextInt();
        int total = 0;
        for(int i = 0; i<=value; i++ ){
            total += i;
        }
        SystemOut.print("sum of all natural number = "+ total);
    }
}
