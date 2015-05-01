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
		ddc = new DB_DML_Choose();
	}
	
	void login(){
		try {
			System.out.println("DB ������...");
			Class.forName(driver);
			System.out.println("����Ŭ ����̹� �ε� �Ϸ�!");
			con = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("hr�� �α��� �Ϸ�!");
			stmt = con.createStatement();
			ddc.select();
//			stmt.executeUpdate();
			
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
	void select() throws SQLException{
		
		System.out.println("�۾��� DML�� �����ϼ���. 1�� insert, 2�� update, 3�� delete, 4�� select");
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
		if(!id.equals("")){ //������ ���ٿ� ���� �� �ִ�.
			select = select + "and id="+id;
		}
		if(!name.equals("")){
			select = select + "and name = '"+name+"'";
		}
	}
	
	void insert(Oracle_DB orcl) throws SQLException{
		System.out.println(orcl.test);
		System.out.println("insert�۾��� �����մϴ�.");
		insert = "insert into mytest values(124, '�ű浿')";
		scan = new Scanner(System.in);
		
		//return insert;
	}
	
	void update(Oracle_DB orcl){
		System.out.println("update�۾��� �����մϴ�.");
//		return update;
	}
	
	void delete(Oracle_DB orcl){
		System.out.println("delete�۾��� �����մϴ�.");
//		return delete;
	}
	void select(Oracle_DB orcl){
		System.out.println("select�۾��� �����մϴ�.");
//		return select;
	}
}

public class Test16 {

	public static void main(String[] args) {

		Oracle_DB orcl = new Oracle_DB();
		orcl.login();
		
	}

}
