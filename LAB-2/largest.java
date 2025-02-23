import java.util.Scanner;
public class largest{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entet a number:");
		int a = sc.nextInt();

		System.out.println("Entet a number:");
		int b = sc.nextInt();

		int largest = (a>b) ? a : b;

		System.out.println("Largest of two = " + largest);

		
	}
}
