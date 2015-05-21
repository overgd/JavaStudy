package may08;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;

public class Model extends AbstractTableModel {

	Object[][] data; //어떤 형태의 데이터라도 넣어야 되기 때문에
	String[] columnNames;
	int rows, cols;
	
	public void setRows(ResultSet rs) {
		
		try{
			rs.last(); //검색된데이터 맨 아래로
			rows = rs.getRow(); //마지막 행의 번호
		}
		catch (Exception e) {
			
		}
		
	}
	
	public void setData(ResultSet rs) {
		// 데이터의 검색결과를 넣어주는 메서드
		try {
			ResultSetMetaData rsmd; //메타데이타
			rsmd = rs.getMetaData();
			cols = rsmd.getColumnCount(); //열의 갯수
			columnNames = new String[cols]; 
			for(int i = 0; i < cols; i++) { // 검색된 결과의 열제목을 채움
				columnNames[i] = rsmd.getColumnName(i+1); //열의 이름
			}
			data = new Object[rows][cols];
			int r = 0;
			while(rs.next()) { //검색 건 수만큼 반복
				for(int c = 0; c  < cols; c++){
					data[r][c] = rs.getObject(c+1); // 데이터 넣음
				}
				r = r+1;
			}
			rs.close();
		}		
		
		catch(Exception e) {
			
		}
		
	}
	
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return data.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		
		return data[arg0][arg1];
	}

	@Override
	public String getColumnName(int column) {
		
		return columnNames[column];
	}

}
