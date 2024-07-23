package Basic_DSA.NumberProblem;

import Basic_DSA.NumberProblem.CommonClass.SystemIn;
import Basic_DSA.NumberProblem.CommonClass.SystemOut;

public class Fibonacci_Series {
    public static void main(String[] args) {
        SystemOut.print("Enter the number for caluclate Fibonacci Series");
        int value = SystemIn.input().nextInt();
        int a = 0;
        int b = 1;
        int c = a + b;
        int index = 0;
        while (index < value) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            index++;
        }
    }
}
