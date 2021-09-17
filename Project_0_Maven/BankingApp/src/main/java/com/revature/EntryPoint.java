package com.revature;

import java.sql.Connection;

import controllers.AccountController;
import controllers.ClientController;

import io.javalin.Javalin;

public class EntryPoint {
	public static void main(String[] args) {
		
	
		
        Javalin app = Javalin.create().start(8000);
        Connection conn = ConnectionFactory.getConnection();
        ClientController.init(app);
        AccountController.init(app);

		
	}
}
