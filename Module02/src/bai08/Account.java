package bai08;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.35;

	public Account(long accountNumber, String name, double balance) {
		if (accountNumber <= 0) {
			this.accountNumber = 999999;
		} else {
			this.accountNumber = accountNumber;
		}
		if (name.trim().equals("")) {
			this.name = "chưa xác định";
		} else {
			this.name = name;
		}
		if (balance < 50000) {
			this.balance = 50000;
		} else {
			this.balance = balance;
		}
	}

	public Account(long accountNumber, String name) {
		if (accountNumber <= 0) {
			this.accountNumber = 999999;
		} else {
			this.accountNumber = accountNumber;
		}
		if (name == null || name.equals("")) {
			this.name = "chưa xác định";
		} else {
			this.name = name;
		}
	}

	public Account() {
		this.accountNumber = 999999;
		this.name = "chưa xác định";
		this.balance = 50000;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amount) {
		if(amount >0) {
			balance += amount;
			return true;
		}
		return false;
	}

	public boolean withdraw(double amount, double fee) {
		if(amount > 0 && (amount + fee) <= balance) {
			balance = balance - (amount + fee);
			return true;
		}
		return false;
	}

	public void addInterest() {
		balance = balance * (1 + RATE);
	}

	public boolean transfer(Account acc2, double amount) {
		if (this.balance < amount) {
			return false;
		}
		acc2.deposit(amount);
		balance -= amount;
		return true;
	}

	public String toString() {
		Locale local = new Locale("vi", "vn");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
		return String.format("%-15d%-20s%-20s", accountNumber, name, formatter.format(balance));
	}

}