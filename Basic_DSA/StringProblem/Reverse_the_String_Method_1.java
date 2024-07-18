package Basic_DSA.StringProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Reverse_the_String_Method_1 {
    public static void main(String[] args) {
        SystemOut.print("Enter String");
        var str = SystemIn.input().nextLine();
        var strCopy = new StringBuilder(str);
        int index = 0;
        try{
            while (index < strCopy.length() / 2) {
                var temp = strCopy.charAt(index);
                strCopy.setCharAt(index, strCopy.charAt(strCopy.length() - index - 1));
                strCopy.setCharAt(strCopy.length() - index - 1, temp);
                SystemOut.print(""+strCopy);
                index++;
            }
        } catch(Exception e){
        }
        SystemOut.print("String = "+strCopy);
    }
}
