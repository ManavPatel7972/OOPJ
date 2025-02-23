/* Write a program to create basic calculator by getting 2 numbers and 
1 string (operation) from the user and apply the operation given in 
a string on the given numbers. 
*/

import java.util.Scanner;
public class B3_Calculator{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int n1 = sc.nextInt();

		System.out.println("Enter a number:");
		int n2 = sc.nextInt();

		System.out.println("Enter a Choice:");
		String choice = sc.next();
		

		if(choice.equals("+")){         // Here if(choice=="+") nakhvi to na chale kem ke String ae CLASS chhe.
			double sum = n1+n2;         // tethi tene method apvi pade = if(choice.equals("+"));
			System.out.println(sum);
		}
		else if(choice.equals("*")){
			double multi = n1*n2;
			System.out.println(multi);
		}
		else if(choice.equals("-")){
			double sub = n1-n2;
			System.out.println(sub);
		}

		else if(choice.equals("/")){

			if(n2 == 0){
				System.out.println("Division is not posible");
			}
			else{
			double div = n1/n2;
			System.out.println(div);
			}

		}

		else{
			
			System.out.println("not valid oprator:");
		}
		

 		
	}
}

