package movies;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	static Connection con = null;
	public static void dbconnection() {
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			if(con!=null)
				System.out.println("Connection established");
			else
				System.out.println("Connection not established");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		dbconnection();

	}
	//connecting to specific database movies
	public static void dbconn(){
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
			if(con!=null)
				System.out.println("Connection established");
			else
				System.out.println("Connection not established");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
