package april30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		Connection conn =  null;
		
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		Scanner scan;
		String insert;
		String insert2 = "insert into mytest values(?,?)";
		String delete =  "delete from mytest where 1=1 ";
		String delete2 = "delete from mytest where id = 100 and name = '홍길동'";
		
		String name;
		String id;
		
//		if(id != null){
//			delete = delete + "and id="+id;
//		}
//		if(name != null){
//			delete = delete + " and name='"+name+"'";
//		}
		
		try {
			System.out.println("DB Connected");
			Class.forName(driver);//오라클 드라이버 로딩
			System.out.println("Oracle Driver Load Success");
			conn = DriverManager.getConnection(url, "hr", "hr"); //hr 계정
			System.out.println("Login");
			stmt = conn.createStatement();
			
//			scan = new Scanner(System.in);
//			insert = scan.nextLine();
//			stmt.executeUpdate(insert);//삽입, 삭제, 변경은 executeUpdate()
			
			scan = new Scanner(System.in);
			id = scan.nextLine();
			scan = new Scanner(System.in);
			name = scan.nextLine();
			
			delete = delete + "and id=" + id + " and name='"+name+"'";
			
			stmt.executeUpdate(delete);
			System.out.println("Delete");
			
//			pstmt = conn.prepareStatement(insert2);
//			pstmt.setInt(1, 200);
//			pstmt.setString(2,  name);
//			pstmt.executeUpdate();    //조회는 executeQuery			
			System.out.println("Oracle DB Success");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Connect Failed");
		}
		finally {
			try {
				stmt.close();
				conn.close();
			}
			catch (Exception e){
				
			}
		}
	}

}
