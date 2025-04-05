/*
Write a program to create Account class, which is representing a bank account where 
we can deposit and withdraw money. If user need to withdraw money which exceed 
our minimum bank balance then it will not be allowed, and will throw  
InSufficientFundException(Custom Exception). Handle above exception and display 
proper error message. [A] 
 */

// import javax.naming.InsufficientResourcesException;

public class A2 {
    public static void main(String[] args) throws InSufficientFundException {
        Account a1 = new Account(1500);
        a1.withdraw(1000);
    }
}

class Account {
    int amount;
    int balance;
    private static final int MIN_BALANCE = 1000;

    public Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InSufficientFundException{
            this.amount = amount;
        try{

            if(balance - amount >= MIN_BALANCE ){
                balance -= amount;
                System.out.println("Withdraw Successfully...");
                System.out.println("Withdraw amount = " + amount + " Your Current Balance =" + balance);
            }
            else{
                throw new InSufficientFundException("Invalid balance Your balance is " + balance + " MIN_BALANCE is required = " + MIN_BALANCE);
            }
        }catch(InSufficientFundException e){}
    
    }
}
class InSufficientFundException extends Exception{
     public InSufficientFundException(String str){
        System.out.println(str);
    }
}

