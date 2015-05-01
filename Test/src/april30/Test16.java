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
	}
	
	void query(DB_DML_Choose ddc) throws SQLException{
		ddc = new DB_DML_Choose();
		stmt.executeUpdate(ddc.select());
	}
	
	void login(){
		try {
			System.out.println("DB 연결중...");
			Class.forName(driver);
			System.out.println("오라클 드라이버 로드 완료!");
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("hr에 로그인 완료!");
			stmt = con.createStatement();
			query(ddc);
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
	String select() {
		
		System.out.println("작업할 DML을 선택하세요. 1번 insert, 2번 update, 3번 delete");
		System.out.println("1번 insert, 2번 update, 3번 delete");
		System.out.println("아무것도 하지 않으려면 엔터를 누르세요.");
		scan = new Scanner(System.in);
		sel_num = scan.nextInt();
		switch(sel_num){
		case 1 :		
			return_query = dd.insert();
			break;
		case 2 :
			return_query = dd.update();
			break;
		case 3 :
			return_query = dd.delete();
			break;
		default : 
			
			break;
		}	
		return return_query;
	}
}

class DB_DML {
	
	String insert;
	String update;
	String delete;
	
	String id = "";
	String name = "";
	
	Scanner scan;
	
	DB_DML(){}
	
	String insert() {
		
		System.out.println("insert작업을 시작합니다.");
		
		System.out.println("ID를 입렵하세요.");
		scan = new Scanner(System.in);
		id = scan.nextLine();
		System.out.println("이름을 입력하세요.");
		scan = new Scanner(System.in);
		name = scan.nextLine();
		
		insert = "insert into mytest values("+id+", '"+name+"')";
		
		return insert;
	}
	
	String update(){
		System.out.println("update작업을 시작합니다.");
		
		System.out.println("변경할 ID를 입렵하세요.");
		scan = new Scanner(System.in);
		id = scan.nextLine();
		System.out.println("이름을 입력하세요.");
		scan = new Scanner(System.in);
		name = scan.nextLine();
		
		update = "update ";
		
		return update;
	}
	
	String delete(){
		System.out.println("delete작업을 시작합니다.");
		return delete;
	}

}

class DB_Select {
	String select;
	
}

public class Test16 {

	public static void main(String[] args) {

		Oracle_DB orcl = new Oracle_DB();
		orcl.login();
	}
	
}
