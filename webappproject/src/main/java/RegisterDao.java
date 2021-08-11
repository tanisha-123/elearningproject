
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
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
 
 public String insert(Member member)
 {
	 LoadDriver(dbDriver);
	 Connection con = getConnection();
	 String result = "Data Entered Successfully";
	 String sql= "insert into member values(?,?,?,?,?,?)";
	 
	 PreparedStatement ps;
	try {
	 ps = con.prepareStatement(sql);
	 ps.setString(1, member.getUname());
	 ps.setString(2, member.getPassword());
	 ps.setString(3, member.getEmail());
	 ps.setString(4, member.getPhone());
	 ps.setString(5, member.getAddress());
	 ps.setString(6, member.getImage());
	 ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result = "data not entered";
	}
	 return result;
 }
 
 
}

