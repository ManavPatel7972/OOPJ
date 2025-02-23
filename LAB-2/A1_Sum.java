/*Write a program to get 2 numbers from the user and print the sum of 
two numbers using command line and Scanner class. */
import java.util.Scanner;
public class A1_Sum {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entet a number:");
		int a = sc.nextInt();

		System.out.println("Entet a number:");
		int b = sc.nextInt();

		System.out.println("Sum is = " + (a+b));
	}
}
