package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dburl, username, password);
		
		System.out.println("Successfully connected to Database");
		
		String query = "select * from movies";
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print(rs.getString("title") + "\t");  
			System.out.print(rs.getString("genre") + "\t");  
			System.out.print(rs.getString("director") + "\t");  
			System.out.println(rs.getString("release_year"));
		
			
		}
	con.close();
		
	}

}
