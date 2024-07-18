package Basic_DSA.StringProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class String_Copy {
    public static void main(String[] args) {
        SystemOut.print("Enter String");
        var str = SystemIn.input().nextLine();
        var index = 0;
        var copy_str = "";
        try{
            while (index < str.length()) {
                copy_str += str.charAt(index);
                index++;
            }

        } catch(Exception e){

        }
        SystemOut.print("Copy of String = "+copy_str);
    }
}
