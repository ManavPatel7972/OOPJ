import java.util.Scanner;

public class BankAccount_Extra {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Bank acc1 = new Bank();

        while (true) {

            System.out.println(
                    "Enter operation \n 1.Diposite your amount \n 2.Withdrow your amount \n 3.Cheack your current balance \n 4.Exit");
            int operation = sc.nextInt();

            if (operation == 1) {
                System.out.println("Enter Your Account Number:");
                acc1.accountNumber = sc.nextInt();
                System.out.println("Verify Your Account Number : " + acc1.accountNumber);
                System.out.println("Enter 1 - for ok\nEnter 0 - for clancle");
                acc1.varify = sc.nextInt();

                if (acc1.varify == 1) {

                    System.out.println("Enter amount:");
                    acc1.diposite = sc.nextDouble();
                    acc1.setBalance(acc1.diposite);
                    System.out.println("Your amount is succesfully diposited:");

                }

            }

            else if (operation == 2) {

                System.out.println("Enter your Account Number:");
                acc1.accountNumber = sc.nextInt();

                System.out.println("Enter Amount you wnat to Withdrow:");
                acc1.withDrow = sc.nextDouble();
                acc1.setBalance(acc1.getBalance() - acc1.withDrow);
                System.out.println(" Withdrow Succesfull:");
            }

            else if (operation == 3) {
                System.out.println("Your Current Balance = " + acc1.getBalance());
            }

            else {
                System.out.println("Thank you !");
            }

        }
    }
}

class Bank {
    int accountNumber;
    String accountNamne;
    double diposite;
    double withDrow;
    int varify;
    private double balance;

    void setBalance(double balance) {

        if (balance < 0) {
            System.out.println("Not Sufficeint Balance Your Account:");
        } else {
            this.balance = balance;
        }
    }

   public double getBalance() {
        return this.balance;
    }
}
