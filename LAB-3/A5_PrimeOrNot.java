import java.util.Scanner;

public class A5_PrimeOrNot{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		int n = sc.nextInt();

		int i = 2;

		while(i<=n/2){

			if(n%i != 0){
				System.out.println(n + " " + "is prime a prime number");
				break;
			}
			else{
				System.out.println(n + " " + " is not a prime number");
				break;
			}
			
			i++;
			

		}
		

		


	}
}