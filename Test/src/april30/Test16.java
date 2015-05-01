package april30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class Oracle_DB {
	
	String driver;
	String url;
	Connection con;
	
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	DB_DML_Choose ddc;
	
	String test = "새신발";
	
	Oracle_DB(){
		driver = "oracle.jdbc.driver.OracleDriver";
		url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		con = null;
		stmt = null;
		pstmt = null;
		rs = null;
		ddc = new DB_DML_Choose();
	}
	
	void login(){
		try {
			System.out.println("DB 연결중...");
			Class.forName(driver);
			System.out.println("오라클 드라이버 로드 완료!");
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("hr에 로그인 완료!");
			stmt = con.createStatement();
			ddc.select();
//			stmt.executeUpdate();
			
			System.out.println("작업완료!");
		}
		catch(Exception e) {
			System.out.println("연결 실패...");
		}
		finally {
			try {
				stmt.close();
				con.close();
			}
			catch(Exception e){
				
			}
		}
	}
}

class DB_DML_Choose {
	
	DB_DML dd;
	Scanner scan;
	int sel_num;
	String return_query;
	
	DB_DML_Choose(){
		dd = new DB_DML();		
	}
	void select() throws SQLException{
		
		System.out.println("작업할 DML을 선택하세요. 1번 insert, 2번 update, 3번 delete, 4번 select");
		scan = new Scanner(System.in);
		sel_num = scan.nextInt();
		switch(sel_num){
		case 1 :		
			dd.insert(orcl);
			break;
		case 2 :
			dd.update(orcl);
			break;
		case 3 :
			dd.delete(orcl);
			break;
		case 4 : 
			dd.select(orcl);
			break;
		}	
		//return return_query;
	}
}

class DB_DML {
	
	String insert;
	String update;
	String delete;
	String select;
	
	String id = "";
	String name = "";
	
	Scanner scan;
	
	DB_DML(){
		if(!id.equals("")){ //조건이 없다에 비교할 수 있다.
			select = select + "and id="+id;
		}
		if(!name.equals("")){
			select = select + "and name = '"+name+"'";
		}
	}
	
	void insert(Oracle_DB orcl) throws SQLException{
		System.out.println(orcl.test);
		System.out.println("insert작업을 시작합니다.");
		insert = "insert into mytest values(124, '신길동')";
		scan = new Scanner(System.in);
		
		//return insert;
	}
	
	void update(Oracle_DB orcl){
		System.out.println("update작업을 시작합니다.");
//		return update;
	}
	
	void delete(Oracle_DB orcl){
		System.out.println("delete작업을 시작합니다.");
//		return delete;
	}
	void select(Oracle_DB orcl){
		System.out.println("select작업을 시작합니다.");
//		return select;
	}
}

public class Test16 {

	public static void main(String[] args) {

		Oracle_DB orcl = new Oracle_DB();
		orcl.login();
		
	}

}
