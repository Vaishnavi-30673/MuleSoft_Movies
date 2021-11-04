package movies;

import java.sql.Connection;
import java.sql.Statement;

public class createTable {
	public static void tableCreation() {
		try
		{
			DatabaseConnection db=new DatabaseConnection();
			db.dbconn();
			Connection con=db.con;
			Statement stmt = con.createStatement();
			String qry = " create table movies(name varchar(100) not null,actor varchar(100) not null ,"
					+ "actress varchar(100) not null, year varchar(100) not null, "
					+ "director varchar(100) not null);";
			stmt.executeUpdate(qry);
			System.out.println("Table movies created");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		tableCreation();

	}

}
