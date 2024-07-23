package Basic_DSA.StringProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Compare_Two_Strings_Problem {
    public static void main(String[] args) {
        SystemOut.printN("Enter First String = ");
        String str_1 = SystemIn.input().nextLine();
        SystemOut.printN("Enter Second String = ");
        String str_2 = SystemIn.input().nextLine();
        int index = 0;
        boolean areSame = true;
       try{
        while (index < str_1.length() && index < str_2.length()) {
            if(str_1.charAt(index) != str_2.charAt(index)){
                areSame = false;
                break;
            }
            index++;
        }
        if (index != str_1.length() || index != str_2.length()){
            areSame = false;
        }
       } catch(Exception e){
        areSame = false;
       }

       String areSameString = areSame ? "Both are same" : "Both are not same";
       SystemOut.print(areSameString);

    }
}
