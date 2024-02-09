package mst;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class delete1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String email1 = "yatharth123@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/22bcs10192","root","Yatharth@10192");
		PreparedStatement ps = con.prepareStatement("delete from registeration where email=?");
		ps.setString(1, email1);
		int i = ps.executeUpdate();
		
		if (i > 0)
		{
			System.out.println("Deleted Successfully");
		}
		else 
		{
			System.out.println("Delition failed !");
		}

	}

}
