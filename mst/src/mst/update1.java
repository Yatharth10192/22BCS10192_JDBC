package mst;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
public class update1 {
	public static void main(String [] args) throws SQLException, ClassNotFoundException {
	 String city = "bahadurgarh";
	 String email = "yatharth@gmail.com";
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/22bcs10192","root", "Yatharth@10192");
		PreparedStatement ps = con.prepareStatement("update registeration set city=? where email = ?");
		ps.setString(1, city);
		ps.setString(2, email);
		
		int i = ps.executeUpdate();
		if(i>0)
		{
			System.out.println("updated successfully!");
		}
		else {
			System.out.println("updation failed");
		}
	}

}
