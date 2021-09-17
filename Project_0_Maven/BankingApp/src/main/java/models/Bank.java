package models;
import java.util.Random;
import models.Account;
import models.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Bank {

	
	private static Map<Client, ArrayList> clientAccountList;
	private static Map<Integer,Client> clientMap;

	public static Map<Client, ArrayList> getClientAccountList() {
		return clientAccountList;
	}

	public static void setClientAccountList(Map<Client, ArrayList> clientAccountList) {
		Bank.clientAccountList = clientAccountList;
	}
	

	public static Client createNewClient(String firstName, String lastName, int accountId) {
		
		
		return new Client();
	}
	
	public static void updateClient(String firstName, String lastName) {
		
	}
	
	
	//creating Id's for both account and client
	public static int createClientId(){	
		Random rand = new Random();
		int upperBound = 100;
		int int_random = rand.nextInt(upperBound);
		
		
		return int_random;
	}
	

	public static int createAccountId() {
		Random rand = new Random();
		int upperBound = 100;
		int int_random = rand.nextInt(upperBound);
		
		
		return int_random;
		
	}
	
	// Methods for Account.
	public static void depositMoney(double depositMoney, Account a) {	
		double tempAccountBalance = a.getAccountBalance();
		tempAccountBalance += depositMoney;
		a.setAccountBalance(tempAccountBalance);
			
	}
		
	public void withdrawMoney(double withdrawMoney, Account a) {
		double tempAccountBalance = a.getAccountBalance();
		tempAccountBalance -= withdrawMoney;
		a.setAccountBalance(tempAccountBalance);
	}
		
	//method will transfer from Account A to Account B	
	public void transferMoney(Account a, Account b, double transferMoney) {
		
		double tempAccountBalance1 = a.getAccountBalance();
		double tempAccountBalance2 = b.getAccountBalance();
		tempAccountBalance1 -= transferMoney;
		tempAccountBalance2 += transferMoney;
		a.setAccountBalance(tempAccountBalance1);
		b.setAccountBalance(tempAccountBalance2);
	}
		
		
	public double checkBalance(Account a) {
		return a.getAccountBalance();
	}

	//update and get ClientList
	public static void updateClientList() {}
	public static List<Client> getClientList() {
		return null;
	}
	
	//update and get ClientList
	public static void updateAccountList() {}
	public static List<Account> getAccountList() {
		return null;
	}
	
	//Update Map
	
	
}
