import java.util.Scanner;
public class positiveOrNegative{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entet a number:");
		int a = sc.nextInt();

		String str= a>0 ?"positive":"negative";

		System.out.println(str);
		
	}
}
