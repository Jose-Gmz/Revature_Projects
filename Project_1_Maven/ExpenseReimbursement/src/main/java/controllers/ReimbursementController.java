package controllers;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class ReimbursementController {
	private static Javalin application;
	
	public static void init(Javalin app) {
		application = app;
		application.get("/testReimbursement", ReimbursementController::testReimbursementConnection);
	}
	
	public static void testReimbursementConnection(Context ctx) {
		ctx.status(200);
		ctx.result("Reimbursement test Received!!");
	}
}
