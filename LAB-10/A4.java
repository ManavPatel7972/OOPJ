

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1, input2;
        int num1, num2;

        try {
            // Read inputs as strings
            System.out.print("Enter first number (Num1): ");
            input1 = sc.nextLine();

            System.out.print("Enter second number (Num2): ");
            input2 = sc.nextLine();

            // Try parsing strings to integers
            num1 = Integer.parseInt(input1);
            num2 = Integer.parseInt(input2);

            // Check and perform division
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
