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
	
	String test = "���Ź�";
	
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
			System.out.println("DB ������...");
			Class.forName(driver);
			System.out.println("����Ŭ ����̹� �ε� �Ϸ�!");
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("hr�� �α��� �Ϸ�!");
			ddc.select();
			stmt = con.createStatement();
			
		}
		catch(Exception e) {
			System.out.println("���� ����...");
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
		System.out.println("�۾��� DML�� �����ϼ���. 1�� insert, 2�� update, 3�� delete");
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
		System.out.println("insert�۾��� �����մϴ�.");
		System.out.println(orcl.test);
	}
	
	void update(Oracle_DB orcl){
		System.out.println("update�۾��� �����մϴ�.");
	}
	
	void delete(Oracle_DB orcl){
		System.out.println("delete�۾��� �����մϴ�.");
	}
}

public class Test16 {

	public static void main(String[] args) {

		Oracle_DB orcl = new Oracle_DB();
		orcl.login();
		
	}

}
