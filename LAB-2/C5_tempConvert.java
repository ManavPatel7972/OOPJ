import java.util.*;
 /*Write a program to convert temperature from Fahrenheit to Celsius. 
(Formula : c = f-32*5/9 ); 
*/
public class C5_tempConvert{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a temprature in farenhit:");
		double farenhit = sc.nextDouble();

		double celsius = farenhit - 32*5/9 ;

		System.out.println("celsius = " + celsius);

	}
}