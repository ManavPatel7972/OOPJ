/*
 Write a program to demonstrate Arithmetic Exception and ArrayIndexOutOfBounds 
Exception using try-catch block. [A] 
 */

public class A1 {
    public static void main(String[] args) {
        try {

            int a = 10;
            int b = 0;

            int ans = a / b;
            System.out.println("Result = " + ans);

            int [] arr = new int[3];
            for(int i=0;i<5;i++){
                System.out.println(arr[i]);
            }

        } catch (ArithmeticException e) {
            System.out.println("Divide by zero is not possible : " + e.getMessage());
        }
          catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of Bound : " + e.getMessage());
        }
       
    }
}
