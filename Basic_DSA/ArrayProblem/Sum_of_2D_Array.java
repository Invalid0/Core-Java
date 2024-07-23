package Basic_DSA.ArrayProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Sum_of_2D_Array {
    public static void main(String[] args) {
        SystemOut.print("Enter the n*n Array Size");
        int value = SystemIn.input().nextInt();
        int arr[][] = new int[value][value];
        int sum = 0;
        for(int i = 0; i< value; i++){
            for(int j=0; j< value; j++){
                SystemOut.printN("Insert value to i = "+i + " j = "+j+" ");
                arr[i][j] = SystemIn.input().nextInt();
            }
        }
        SystemOut.print("Calucating the Sum of 2D array................");
        for(int i=0; i< value; i++){
            for(int j=0; j<value; j++){
                sum += arr[i][j]; 
            }
        }
        SystemOut.printN("Sum of 2D array = "+sum);
    }
}
