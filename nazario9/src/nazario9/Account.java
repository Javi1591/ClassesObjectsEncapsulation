// Xavier Nazario
// Student ID# 2512208

// Program for Account class

package nazario9;

// Import Date utility
import java.util.Date;

public class Account {

	// Private data fields
	// Use id, balance, annualInterestRate, dateCreated
	// Use int and double respectively
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {

		// Constructor for default account
		// No-arg constructor
		this(0, 0);
	}

	// Constructor for id and initial balance
	// Default interest rate is 0
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
		// Sets date
		this.dateCreated = new Date();
	}

	// Accessor methods
	// getId()
	public int getId() {
		return id;
	}

	// getBalance()
	public double getBalance() {
		return balance;
	}

	// getAnnualInterestRate()
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// getDateCreted()
	public Date getDateCreated() {
		return dateCreated;
	}

	// Mutator methods
	// setId()
	public void setId(int id) {
		this.id = id;
	}

	// setBalance()
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// setAnnualInterestRate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// Method getMonthlyInterestRate()
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// Method getMonthlyInterest()
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate() / 100;
	}

	// Method for withdrawals
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds.");
		}
	}

	// Method for deposits
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
}
