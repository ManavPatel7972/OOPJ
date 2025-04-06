/*
Write a program to create two threads, one thread will print odd numbers and second 
thread will print even numbers between 1 to 20 numbers. [B] 
 */

public class A4 {
    public static void main(String[] args) throws Exception {
        Even e = new Even();
        Odd o = new Odd();
        e.start();
        e.join();
        o.start();
        o.join();
    }
}

class Even extends Thread{
    public void run(){

     for(int i = 1;i<=20;i++){
        if((i % 2 == 0)){
            System.out.println("Even Number = " + i);
        }
        else{
           try {
            sleep(1000);
           } catch (Exception e) {
            e.printStackTrace();
           }
        }
     }
       
    }
}

class Odd extends Thread{
    public void run(){

        for(int i = 1;i<=20;i++){
            if((i % 2 != 0)){
                System.out.println("Odd Number = " + i);
            }
            else{
               try {
                sleep(1000);
               } catch (Exception e) {
                e.printStackTrace();
               }
            }
         }
        

       
    }
}
