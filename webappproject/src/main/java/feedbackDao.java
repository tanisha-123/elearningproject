

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class feedbackDao {
 private String dbUrl="jdbc:mysql://localhost:3306/userdb";
 private String dbUname="root";
 private String dbpassword="rootpassword";
 private String dbDriver="com.mysql.cj.jdbc.Driver";
 
 public void LoadDriver(String dbDriver) {
	
	 try {
		Class.forName(dbDriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 
 public Connection getConnection() {
	 Connection con = null;
	 try {
		con=DriverManager.getConnection(dbUrl, dbUname, dbpassword);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return con;
 }
 
 public String insert(Member1 member1)
 {
	 LoadDriver(dbDriver);
	 Connection con = getConnection();
	 String result = "Data Entered Successfully";
	 String sql= "insert into member1 values(?,?,?,?)";
	 
	 PreparedStatement ps;
	try {
	 ps = con.prepareStatement(sql);
	 ps.setString(1, member1.getuid());
	 ps.setString(2, member1.getuname());
	 ps.setString(3, member1.getemail());
	 ps.setString(4, member1.getfeedback());;
	 ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result = "data not entered";
	}
	 return result;
 }
 
 
}

