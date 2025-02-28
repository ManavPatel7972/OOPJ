class Bank_Account {
	int accountNo;
	String userName;
	String email;
	String accountType;
	int accountBalance;

	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNo);
		System.out.println("User Name: " + userName);
		System.out.println("Email: " + email);
		System.out.println("Account Type: " + accountType);
		System.out.println("Account Balance: " + accountBalance);
	}

	public void getAccountDetails(int accountNo, String userName, String email, String accountType,
			int accountBalance) {
		this.accountNo = accountNo;
		this.userName = userName;
		this.email = email;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
}

public class A4_BankAccount {
	public static void main(String[] args) {
		Bank_Account b1 = new Bank_Account();

		b1.getAccountDetails(202, "Manav", "mkpatel7733@gmail.com", "saving",51);
		b1.displayAccountDetails();
	}
}
