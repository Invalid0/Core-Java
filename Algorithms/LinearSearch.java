package Algorithms;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class LinearSearch {
    public static void main(String[] args) {
        SystemOut.print("Enter the size of an array");
        int size = SystemIn.input().nextInt();
        int arr[] = new int[size];
        boolean elementFount = false;
        int searchElement = 0;
        for(int i=0; i<size; i++){
            SystemOut.print("Enter arrayElemnt index = "+i);
            arr[i] = SystemIn.input().nextInt();
        }
        SystemOut.print("Search An Element in an array");
        searchElement = SystemIn.input().nextInt();
        for(int i=0; i<arr.length; i++){
            if (arr[i] == searchElement){
                elementFount = true;
                break;
            }
            elementFount = false;
        }
        if (elementFount){
            SystemOut.printN("Element Present in an array");
        } else {
            SystemOut.printN("Element not fount in an array");
        }
    }
}
/*
 * T(x) = (n+1) + n
 * = 2n
 * = O(n)
 */