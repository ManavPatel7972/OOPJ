import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            if (num < 10 || num > 50) {
                throw new OutOfRangeException("Error: Number is out of range (must be between 10 and 50).");
            } else {
                int square = num * num;
                System.out.println("Square of " + num + " is: " + square);
            }
        } catch (OutOfRangeException e) {
            e.printStackTrace();
        }
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}
