/*
Write an interactive program to print a diamond shape. For example, if user enters 
the number 3, the diamond will be as follows:[B] 

  * 
 * * 
* * * 
 * * 
  * 

*/

public class B6_DimondPattern{
	public static void main(String args[]){

		int n = 3;

		for(int i=1;i<=3;i++){
			for(int space=1;space<=n-i;space++){
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){
				System.out.print(" *");
			}
			System.out.println();

		}
		for(int i = n-1 ;i>=1;i--){
			for(int space=1;space<=n-i;space++){
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}