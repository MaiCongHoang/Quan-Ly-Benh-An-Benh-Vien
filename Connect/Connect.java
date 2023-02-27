package Connect;

import java.sql.*;

public class Connect {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlbenhan","root","Hoangproasd123");
			return cons;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	public static void main(String[] args) throws SQLException {
		Connection c = getConnection();
		System.out.println(c.toString());
		c.close();
	}
}
