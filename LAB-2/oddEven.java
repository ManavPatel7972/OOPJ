import java.util.Scanner;
public class oddEven{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entet a number:");
		int a = sc.nextInt();

		String str= (a&1)==0 ? "even": "odd" ;

		System.out.println(str);
		
	}
}
