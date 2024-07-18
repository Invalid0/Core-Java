package Basic_DSA.ArrayProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Search_an_Element_in_the_Array {
    public static void main(String[] args) {
        SystemOut.print("Enter Size of an array");
        int value = SystemIn.input().nextInt();
        int arr[] = new int[value];
        for(int i =0 ; i< value; i++){
            SystemOut.printN("Insert Value to an Array index = "+ i+" ");
            arr[i] = SystemIn.input().nextInt();
        }
        SystemOut.print("Enter the Element You want to search");
        int searchElement = SystemIn.input().nextInt();
        for(int i =0; i<value; i++){
            if (arr[i] == searchElement){
                printElement(i,searchElement,true);
                break;
            } else {
                printElement(i, searchElement, false);
            }
        }
    }
    public static void printElement(int index, int element, boolean isFound){
        String found = isFound ?  "Search Element Found in this index = "+ index : "Search Element not found in this array";
        SystemOut.print(found);
    }
}
