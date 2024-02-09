package mst;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;	
import java.util.*;

public class labmst {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String email = sc.next();
		String password = sc.next();
		String gender = sc.next();
		String city = sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/22bcs10192","root","Yatharth@10192");
		
		PreparedStatement ps = con.prepareStatement("insert into registeration values (?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, gender);
		ps.setString(5, city);
		
        int i = ps.executeUpdate();
        
        if(i > 0)
        {
        	System.out.println("Success!");
        }
        else
        {
        	System.out.println("Fail");
        }
	}

}

