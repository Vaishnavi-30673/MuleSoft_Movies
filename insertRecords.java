package movies;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class insertRecords {
	static Scanner sc=new Scanner(System.in);
	public static void addRecords() {
		try
		{
			DatabaseConnection db=new DatabaseConnection();
			db.dbconn();
			Connection con=db.con;
			Statement stmt = con.createStatement();
			String name,actor,actress,year,director;
			System.out.println("Enter movie name: ");
			name=sc.next();
			System.out.println("Enter actor: ");
			actor=sc.next();
			System.out.println("Enter actress: ");
			actress = sc.next();
			System.out.println("Enter year: ");
			year =sc.next();
			System.out.println("Enter director: ");
			director = sc.next();
			String qry = "insert into movies value("+name+","+actor+","+actress+","+year+","+director+");";
			stmt.executeUpdate(qry);
			System.out.println("records are inserted");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		addRecords();
	}

}
