//Write a program to check whether a year is leap year or not.[B]

import java.util.Scanner;
public class A7_PalindromeOrNot{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		int n = sc.nextInt();

		if(isPalindrome(n)){
			System.out.println(n + " is palindrome");
			

		}
		else{
			System.out.println(n + " is not palindrome");
		}


	}

	public static boolean isPalindrome(int n){

		int palindrome = n;
		int reverse = 0;
		

		while(palindrome != 0){

			 int id = palindrome %10;

			reverse = reverse *10 + id;

			palindrome = palindrome/10; 

		}

		if(reverse == n){
			return true;
		}
		else {
			return false;
		}

	}

}

