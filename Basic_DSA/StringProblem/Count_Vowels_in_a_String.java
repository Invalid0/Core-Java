package Basic_DSA.StringProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Count_Vowels_in_a_String {
    public static void main(String[] args) {
        SystemOut.print("Enter String To Count OVELS -> ");
        String str = SystemIn.input().nextLine();
        int countOvels = 0;
        try {
            for(int i=0; str.charAt(i) != '\0'; i++){
                if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' || str.charAt(i) =='o' || str.charAt(i) == 'u'){
                    countOvels++;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        SystemOut.print("Total Ovels in String is = "+ countOvels);
    }
}
