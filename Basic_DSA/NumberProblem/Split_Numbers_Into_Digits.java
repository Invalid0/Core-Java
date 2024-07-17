package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Split_Numbers_Into_Digits {
    public static void main(String[] args) {
        SystemOut.print("Enter the number to Splid in to an digit");
        int value = SystemIn.input().nextInt();
        while (value != 0) {
            int mod = value % 10;
            SystemOut.print(""+ mod);
            value /= 10;
        }
    }
}
