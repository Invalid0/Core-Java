package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemOut;

/**
 * Find_Array_Size
 */
public class Find_Array_Size {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        SystemOut.print("Array Size = "+arraySize(arr));
    }

    public static int arraySize(int[] arr){
        int index = 0;
        while (arr[index] != '\0') {
            SystemOut.print("Arr = "+arr[index]);
            index++;
        }
        return 0;
    }
}