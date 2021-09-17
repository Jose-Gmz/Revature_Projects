package models;

import java.util.ArrayList;

public class Account {
	private int accountId;
	private double accountBalance;
	
	//Constructors
	
	public Account() {
		super();
	}
	
	public Account(int accoundId, double accountBalance) {
		super();
		this.accountId = accoundId;
		this.accountBalance = accountBalance;
		
	}
	

	
	// Getters and setters
	public int getAccountId() {
		return accountId;
	}
	
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	

	
	
	
	
}
