// Xavier Nazario
// Student ID# 2512208

// Program that creates an account
// Account ID 1122
// Balance $20,000
// Annual Interest Rate 4.5%
// Withdraw $2,500
// Deposit $3,000

package nazario9;

public class AccountTest {

	public static void main(String[] args) {

		// Create account with ID:1122
		// Balance: $20,000
		// Annual Interest Rate: 4.5%
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);

		// Withdrawing $2,500
		account.withdraw(2500);

		// Depositing $3,000
		account.deposit(3000);

		// Display balance
		// Display monthly interest
		// Display date account created
		System.out.println("Balance is " + account.getBalance());
		System.out.println("Monthly interest is " + account.getMonthlyInterest());
		System.out.println("This account was created at " + account.getDateCreated());
	}

}
