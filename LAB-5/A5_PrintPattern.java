/*Write an interactive program to print a string entered in a pyramid form. For instance, 
the string "stream" has to be displayed as follows:[A]

s 
st 
str 
stre 
strea 
stream

*/

public class A5_PrintPattern{
	public static void main(String args[]){

		


		for(int i = 0;i<6;i++){
			for(int j=0;j<=i;j++){
				String str = "stream";
				System.out.print(str.charAt(j));
			}
			System.out.println();

		}
	}
}

