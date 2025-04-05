/*
 Write a Java program to create an interface Shape with the getArea() method. Create 
three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
Implement the getArea() method for each of the three classes. [B] 
 */

public class A5 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();

        s1.getArea();
        s2.getArea();
        s3.getArea();
        
    }
}
 interface Shape {
    public void getArea();    
} 
class Rectangle implements Shape{
    public void getArea(){
        System.out.println("Rectengle area called...");
    }
}
class Circle implements Shape{
    public void getArea(){
        System.out.println("Circle area called...");
    }
}
class Triangle implements Shape{
    public void getArea(){
        System.out.println("Triangle area called...");
    }
}
