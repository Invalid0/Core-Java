package Basic_DSA.ArrayProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Largest_Element_in_the_Array {
    public static void main(String[] args) {
        SystemOut.print("Enter Array Size");
        int value = SystemIn.input().nextInt();
        int arr[] = new int[value];
        int largest = arr[0];
        for(int i =0; i< value; i++){
            SystemOut.printN("Enter the of array to index = "+i+ " ");
            arr[i] = SystemIn.input().nextInt();
        }
        SystemOut.print("Finding Largest Number in an Array");
        for(int i=0; i<value; i++){
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        SystemOut.print("Largest Element in an array = "+largest);
    }
}
