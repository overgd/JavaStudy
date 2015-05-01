package may01;

import java.awt.*;

class FirstWindow extends Frame {
	
	Label lbl1, lbl2, lbl3, lbl4; //���̺�
	Button btn1, btn2, btn3, btn4; //��ư
	Checkbox cbx1, cbx2; //üũ�ڽ�
	CheckboxGroup group; //���� �׷�
	Checkbox radio1, radio2, radio3; //������ư
	
	FirstWindow(String str) {
		
		super(str); // �������� ����
//		setTitle("ù��° ������"); //Ȯ���� ������ ����
		
		setLayout(new FlowLayout()); // ��ġ������ ����
		
		lbl1 = new Label("��"); //���̺� ����
		lbl2 = new Label("����");
		lbl3 = new Label("����");
		lbl4 = new Label("�ܿ�");
		
		btn1 = new Button("����"); //��ư ����
		btn2 = new Button("����");
		btn3 = new Button("��");
		
		cbx1 = new Checkbox("������", true); //üũ�ڽ�
		cbx2 = new Checkbox("�ܱ���", false);
		
		group = new CheckboxGroup(); //���� ��ư�� üũ�ڽ��� �׷�����
		radio1 = new Checkbox("����", group, true); 
		radio2 = new Checkbox("���", group, false);
		radio3 = new Checkbox("�λ�", group, false);
			
		add(lbl1); //�߰�
		add(lbl2);
		add(lbl3);
		add(lbl4);
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		add(cbx1);
		add(cbx2);
		
		add(radio1);
		add(radio2);
		add(radio3);
		
		btn1.setForeground(Color.green); //��ư ���ڻ� �ٲٱ�
		btn2.setEnabled(false); //��ư ��Ȱ��ȭ
				
		setSize(300, 300); //������ ������
		setBackground(Color.GRAY); //����
		setLocation(400,400);
		setVisible(true);
	}
}

public class Test01 {

	public static void main(String[] args) {

		new FirstWindow("ù��° ������");
		
	}

}
