package models;

public class Reimbursement {
	
	int claimId;
	String description;
	double amount;
	String reinbursementStatus;
	
	enum stateReibursement{
		APPROVED, DENIED, PENDING
	}
	
	//Constructors
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reimbursement(int claimId) {
		super();
		this.claimId = claimId;
	}

	public Reimbursement(int claimId, String description, double amount) {
		super();
		this.claimId = claimId;
		this.description = description;
		this.amount = amount;
	}

	

	public Reimbursement(int claimId, String description, double amount, String reinbursementStatus) {
		super();
		this.claimId = claimId;
		this.description = description;
		this.amount = amount;
		this.reinbursementStatus = reinbursementStatus;
	}
	
	//getters and setters

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReinbursementStatus() {
		return reinbursementStatus;
	}

	public void setReinbursementStatus(String reinbursementStatus) {
		this.reinbursementStatus = reinbursementStatus;
	}
	
	
	
}
