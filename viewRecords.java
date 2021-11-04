package movies;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class viewRecords {
	static Scanner sc=new Scanner(System.in);
	public static void printAllRows() {
		try
		{
			DatabaseConnection db=new DatabaseConnection();
			db.dbconn();
			Connection con=db.con;
			String qry = "select * from movies";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			while(rs.next()) {
				System.out.println("movie name: "+rs.getString(1));
				System.out.println("actor: "+rs.getString(2));
				System.out.println("actress: "+rs.getString(3));
				System.out.println("year: "+rs.getString(4));
				System.out.println("director: "+rs.getString(5));
				System.out.println();
			}			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		printAllRows();
	}

}
