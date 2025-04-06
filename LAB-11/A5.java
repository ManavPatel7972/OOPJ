/*
Write a java program that implements a multi-thread application that has 
three threads. First thread generates random integer every 1 second and if 
the value is even, second thread computes the square of the number and 
prints. If the value is odd, the third thread will print the value of cube of 
the number. [B] 
 */

public class A5 {
    public static void main(String[] args) {
        Random r1 = new Random();
        r1.start();
        
    }
}
class Random extends Thread{
    int n;
   
    public void run() {
        while(true){
            this.n = (int) (Math.random() * 100);
            if(n % 2 == 0){
              Square s1=new Square(n);
              s1.start();
           }
           else{
               Cube c1 = new Cube(n);
               c1.start();
           }
        }
       
    }
}
class Square extends Thread{
    int n;

    public Square(int n) {
     this.n=n;
    }

    public  void run(){
        System.out.println("Squre of Number = "  + n*n);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        
    }
}

class Cube extends Thread{
    int n;
    public Cube(int n) {
        this.n=n;
    }
    public void run(){
        System.out.println("Cube of Number = " + n*n*n);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
    }
}

