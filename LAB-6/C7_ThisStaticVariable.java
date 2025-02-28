//Write a program in Java to demonstrate use of this keyword. Check whether this can 
//access the Static variables of the class or not.[C] 

public class C7_ThisStaticVariable {
    public static void main(String[] args) {
        ThisNumber number = new ThisNumber(10,20);

        int res = number.sum();
        System.out.println("Result = " + res);

    }
}

class ThisNumber{
   static int n1;
    int n2;

    ThisNumber(int n1,int n2){
        this.n1 = n1;
        this.n2 = n2;
    }


    static int sum(){         // Here When this method cerated a static so given an error
                        // Because static variable is not access using This Keyword;
        return n1+n2;    

        // here given error because n2 is non static variable ;
        // inside a static methods only used static var,methods and static refernece;
    }
}

