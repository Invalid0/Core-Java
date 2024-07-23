package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Palindrome_Number {
    public static void main(String[] args) {
        SystemOut.print("Enter the number to check Palindrome Number or not");
        int value = SystemIn.input().nextInt();
        int copyValue = value;
        int reverseNum = 0;
        while (value != 0) {
            int mod = value % 10;
            reverseNum = reverseNum * 10 + mod;
            value /= 10;
        }
     
        if (copyValue != reverseNum){
            SystemOut.print("You entred is not an palindrome "+reverseNum);
        } else {
            SystemOut.print("You entred is an palindrome "+reverseNum);
        }
    }
}
