import java.util.Scanner;
public class reverseNumber{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entet a number:");
		int a = sc.nextInt();

		while(a>0){
			a %=10 ;
			System.out.print(a);
			a /= 10 ;
		}

		
	}
}
