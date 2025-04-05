/*
Create interface EventListener with performEvent() method. Create MouseListener 
interface which inherits EventListener along with mouseClicked(), mousePressed(), 
mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener 
interface which inherits EventListener along with keyPressed(), keyReleased() methods. 
WAP to create EventDemo class which implements MouseListener and KeyListener and 
demonstrate all the methods of the interfaces. [A]
 */

public class A4 {
    public static void main(String[] args) {
        EventDemo e = new EventDemo();
        e.keyPressed();
        e.keyReleased();
        e.mouseClicked();
        e.mouseDragged();
        e.mouseMoved();
        e.mousePressed();
        e.mouseReleased();
    }
}

class EventDemo implements MouseListener,KeyListener{

    public void performEvent() {
        System.out.println("method performEvent");
        
    }

    
    public void keyPressed() {
        System.out.println("method keyPressed");
    }

    
    public void keyReleased() {
        System.out.println("method keyReleased");
    }

    
    public void mouseClicked() {
        System.out.println("method mouseClicked");
    }

    
    public void mousePressed() {
        System.out.println("method mousePressed");
    }

    public void mouseReleased() {
        System.out.println("method mouseReleased");
    }

    
    public void mouseMoved() {
        System.out.println("method mouseMoved");
    }

   
    public void mouseDragged() {
        System.out.println("method mouseDragged");
    }
    
}

 interface EventListener {
    public void performEvent();
}

 interface MouseListener extends EventListener {
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}
interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyReleased();
}

