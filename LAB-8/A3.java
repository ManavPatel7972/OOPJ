/*
The Transport interface declares a deliver () method. The abstract class Animal is the 
super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is 
implemented by the Camel and Donkey classes. Write a test program that initialize an 
array of four Animal objects. If the object implements the Transport interface, the 
deliver () method is invoked. 
 */
public class A3{
    public static void main(String[] args) {
        Animal [] obj = new Animal[4];
        obj[0] = new Camel();
        obj[1] = new Tiger();
        obj[2] = new Deer();
        obj[3] = new Donkey();

        obj[0].display();
        obj[1].display();
        obj[2].display();
        obj[3].display();
       ((Transport) obj[0]).deliver();
       ((Transport) obj[3]).deliver();
    }
}
 interface Transport {
    public void deliver();
}

abstract class Animal  {
   abstract public void display();
}
class Tiger extends Animal{
    public void display(){
        System.out.println("Inside Tiger Display method call...");
    }
}
class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Inside camel Diliver method call...");
    }
    public void display(){
        System.out.println("Inside Camel Display method call...");
    }
}
class Deer extends Animal{
    public void display(){
        System.out.println("Inside Deer Display method call...");
    }
}
class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Inside donkey Diliver method call...");
    }
    public void display(){
        System.out.println("Inside Donkey Display method call...");
    }
}
