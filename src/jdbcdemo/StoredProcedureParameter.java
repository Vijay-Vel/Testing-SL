package JDBCDemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCprocedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		
		CallableStatement mystmt = con.prepareCall("{call changeyear_movie(?)}");
		mystmt.setString(1, "Inside Out");

		mystmt.execute();
       System.out.println("table is updated successfully");
       
       mystmt.close();
		
	}

}
