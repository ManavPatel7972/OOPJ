//Write a program to find length of string and print second half of the //string.[B]


import java.util.Scanner;

public class PrintSecondHalf{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		

		System.out.println("Enter a String:");

		String str = sc.nextLine();

		int len = str.length();


		System.out.println("Length of String is = " + len);
		for(int i = len/2 ; i<str.length();i++){
			System.out.print(str.charAt(i));
		}
	}
}