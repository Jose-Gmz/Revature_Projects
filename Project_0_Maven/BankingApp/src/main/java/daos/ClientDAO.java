package daos;

import models.Account;
import models.Client;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO implements Dao<Client>{
	
    private List<Client> clientTables;
    Connection connection;

    public ClientDAO(Connection conn) {
        clientTables = new ArrayList<>();
        connection = conn;
    }

    @Override
    public Client get(int id) throws SQLException{
    	String sql = "Select * FROM clients WHERE client_id = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1,id);
        
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()) {
	        Client row = new Client();
	        System.out.println("Client ID:" + rs.getInt("client_id"));
	        System.out.println("Client Name: " + rs.getString("name"));
	        row.setClientId(rs.getInt("client_id"));
	        row.setname(rs.getString("name"));

	        
	        return row;
        }else {
        	return null;
        }
    }

    @Override
    public List<Client> getAll() throws SQLException{
    	String sql = "SELECT * FROM clients";
    	PreparedStatement pstmt = connection.prepareStatement(sql);
    	ResultSet rs = pstmt.executeQuery();
    	
    	while(rs.next()) {
    		Client row = new Client();
    		row.setClientId(rs.getInt("client_id"));
    		row.setname(rs.getString("name"));
    		
    		clientTables.add(row);
	        System.out.println("Client ID:" + rs.getInt("client_id"));
	        System.out.println("Client Name: " + rs.getString("name"));
    	}
    	
        return clientTables;
        
    }

   
    @Override
    public void save(Client client) throws SQLException{
    	
    	String sql1 = "INSERT INTO accounts_clients (client_id,account_id) VALUES (?,?)";
    	PreparedStatement pstmt1 = connection.prepareStatement(sql1);
    	pstmt1.setInt(1, client.getClientId());
    	pstmt1.setInt(2, client.getAccountId());
  
    	
    	String sql2 = "INSERT INTO clients (name,client_id) VALUES (?,?)";
    	PreparedStatement pstmt2 = connection.prepareStatement(sql2);
    	pstmt2.setString(1, client.getname());
    	pstmt2.setInt(2, client.getClientId());
    	
    	String sql3 = "INSERT INTO accounts (account_id,balance) VALUES (?,?)";
    	PreparedStatement pstmt3 = connection.prepareStatement(sql3);
    	pstmt3.setInt(1, client.getAccountId());
    	pstmt3.setDouble(2, client.getBalanceForPrimary());
    	
    	if(pstmt1.executeUpdate() > 0 && pstmt2.executeUpdate() > 0 && pstmt3.executeUpdate() > 0) {
    		pstmt1.getResultSet();
    		pstmt2.getResultSet();
    		pstmt3.getResultSet();
    	
    	}
    	
    }

    @Override
    public void update(Client customer, String[] params) {

    }

    @Override
    public void delete(Client customer) {

    }
}
