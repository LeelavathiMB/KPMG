package Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

	public class InsertExample {

	
		public static void main(String[] args) {
		try {
			String username="root";
			String password="pass@word1";
			String url="jdbc:mysql://localhost:3306/kpmg";
					
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection successful");
			String query ="Insert into customer values (101,'leela',21,'bengalore')";
			Statement s1=con.createStatement();
			int count=s1.executeUpdate(query);
			System.out.println(count + "row/rows are inserted");
;
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}

	}

