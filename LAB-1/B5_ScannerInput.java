import java.util.Scanner;
public class B5_ScannerInput {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a:");
		int a = sc.nextInt();

		System.out.println("Enter b:");
		int b = sc.nextInt();

		System.out.println("Sum is = " + (a+b));

	}
}