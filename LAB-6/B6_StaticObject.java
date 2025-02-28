//WAP that counts the number of objects created using static. [B] 


public class B6_StaticObject{
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = new Box();
        Box b4 = new Box();
        Box b5 = new Box();
        Box b6 = new Box();
        
        System.out.println();
        System.out.println("Total Count = " + Box.ObjectCount);
    }

}

class Box{

  public static int ObjectCount;

    Box(){
      System.out.println("Box Constructor is Called....");
      ObjectCount++;
    }

}


