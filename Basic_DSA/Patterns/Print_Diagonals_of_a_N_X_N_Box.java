package Basic_DSA.Patterns;


import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Print_Diagonals_of_a_N_X_N_Box {
    public static void main(String[] args) {
        SystemOut.print("Enter number to Print Diagonals of a N X N Box");
        int value = SystemIn.input().nextInt();
        for(int i = 0; i< value; i++){
            for(int j=0; j< value; j++){
                if(i == j || j == i || (value - 1) - i == j){
                    SystemOut.printN("*");
                }
                 else{
                    SystemOut.printN(" ");
                }
            }
            
            SystemOut.print("");
        }
    }
}
