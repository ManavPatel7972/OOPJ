/*
 Define Time class with constructor to initialize hour and minute. Also define addition 
method to add two time objects. [A] 
 */

 public class A2_ConstructorTimeCalulate{
    public static void main(String[] args) {
        Time t1 = new Time(5, 20,50);
        Time t2 = new Time(3, 50,10);
        t1.additionTimeObj(t2);
        t1.printTime();
    }
 }

 class Time{
    int hour;
    int min;
    int sec;

    
    Time(int hour,int min,int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void additionTimeObj(Time obj){

        this.hour = this.hour + obj.hour;
        this.min = this.min + obj.min;
        this.sec = this.sec + obj.sec;

        if(this.sec >= 60){
            this.min++;
            this.sec = this.sec - 60;
        }

        if(this.min >= 60){
            this.hour++;
            this.min = this.min - 60;
        }

    }

    public void printTime(){

        System.out.println("Addition Of Time = " + this.hour + ":" + this.min + ":" + this.sec);
    }


 }

