package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertValuesDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dburl, username, password);
		
		
		String title = "The Amazing Spider-Man";
		String genre = "Action";
		String director = "Stan-Lee ";
		String release_year = "2002";
		
		PreparedStatement ps = con.prepareStatement("insert into movies values(?,?,?,?)");
		
		ps.setString(1, title);
		ps.setString(2, genre);
		ps.setString(3, director);
		ps.setString(4, release_year);
		
		ps.executeUpdate();
		
		System.out.println("Values inserted");
		
		con.close();
	}

}
