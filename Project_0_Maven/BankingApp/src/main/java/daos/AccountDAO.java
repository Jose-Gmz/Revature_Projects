package daos;

import models.Account;
import models.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class AccountDAO implements Dao<Account>{
	private List<Account> accountList;
    Connection connection;

    public AccountDAO(Connection conn) {
        accountList = new LinkedList<>();
        connection = conn;
    }

    @Override
    public Account get(int id) {
        return null;
    }

    @Override
    public List<Account> getAll() {
        return null;
    }

    @Override
    
    
    public void save(Account account) throws SQLException{
    
    	

    }

    @Override
    public void update(Account account, String[] params) {

    }

    @Override
    public void delete(Account account) {

    }
    
    public void createNewAccount(Account account, Client client)throws SQLException{
   
    	    	
    }
    
    //Methods implemented for RESTful
    
    public List<Account> clientAccounts(int clientid) throws SQLException{
    	String sql = "SELECT a.account_id, a.balance FROM clients c JOIN accounts_clients ac ON c.client_id = ac.client_id JOIN accounts a ON ac.account_id = a.account_id WHERE c.client_id = ?";
    	PreparedStatement pstmt = connection.prepareStatement(sql);
    	pstmt.setInt(1, clientid);
    	ResultSet rs = pstmt.executeQuery();
    	ResultSet rs2 = pstmt.executeQuery();
    	
    	while(rs.next() && rs2.next()) {
    		Account row = new Account();
    		row.setAccountId(rs.getInt("Account_id"));
    		row.setAccountBalance(rs2.getDouble("balance"));
    		accountList.add(row);
    		System.out.println("Client account:" + rs.getInt("account_id"));
    		System.out.println("Client balance:" + rs.getDouble("balance"));
    	}
    	return accountList;
    	
    }
    
    public Account selectAccount(int accountid) throws SQLException{
    	String sql = "SELECT * FROM accounts a WHERE account_id LIKE ?";
    	PreparedStatement pstmt = connection.prepareStatement(sql);
    	pstmt.setInt(1, accountid);
    	ResultSet rs = pstmt.executeQuery();
    	Account row = new Account();
    	if(rs.next()) {
    		row.setAccountId(rs.getInt("account_id"));
    		row.setAccountBalance(rs.getDouble("balance"));
    		
    		System.out.println("Account id:" + rs.getInt("account_id"));
    		System.out.println("Account balance:" + rs.getDouble("balance"));
    		return row;
    	}else{
    		return null;
    	}
    	
    }
    
    public void depositAccount(Account account, byte[] a)throws SQLException{
    
		}
    	
    	
    
}
