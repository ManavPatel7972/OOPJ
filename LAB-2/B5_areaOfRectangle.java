import java.util.Scanner;

public class B5_areaOfRectangle{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a height:");
		double height = sc.nextDouble();

		System.out.println("Enter a length:");
		double length = sc.nextDouble();
		

		double area = height * length ;

		System.out.println("Area of Rectangle is = " + area);



	}
}