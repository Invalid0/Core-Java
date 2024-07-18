package Basic_DSA.StringProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class String_Length {
    public static void main(String[] args) {
        SystemOut.print("Enter String to Find length");
        String str = SystemIn.input().nextLine();
        int totalLength = 0;
       try {
        for(int i=0;str.charAt(i) != '\0' ; i++){
            totalLength++;
        }
       } catch (Exception e) {
        // 
       }
       SystemOut.print("Total length of String = "+ totalLength);
    }
}
