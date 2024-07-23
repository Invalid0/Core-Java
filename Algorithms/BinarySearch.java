package Algorithms;

import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        boolean searchElement = searchElement(0, arr.length - 1,arr,30);
        if (searchElement){
            SystemOut.print("Element Found");
        } else {
            SystemOut.print("Element Not Found");
        }
    }
    public static Boolean searchElement(int start, int end, int arr[], int searchElement){
        int midElement = 0;
        while (start <= end) {
            midElement = (start + end) / 2;
            SystemOut.print("Mid = "+ midElement);
            if (arr[midElement] == searchElement){
                return true;
            }
            if (searchElement > arr[midElement]){
                start = midElement + 1;
            } else {
                end = midElement - 1;
            }
        }
        return false;
    }
}
/*
 * Timecomplexity = O(logn)
 */