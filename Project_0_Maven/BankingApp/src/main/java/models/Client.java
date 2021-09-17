package models;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class Client {
	
	private String name;
	private int clientId;
	private int accountId;
	private double balanceForPrimary;
	
	
	
	//Constructors
	public Client() {
		super();
	}
	
	public Client(String name) {
		super();
		this.name = name;
		

		
		
	}
	
	public Client(String name, int clientId) {
		this(name);
		this.clientId = clientId;
		
		
	}
	
	public Client(String name, int clientId, int accountId) {
		this(name,clientId);
		this.accountId = accountId;
		
	
		
	}
	

	public Client(String name, int clientId, int accountId, double balanceForPrimary) {
		super();
		this.name = name;
		this.clientId = clientId;
		this.accountId = accountId;
		this.balanceForPrimary = balanceForPrimary;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}


	//Id getters and setters
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}


	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId= accountId;
	}

	public double getBalanceForPrimary() {
		return balanceForPrimary;
	}

	public void setBalanceForPrimary(double balanceForPrimary) {
		this.balanceForPrimary = balanceForPrimary;
	}

	
	





	

	
	
	
}
