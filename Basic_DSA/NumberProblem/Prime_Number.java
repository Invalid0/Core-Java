package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Prime_Number {
    public static void main(String[] args) {
        SystemOut.print("Enter num to Caluclate prime number");
        int value = SystemIn.input().nextInt();
        boolean flag = false;
        for(int i=2; i<value; i++) {
            flag = (value % i == 0) ? true : false;
            if (flag){
                break;
            }
        }
        String ans = flag ? "You entred an Prime_Number" : "You entred an not an Prime_Number";
        SystemOut.print("ANS = "+ ans);
    }

   
}
