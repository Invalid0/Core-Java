package Algorithms.Sort;

import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class BubbleSort  {
   public static void main(String[] args) {
    int arr[] = {25,50,5,20,10};
    sort(arr);
    printArray(arr);
   }
   
   public static void sort(int arr[]){
    for(int i = 0; i<arr.length - 1; i++){
        for(int j=0; j<arr.length - 1 - i; j++){
            if (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1]; 
                arr[j+1] = temp;
            }
        }
    }
   }
   public static void printArray(int arr[]){
    for(int i=0; i<arr.length; i++){
        SystemOut.print("arr = "+arr[i]);
    }
   }
}
/*
 * Time Complexity = O(n2)
 */
