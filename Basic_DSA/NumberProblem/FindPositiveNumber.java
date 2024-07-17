package Basic_DSA.NumberProblem;

import java.util.Scanner;

public class FindPositiveNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number to find the positive or negative");
        int value = userInput.nextInt();
        String validate = (value > 0) ? "Positive" : (value < 0) ? "Negative" : "Neither Positive nor Negative";
        System.out.println(validate);
    } 
}
