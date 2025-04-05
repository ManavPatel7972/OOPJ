/*
 Write a program that illustrates interface inheritance. Interface A is extended by A1 and 
A2. Interface A12 inherits from both A1 and A2.Each interface declares one constant 
and one method. Class B implements A12.Instantiate B and invoke each of its methods. 
Each method displays one of the constants. [A]
 */


public class Lab8_A2 implements A12 {

   public void printA(){
        System.out.println("InterFace A  = " + A);
    }
   public void printA1(){
        System.out.println("InterFace A1  = " + A1);
    }
   public void printA2(){
        System.out.println("InterFace A2  = " + A2);
    }
    public void printA12(){
        System.out.println("InterFace A12  = " + A12);
    }

    public static void main(String[] args) {
        Lab8_A2 obj = new Lab8_A2();
        obj.printA();
        obj.printA1();
        obj.printA2();
        obj.printA12();
        
    }
}

interface A{
    int A = 10;
  abstract public void printA();
}
 
 interface A1 extends A{
    int A1 = 20;
   abstract public void printA1();
}

 interface A2 extends A{
    int A2 = 30;
   abstract public  void printA2();
    
}
 interface A12 extends A1,A2{
    int A12 = 40;
   abstract public void printA12();

}
