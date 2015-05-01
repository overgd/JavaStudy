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
	
	String test = "���Ź�";
	
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
			System.out.println("DB ������...");
			Class.forName(driver);
			System.out.println("����Ŭ ����̹� �ε� �Ϸ�!");
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("hr�� �α��� �Ϸ�!");
			stmt = con.createStatement();
			query(ddc);
			System.out.println("�۾��Ϸ�!");
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
	
	DB_DML dd;
	Scanner scan;
	int sel_num;
	String return_query;
	
	DB_DML_Choose(){
		dd = new DB_DML();		
	}
	String select() {
		
		System.out.println("�۾��� DML�� �����ϼ���. 1�� insert, 2�� update, 3�� delete");
		System.out.println("1�� insert, 2�� update, 3�� delete");
		System.out.println("�ƹ��͵� ���� �������� ���͸� ��������.");
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
		
		System.out.println("insert�۾��� �����մϴ�.");
		
		System.out.println("ID�� �Է��ϼ���.");
		scan = new Scanner(System.in);
		id = scan.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		scan = new Scanner(System.in);
		name = scan.nextLine();
		
		insert = "insert into mytest values("+id+", '"+name+"')";
		
		return insert;
	}
	
	String update(){
		System.out.println("update�۾��� �����մϴ�.");
		
		System.out.println("������ ID�� �Է��ϼ���.");
		scan = new Scanner(System.in);
		id = scan.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		scan = new Scanner(System.in);
		name = scan.nextLine();
		
		update = "update ";
		
		return update;
	}
	
	String delete(){
		System.out.println("delete�۾��� �����մϴ�.");
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
