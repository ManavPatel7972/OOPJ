/*
Write a program to create circle class with area function to find area of circle. [A] 
 */
import java.util.Scanner;

public class A1_AreaClass {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		Circle c1 = new Circle(100.0);

		// System.out.println("Enter a radius:");
		// c1.radius = sc.nextDouble();

		 c1.calcuArea();
		

	}

}

class Circle{
	double radius;
	double area;
	double pi = 3.14;

	Circle(double radius){
		this.radius = radius;
	}

	public void  calcuArea(){

		area = pi * radius * radius;
		System.out.println("Area of cirlce = " + area);
	}

}