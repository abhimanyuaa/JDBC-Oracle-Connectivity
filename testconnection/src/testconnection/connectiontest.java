package testconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class connectiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("Succesfull");
			// step3 create the statement object
			//Statement stmt = con.createStatement();
			PreparedStatement statement= con.prepareStatement("Select* from testshop");
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				
				 * int id= rs.getInt(1); 
				 * String name=rs.getString(2); 
				 * String Address=
				 * rs.getString(3);
				 				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/

	try

	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("Succesfull");
		PreparedStatement statement = con.prepareStatement("insert into person values(?,?,?,?)");
		/*
		 * String username = person.getUsername(); String pass = person.getPassword();
		 * String sub = person.getSubject(); String gen = person.getGender();
		 */
		statement.setString(1, "username");
		statement.setString(2, "pass");
		statement.setString(3, "sub");
		statement.setString(4, "gen");
		int i = statement.executeUpdate();
		System.out.println(i + " records inserted");
		con.close();
	}catch(
	Exception e)
	{
		System.out.println(e.getMessage());
	}
}

}
