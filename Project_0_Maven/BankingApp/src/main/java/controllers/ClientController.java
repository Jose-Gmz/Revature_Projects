package controllers;

import io.javalin.Javalin;
import io.javalin.http.Context;

import java.sql.SQLException;
import java.util.List;

import models.Account;
import models.Client;


import com.revature.ConnectionFactory;

import daos.AccountDAO;
import daos.ClientDAO;


public class ClientController {
	private static Javalin application;
	
	public static void init(Javalin app) {
		application = app;
		app.get("/testClient", ClientController::testClientConnection);
		app.get("/getClientID/:client_id",ClientController::getById);
		app.get("/getAllClients", ClientController::getListOfClients);
		app.post("/createNewClient", ClientController::createClient);
	}
	
    public static void testClientConnection(Context ctx) {
        ctx.status(200);
        ctx.result("Client Test Received!!!");
    }
    
    public static void getById(Context ctx) throws SQLException{
    	ClientDAO dao = new ClientDAO(ConnectionFactory.getConnection());
    	
    	Client row = dao.get(Integer.parseInt(ctx.pathParam("client_id")));
    	ctx.json(row);
    }
	
    public static void getListOfClients(Context ctx) throws SQLException{
    	ClientDAO dao = new ClientDAO(ConnectionFactory.getConnection());
    	
    	List<Client> tempList = dao.getAll();
    	ctx.json(tempList);
    	
    }
    
    public static void createClient(Context ctx) throws SQLException{
    	ClientDAO dao = new ClientDAO(ConnectionFactory.getConnection());
    	Client row = ctx.bodyAsClass(Client.class);
    	dao.save(row);
    	
    	
    	
    	
    }
    

}
