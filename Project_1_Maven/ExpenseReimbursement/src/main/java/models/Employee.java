package models;

public class Employee {
	
	int pokeId;
	String pokeEmail;
	private String password;
	String isManager;

	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int pokeId, String pokeEmail) {
		super();
		this.pokeId = pokeId;
		this.pokeEmail = pokeEmail;
	}


	public Employee(int pokeId, String pokeEmail, String password, String isManager) {
		super();
		this.pokeId = pokeId;
		this.pokeEmail = pokeEmail;
		this.password = password;
		this.isManager = isManager;
	}



	public int getPokeId() {
		return pokeId;
	}



	public void setPokeId(int pokeId) {
		this.pokeId = pokeId;
	}



	public String getPokeEmail() {
		return pokeEmail;
	}



	public void setPokeEmail(String pokeEmail) {
		this.pokeEmail = pokeEmail;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getisManager() {
		return isManager;
	}

	public void setManager(String isManager) {
		this.isManager = isManager;
	}
	

	
}
