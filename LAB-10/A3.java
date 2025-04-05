/*
 Write a java program to create Custom Exception ( DarshanUniException). Catch this 
exception using throw clause and print appropriate message. [A] 
 */

public class A3 {
    public static void main(String[] args) throws DarshanUniException {
        DURes d1 = new DURes();

        d1.printRes(20);
    }
}

class DURes {

    public void printRes(int marks) {
        try{
              if (marks < 33) {
                  throw new DarshanUniException("Your are Fail....." + "Your mark is " + marks);
                }
            }catch(DarshanUniException e){}
    }   

}

class DarshanUniException extends Exception{
    DarshanUniException(String str) {
        System.out.println(str);
    }
}
