package Basic_DSA.ArrayProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Sum_of_the_Elements_in_the_Array {
    public static void main(String[] args) {
        SystemOut.print("Enter Array Size");
        int value = SystemIn.input().nextInt();
        int arr[] = new int[value];
        int sum = 0;
        for (int i = 0; i<value; i++){
            SystemOut.printN("Enter value to index = :"+i+" ");
            arr[i] = SystemIn.input().nextInt();
            SystemOut.print("");
        }
        SystemOut.print("caluclating sum.....................");

        for(int j = 0; j< value; j++){
            sum += arr[j];
        }
        SystemOut.print("Sum of Array = "+sum);
    }
}
