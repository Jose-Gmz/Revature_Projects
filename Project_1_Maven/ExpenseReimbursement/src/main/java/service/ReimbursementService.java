package service;

import java.sql.SQLException;
import java.util.List;

import daos.EmployeeDAO;
import daos.ReimbursementDAO;
import models.Employee;
import models.Reimbursement;

public class ReimbursementService {
	
	private ReimbursementDAO reimbursementDAO;
	private EmployeeDAO employeeDAO;
	
	public ReimbursementService() {
		this.reimbursementDAO = new ReimbursementDAO();
		this.employeeDAO = new EmployeeDAO();
		
	}
	
	//ReimbursementDAO methods
	
	public Reimbursement getReimbursement(int claimId) throws SQLException {
		return this.reimbursementDAO.get(claimId);
	}
	
	public List<Reimbursement> getAllReimbursements() throws SQLException{
		return this.reimbursementDAO.getAll();
	}
	
	public Reimbursement createNewReimbursement(Reimbursement a, int pokeId) throws SQLException {
		return this.reimbursementDAO.createReimbursement(a, pokeId);
	}
	
	public void updateReimbursement(Reimbursement a) throws SQLException{
		this.reimbursementDAO.update(a);
	}
	
	public void deleteReimbursement(Reimbursement a) throws SQLException {
		this.reimbursementDAO.delete(a);
	}
	
	//EmployeeDAO methods
	
	public Employee getEmployee(int pokeId) throws SQLException {
		return this.employeeDAO.get(pokeId);
	}
	
	public List<Employee> getAllEmployees() throws SQLException{
		return employeeDAO.getAll();
	}
	
	public Employee createNewEmployee(Employee a, int pokeId) throws SQLException{
		return employeeDAO.createEmployee(a, pokeId);
	}
	
}
