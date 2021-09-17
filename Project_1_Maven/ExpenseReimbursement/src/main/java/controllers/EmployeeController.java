package controllers;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class EmployeeController {
	private static Javalin application;
	
	public static void init(Javalin app) {
		application = app;
		application.get("/testEmployee", EmployeeController::testEmployeeConnection);
		
		
	}
	
	public static void testEmployeeConnection(Context ctx) {
		ctx.status(200);
		ctx.result("Employee test Received!!");
	}
	
}
