package may06;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class SelectNation extends Frame implements WindowListener, ItemListener {
	
	Choice cont, nation;
	Label info, result;
	String[] area = {"아시아", "유럽", "미주"};
	String[][] nations = {
			{"대한민국", "중국", "일본", "태국"},
			{"영국", "프랑스", "독일", "이탈리아"},
			{"캐나다", "미국", "멕시코", "브라질"}};	
	

	SelectNation(String title){
		
		super(title);
		setLayout(new BorderLayout());
		info = new Label("대륙과 국가를 선택하라.");
		Panel panel = new Panel();
		cont = new Choice();
		nation = new Choice();
		cont.addItemListener(this);
		nation.addItemListener(this);
		for(int i = 0; i < area.length ;i++){
			cont.add(area[i]);//첫번째 초이스에 대륙의 이름 삽입
		}
		nation.add("          "); //두번째 초이스에 빈칸 삽입
		panel.add(cont);// 패널에 초이스 붙임
		panel.add(nation);
		result = new Label();
		add("North", info);
		add("Center", panel);
		add("South", result);
		setSize(300, 200);
		setVisible(true);
		addWindowListener(this);
	}
	

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		Choice obj = (Choice)arg0.getSource();
		String str = "선택한 대륙과 국가는 ";
		if(obj == cont){//대륙을 선택한 경우
			nation.removeAll();//두번째초이스의 내용을 지움
			int index = cont.getSelectedIndex();//선택한 항목번호를 획득
			for(int i = 0; i < nations[index].length; i++){
				nation.add(nations[index][i]);
			}
		}
		else if(obj == nation){
			str = str + cont.getSelectedItem();
			str = str + ", " + nation.getSelectedItem()+"입니다.";
			result.setText(str);
		}
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		arg0.getWindow().dispose();
		arg0.getWindow().setVisible(false);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	} //choice에서 발생하는 이벤트를 ItemListener이다.
	
	
}

public class Test01 {

	public static void main(String[] args) {

		new SelectNation("초이스 이벤트 처리");

		
		
		
	}

}
