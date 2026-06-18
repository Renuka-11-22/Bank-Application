
public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private int pin;
	private double balance;
	
	BankAccount(int accountNumber, String accountHolderName,int pin,double balance){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.balance = balance;
	}
	
	boolean login(int enteredPin) {
		if(enteredPin == pin) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void checkBalance() {
		System.out.println("Current Balance: " + balance);
	}
	
	void deposit(double amount) {
		if(amount >0) {
			balance += amount;
			System.out.println("Amount Deposited Successfully");
			System.out.println("Updated Balance: " + balance);
		}
		else {
			System.out.println("Invalid Deposit Amount");
		}
	}
	
	void withdraw(double amount) {
		if(balance > amount && amount > 0) {
			balance -= amount;
			System.out.println("Amount Withdrawn Successfully");
			System.out.println("Updated Balance: " + balance);
		}
		else {
			if(amount > balance) {
				System.out.println("Insufficient Balance.");
			}
			else if(amount <= 0) {
				System.out.println("Invalid Withdrawal Amount");
			}
		}
	}
	
	void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
	}
}
