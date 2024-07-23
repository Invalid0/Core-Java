package Basic_DSA.ArrayProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Reverse_the_Array {
    public static void main(String[] args) {
        SystemOut.print("Enter Size of an Array");
        int value = SystemIn.input().nextInt();
        int arr[] = new int[value];
        int index = value - 1;
        for(int i = 0; i<value; i++){
            SystemOut.printN("Insert Value to an array = " + i + " ");
            arr[i] = SystemIn.input().nextInt();
        }
        SystemOut.print("Reversing An Aray.............");
        for(int i=0; i<value/2; i++){
            int tem = arr[i];
            arr[i] = arr[index];
            arr[index] = tem;
            index -= 1;
        }
        for(int i=0; i<value; i++){
            SystemOut.print(""+arr[i]);
        }
        
    }
}
