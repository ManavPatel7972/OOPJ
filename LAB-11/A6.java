/*
Write a complete multi-threaded program to meet following requirements: 
a. Read matrix [A] m x n 
b. Create m number of threads 
c. Each thread computes summation of elements of one row, i.e. ith row of the matrix 
is processed by ith thread. Where 0 <= i< m. 
d. Print the results. [C] 
 */

import java.util.Scanner;

public class A6 {

    static int m;
    static int n;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a row : ");
        m = sc.nextInt();

        System.out.println("Enter a col : ");
        n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Enter a Element " + "[" + i + "]" + "[" + j + "]");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // // System.out.println("Enter a Element " + "[" + i + "]" + "[" + j + "]");
        // // arr[i][j] = sc.nextInt();
        // System.out.print(arr[i][j]);
        // }
        // System.out.println();
        // }

        Summation[] t1 = new Summation[m];

        for (int i = 0; i < m; i++) {
            t1[i] = new Summation(arr[i], i);
            t1[i].start();
            // t1[i].printSum();
            t1[i].join();
        }
        Summation.print();
    }
}

class Summation extends Thread {
    int[] row;
    int index;
   static int sum;
    static int totalSum;

    Summation(int[] row, int index) {
        this.row = row;
        this.index = index;
    }

    public synchronized void run() {
        sum = 0;
        for(int i=0;i<row.length;i++){
            sum = sum + row[i];
        }
        
        System.out.println("Thread no - " + index + " Row Sum = " + sum); 
        totalSum += sum;
    }

    // public synchronized void printSum(){
    //     totalSum += sum;
    // }

    public static void print(){
        System.out.println("Total sum Of All Thread = " + totalSum);
    }
}
