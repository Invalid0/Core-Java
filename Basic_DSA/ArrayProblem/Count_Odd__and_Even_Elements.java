package Basic_DSA.ArrayProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Count_Odd__and_Even_Elements {
    public static void main(String[] args) {
        SystemOut.print("Enter Array Length");
        int arrLength = SystemIn.input().nextInt();
        int arr[] = new int[arrLength];
        int totalOdd = 0, totalEven = 0;
        for(int i = 0; i<arrLength; i++){
            SystemOut.printN("Insert into " + i +" Index ");
            arr[i] = SystemIn.input().nextInt();
        }
        SystemOut.print("Counting Even and Odd");

        for(int i = 0; i<arrLength; i++){
            if (arr[i] % 2 == 0){
                totalEven++;
            } else {
                totalOdd++;
            }
        }
        SystemOut.print("Total Even = "+totalEven+ " Total Odd = "+ totalOdd);
    }
}
