package controllers;

import java.sql.SQLException;
import java.util.List;

import com.revature.ConnectionFactory;

import daos.AccountDAO;
import daos.ClientDAO;
import io.javalin.Javalin;
import io.javalin.http.Context;
import models.Account;
import models.Client;

public class AccountController {
	private static Javalin application;
	
	public static void init(Javalin app) {
		application = app;
		app.get("/testAccount", AccountController::testAccountConnection);
		app.get("/getClientAccounts/:client_id", AccountController::getClientAccounts);
		app.get("/selectClientAccount/:account_id", AccountController::getSpecificAccount);
		
	}
	
    public static void testAccountConnection(Context ctx) {
        ctx.status(200);
        ctx.result("Account Test Received!!!");
    }
    
    public static void getClientAccounts(Context ctx) throws SQLException{
    	AccountDAO dao = new AccountDAO(ConnectionFactory.getConnection());
    	
    	List<Account> tempList = dao.clientAccounts(Integer.parseInt(ctx.pathParam("client_id")));
    	ctx.json(tempList);
  
    	
    	
    }
    
    public static void getSpecificAccount(Context ctx) throws SQLException{
    	AccountDAO dao = new AccountDAO(ConnectionFactory.getConnection());
    	Account row = dao.selectAccount(Integer.parseInt(ctx.pathParam("account_id")));
    	ctx.json(row);
    }
    
    public static void createAccount(Context ctx, Context ctx2) throws SQLException{
    
    }
    
    public static void depositMoney(Context ctx)throws SQLException {
    	
    }
	
}
