/*
 Write a Java program to create an interface Playable with a method play() that takes no 
arguments and returns void. Create three classes Football, Volleyball, and Basketball 
that implement the Playable interface and override the play() method to play the 
respective sports. [C] 
 */

public class A6 {
    public static void main(String[] args) {
        Playable p1 = new Basketball();
        Playable p2 = new Football();
        Playable p3 = new Volleyball();
        p1.play();
        p2.play();
        p3.play();
    }
}
 interface Playable {
    public void play();    
}
class Football implements Playable{
    public void play(){
        System.out.println("Football play...");
    }
}
class Basketball implements Playable{
    public void play(){
        System.out.println("Basketball play...");
    }
}
class Volleyball implements Playable{
    public void play(){
        System.out.println("Vollryball play...");
    }
}
