package Basic_DSA.ArrayProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Largest_and_Smallest_Element_in_the_Array {
    public static void main(String[] args) {
        SystemOut.print("Enter Size of an Array");
        int value = SystemIn.input().nextInt();
        int arr[] = new int[value];
        for(int i=0; i<value; i++){
            SystemOut.printN("Insert Value to array to index = "+i+" ");
            arr[i] = SystemIn.input().nextInt();
        }
        SystemOut.print("Finding largest and smallest Element in an array....................");
        int largest = arr[0], smallest = arr[0]; 
        for(int j=0; j<value; j++){
            if (largest < arr[j]){
                largest = arr[j];
            } else if (smallest > arr[j]){
                smallest = arr[j];
            }
        }
        SystemOut.print("Largest = "+largest+" Smallest = "+smallest);
    }
}
