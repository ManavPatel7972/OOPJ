//Write a program that creates and initializes a four integer element array. Calculate and 
//display the average of its values.[A] 

import java.util.Scanner;

public class InputArray{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Array length:");
		int n = sc.nextInt();

		int a[] = new int[n];
		int count = 0;
		int sum = 0;

		for(int i = 0 ;i<a.length;i++){
			System.out.println("Enter a Array element of  " + i);
			a[i] = sc.nextInt();
			sum += a[i];
			count++;
		}

		System.out.println("Avrage of array elements = " + sum/(float)count );




	}
}