package april30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

class Oracle_DB {
	
	String driver;
	String url;
	Connection con;
	
	Statement stmt;
	PreparedStatement pstmt;
	
	DB_DML_Choose ddc;
	
	String test = "새신발";
	
	Oracle_DB(){
		driver = "oracle.jdbc.driver.OracleDriver";
		url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		con = null;
		stmt = null;
		pstmt = null;
		ddc = new DB_DML_Choose();
	}
	
	void login(){
		try {
			System.out.println("DB 연결중...");
			Class.forName(driver);
			System.out.println("오라클 드라이버 로드 완료!");
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("hr에 로그인 완료!");
			ddc.select();
			stmt = con.createStatement();
			
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
	
	Oracle_DB orcl;
	DB_DML dd;
	Scanner scan;
	int sel_num;
	
	DB_DML_Choose(){
		dd = new DB_DML();
	}
	void select(){
		System.out.println("작업할 DML을 선택하세요. 1번 insert, 2번 update, 3번 delete");
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
		}		
	}
}

class DB_DML {
	
	String insert;
	String update;
	String delete;
	
	void insert(Oracle_DB orcl){
		System.out.println("insert작업을 시작합니다.");
		System.out.println(orcl.test);
	}
	
	void update(Oracle_DB orcl){
		System.out.println("update작업을 시작합니다.");
	}
	
	void delete(Oracle_DB orcl){
		System.out.println("delete작업을 시작합니다.");
	}
}

public class Test16 {

	public static void main(String[] args) {

		Oracle_DB orcl = new Oracle_DB();
		orcl.login();
		
	}

}
