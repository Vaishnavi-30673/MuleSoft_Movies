package movies;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import movies.DatabaseConnection;

public class DatabaseCreation {
	static Scanner sc=new Scanner(System.in);
	public static void createDB() {
		try
		{
			DatabaseConnection db=new DatabaseConnection();
			db.dbconnection();
			Connection con=db.con;
			Statement stmt = con.createStatement();
			String dbname;
			System.out.println("Enter the database name you want to create");
			dbname=sc.next();
			String qry = " create database "+dbname;
			stmt.executeUpdate(qry);
			System.out.println("database created");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	public static void main(String[] args) {
		createDB();
	}

}
