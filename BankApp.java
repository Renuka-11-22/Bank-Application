
import java.util.*;
public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankAccount account = new BankAccount(1001,"Rahul",1234,5000.0);
		System.out.println("Enter user pin");
		int pin = sc.nextInt();
		if(account.login(pin) == true) {
			System.out.println("Login Successful");
			System.out.println("1.check Balance");
			System.out.println("2.Deposit Amount");
			System.out.println("3.Withdraw Amount");
			System.out.println("4.Display Account Details");
			System.out.println("5.Exit");
			
			while(true) {
				System.out.println();
				System.out.println("Enter your option:");
				int value = sc.nextInt();
			switch(value) {
			
			case 1 : account.checkBalance();
			break;
			case 2 : System.out.println("Enter the amount:");
					double amount = sc.nextDouble();
					account.deposit(amount);
					break;
			case 3 : System.out.println("Enter the amount:");
					double money = sc.nextDouble();
					account.withdraw(money);
					break;
					
			case 4: account.displayAccountDetails();
			break;
			
			case 5: System.out.println("Thank you for using the Bank Application");
				System.exit(0);
		
			}
			}
		}
		else {
			System.out.println("Invalid pin");
		}
		
	}

}