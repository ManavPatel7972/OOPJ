import java.util.Scanner;

public class B4_areaOfCircle{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a radius:");

		double radius = sc.nextDouble();

		double pi = 3.14;

		double area = pi * radius * radius;

		System.out.println("Area of cirlce is = " + area);



	}
}