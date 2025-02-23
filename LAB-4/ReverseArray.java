// Write a program to print given array in reverse order.[A]

import java.util.Scanner;

public class ReverseArray{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Array length:");
		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i = 0;i<a.length;i++){
			System.out.println("Enter a Array element of  " + i);
			a[i] = sc.nextInt();
		}

		System.out.println("Before reverseorder:");
		for(int i = 0;i<a.length;i++){
			
			System.out.print(a[i] + " ");

		}
		
		System.out.println("After reverseorder:");
		for(int i = a.length-1;i>=0;i--){
			
			System.out.print(a[i] + " ");

		}
	}
}