package Test;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class ReadExample {

		
			public static void main(String[] args) {
			try {
				String username="root";
				String password="pass@word1";
				String url="jdbc:mysql://localhost:3306/kpmg";
						
				Connection con=DriverManager.getConnection(url,username,password);
				System.out.println("Connection successful");
				String query ="select * from customer";
				Statement s1=con.createStatement();
				ResultSet rs=s1.executeQuery(query);
				while(rs.next())
				{
					int id=rs.getInt(1);
					String name=rs.getString(2);
				    int age=rs.getInt(3);
				    String address=rs.getString(4);
				    System.out.println(id+"--"+name+"--"+age+"--"+address);
				    System.out.println("------------");
				}
				
	;
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			

}
