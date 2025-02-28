
public class B5_ComplexNumber {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 20);
        Complex c2 = new Complex(20,30);
       
       c2 =  c1.additionComplexNumber(c2);

       System.out.println(c2.rel + "+" + c2.img + "i");


    }
}

class Complex {
    int rel;
    int img;

    Complex(){
        this.rel = 0;
        this.img = 0;
    }

    Complex(int rel, int img) {
        this.rel = rel;
        this.img = img;
    }

    public Complex additionComplexNumber(Complex obj){
        obj.rel = this.rel + obj.rel;
        obj.img = this.img + obj.img; 

        return obj;
    }

    public void printComplexNumber(){
        System.out.println("Addition of Complex Number = " + this.rel + " + " +  this.img + "i" );
    }

}
