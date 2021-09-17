package utils;

import java.sql.Connection;

import controllers.EmployeeController;
import controllers.ReimbursementController;
import io.javalin.Javalin;

public class EntryPoint {

	    
 public static void main(String[] args) {

     Javalin app = Javalin.create().start(8000);
     
     
     EmployeeController.init(app);
     ReimbursementController.init(app);
    
        
}
 
}

