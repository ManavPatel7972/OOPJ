// The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
// Write a java program that demonstrates how to establish this class hierarchy. Declare 
// one instance variable of type String that indicates the color of a vegetable. Crete and 
// display instances of these objects. Override the toString() method of object to return a 
// string with the name of vegetable and its color. [A]



abstract class vegetable {
    String color;
}

class Potato extends vegetable {

    Potato(String color) {
        super.color = color;
    }

    public void Potato(String color) {
        super.color = color;
    }

    @Override
    public String toString() {
        return "potato{color:" + color + "}";
    }
}

class Brinjal extends vegetable {

    Brinjal(String color) {
        super.color = color;
    }

    public void Brinjal(String color) {
        super.color = color;
    }

    @Override
    public String toString() {
        return "Brinjal{color:" + color + "}";
    }
}

class Tomato extends vegetable {

    Tomato(String color) {
        super.color = color;
    }

    public void Tomato(String color) {
        super.color = color;
    }

    @Override
    public String toString() {
        return "Tomato{color:" + color + "}";
    }
}

public class A1 {

    public static void main(String[] args) {

        String c1 = "brown";
        String c2 = "purple";
        String c3 = "red";

        Potato p1 = new Potato(c1);
        Brinjal b1 = new Brinjal(c2);
        Tomato t1 = new Tomato(c3);

        System.out.println(p1);
        System.out.println(b1);
        System.out.println(t1);
    }
}
