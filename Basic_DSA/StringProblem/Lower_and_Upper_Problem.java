package Basic_DSA.StringProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Lower_and_Upper_Problem {
    public static void main(String[] args) {
        SystemOut.print("Enter String to Convert Lower to Upper Case");
        var str = SystemIn.input().nextLine();
        var modifyStr = new StringBuilder(str);
        var index = 0;

        try{
            while (index < modifyStr.length()) {
                char ch = modifyStr.charAt(index);
                if(ch >= 'a' && ch <= 'z'){
                    modifyStr.setCharAt(index, (char) (ch - 32));
                } else {
                    modifyStr.setCharAt(index,(char) (ch + 32));
                }
                index++;
            }
        } catch(Exception e) {

        }
        SystemOut.print(""+modifyStr);
    }
}
