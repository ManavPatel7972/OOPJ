/*
Write an application that executes two threads. One thread displays "Good Morning" 
every 1000 milliseconds & another thread displays "Good Afternoon" every 3000 
milliseconds. Create the threads by implementing the Runnable interface. [A] 
*/ 

import java.util.*;
public class A2 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);

        t1.start();
        t2.start();

        
    }
}

class Demo implements Runnable{

   
        public void run(){
            while(true){
                System.out.println("Good Morning");
                try{
                Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
        
                System.out.println("Good Afternoon");
                try{
                    Thread.sleep(3000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
        }
    
}
