package com.BankingApp.models;

import java.util.Objects;

public class Client {
	private String firstName;
	private String lastName;
	private int clientId;
	
	public Client() {
		super();
	}
	
	public Client(String fname, String lname) {
		super();
		this.firstName = fname;
		this.firstName = lname;

		
		
	}
	
	public Client(String fname, String lname, int clientId) {
		this(fname,lname);
		this.clientId = clientId;
		
		
	}

	@Override
	public String toString() {
		return "Client [firstName=" + firstName + ", lastName=" + lastName + ", clientId=" + clientId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(clientId, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return clientId == other.clientId && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}
	
	
}
