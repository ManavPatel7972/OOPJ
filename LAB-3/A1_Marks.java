/*
The marks obtained by a student in 5 different subjects are input through the
keyboard.
The student gets a division as per the following rules:
I. Percentage above or equals to 60-first division
II. Percentage between 50 to 59-second division
III. Percentage between 40 and 49-Third division
IV. Percentage less than 40-fail
Write a program to calculate the division obtained by the student.[A]
*/

import java.util.Scanner;

public class A1_Marks{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks Of subject 1 :");
		double math = sc.nextDouble();

		System.out.println("Enter Marks Of subject 2 :");
		double phy = sc.nextDouble();

		System.out.println("Enter Marks Of subject 3 :");
		double chem = sc.nextDouble();

		System.out.println("Enter Marks Of subject 4 :");
		double eng = sc.nextDouble();

		System.out.println("Enter Marks Of subject 5 :");
		double snaskrit = sc.nextDouble();

		double percentage = ((math + phy + chem + eng + snaskrit)* (100)/500) ;

		System.out.println("percentage = " + percentage);

		if(percentage >= 60){
			System.out.println("First division:");

		}

		else if(percentage>=50 && percentage<60){
			System.out.println("Second division:");
		}

		else if(percentage>=40 && percentage<50){
			System.out.println("Third division:");
		}

		else if(percentage<40){
			System.out.println(" Fail division:");
		}

		else{
			System.out.println("Not a Valid Marks:");
		}

	}
}