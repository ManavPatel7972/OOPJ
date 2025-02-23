//Write a program to print prime numbers between given range. [C]


import java.util.Scanner;

public class A8_RangeOfPrime {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

        System.out.println("Enter Staring number");
        int start = sc.nextInt();

        System.out.println("Enter Endding number");
        int end = sc.nextInt();
      

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    
    public static boolean isPrime(int n) {
       
        if (n <= 1) {
        	return false;
        } 


        for (int i = 2; i <= n/2; i++) { 
            if (n % i == 0) {

            	return false;
            } 
        }
        return true; 
    }
}
