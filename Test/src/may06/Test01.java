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
	String[] area = {"�ƽþ�", "����", "����"};
	String[][] nations = {
			{"���ѹα�", "�߱�", "�Ϻ�", "�±�"},
			{"����", "������", "����", "��Ż����"},
			{"ĳ����", "�̱�", "�߽���", "�����"}};	
	

	SelectNation(String title){
		
		super(title);
		setLayout(new BorderLayout());
		info = new Label("����� ������ �����϶�.");
		Panel panel = new Panel();
		cont = new Choice();
		nation = new Choice();
		cont.addItemListener(this);
		nation.addItemListener(this);
		for(int i = 0; i < area.length ;i++){
			cont.add(area[i]);//ù��° ���̽��� ����� �̸� ����
		}
		nation.add("          "); //�ι�° ���̽��� ��ĭ ����
		panel.add(cont);// �гο� ���̽� ����
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
		String str = "������ ����� ������ ";
		if(obj == cont){//����� ������ ���
			nation.removeAll();//�ι�°���̽��� ������ ����
			int index = cont.getSelectedIndex();//������ �׸��ȣ�� ȹ��
			for(int i = 0; i < nations[index].length; i++){
				nation.add(nations[index][i]);
			}
		}
		else if(obj == nation){
			str = str + cont.getSelectedItem();
			str = str + ", " + nation.getSelectedItem()+"�Դϴ�.";
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
		
	} //choice���� �߻��ϴ� �̺�Ʈ�� ItemListener�̴�.
	
	
}

public class Test01 {

	public static void main(String[] args) {

		new SelectNation("���̽� �̺�Ʈ ó��");

		
		
		
	}

}
