package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
	public static void main(String[] args) throws Throwable {
	
		String username="root";
		
		System.out.println("Changes");
		
		String password="pass@word1";
		String url="jdbc:mysql://localhost:3306/kpmg";		
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection successful");
	} 
	

	}

