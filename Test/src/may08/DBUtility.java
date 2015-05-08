package may08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtility {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	
	public Connection getConnection() throws Exception {
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, "hr", "hr");
		return con;
		
	}
	
	public boolean insertData(Dao dao) {
		
		int num = dao.getNum();
		String name = dao.getName();
		String addr = dao.getAddr();
		String phone = dao.getPhone();
		String insertSql = "insert into userinfo values(?, ?, ?, ?)";
		boolean flag = false;
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet re;
		
		try{
		con = getConnection();
		pstmt = con.prepareStatement(insertSql);
		
		pstmt.setInt(1, num);
		pstmt.setString(2, name);
		pstmt.setString(3, addr);
		pstmt.setString(4, phone);
		pstmt.executeUpdate(); //火涝 孽府 角青	
		
		flag = true;
		
		}
		catch(Exception e) {
			flag = false;
		}
		finally{
			try {
				con.close();
				pstmt.close();
			}
			catch(Exception e) {
				
			}
		}
		//DB立加
		//insert
		
		return flag;
	}
	
	public boolean deleteData(Dao dao) {
		
		int num = dao.getNum();
		String name = dao.getName();
		String addr = dao.getAddr();
		String phone = dao.getPhone();
		
		String delete = "delete from userinfo where 1=1 ";
		
		boolean flag = false;
		Connection con = null;
		Statement stmt = null;
		
		try {
			con = getConnection();
			if(num > 0) {
				delete = delete + " and num = " + num;
			}
			if(!name.equals("")){
				delete = delete + " and name = '" + name + "'";
			}
			if(!addr.equals("")){
				delete = delete + " and adrres = '" + addr + "'";
			}
			if(!phone.equals("")){
				delete = delete + " and phone = '" + phone + "'";
			}
			stmt = con.createStatement();
			stmt.executeUpdate(delete);
			flag = true;
		}
		catch(Exception e) {
			flag = false;
		}
		finally {
			try{
				con.close();
				stmt.close();
			}
			catch(Exception e){
				
			}
		}
		
		return flag;
	}
	
	
}
