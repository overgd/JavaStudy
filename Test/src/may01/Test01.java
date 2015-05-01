package may01;

import java.awt.*;

class FirstWindow extends Frame {
	
	Label lbl1, lbl2, lbl3, lbl4; //���̺�
	Button btn1, btn2, btn3, btn4; //��ư
	Checkbox cbx1, cbx2; //üũ�ڽ�
	CheckboxGroup group; //���� �׷�
	Checkbox radio1, radio2, radio3; //������ư
	Choice nations, kuname, dongname; //���̽�
	List computers;
	TextField id, passwd;
	TextArea intro;
	
	String[] kus = {"������", "���ʱ�", "���빮��", "������"}; // ��ϸ����
	String[] dongs = {"�Ͼ�����", "������", "���̵�", "âõ��"};
	
	FirstWindow(String str) {
		
		super(str); // �������� ����
//		setTitle("ù��° ������"); //Ȯ���� ������ ����
		
		setLayout(new FlowLayout()); // ��ġ������ ����
		

		Label label1 = new Label("ID�� �Է��ϼ���.");
		Label label2 = new Label("Password�� �Է��ϼ���.");
		
		id = new TextField(20);
		passwd =  new TextField(20);
		passwd.setEchoChar('*');
		intro = new TextArea(5, 30);
		
		computers = new List(5, true); //5���� �������� �����ֵ��� ����, 
		computers.add("�Ｚ");			//false�� ���ϼ���, true�� ��������
		computers.add("HP");
		computers.add("LG");
		computers.add("�Ѽ�");
		computers.add("���뺸");
		
		nations = new Choice(); //���̽� ����
		nations.add("���ѹα�"); //��� �߰�
		nations.add("�Ϻ�");
		nations.add("�̱�");
		nations.add("�߱�");
		
		
		kuname = new Choice(); //���̽� ����
		for(int i = 0;i<kus.length;i++){ //��� �ټ� �߰�
			kuname.add(kus[i]);
		}
		
		dongname = new Choice();
		for(int i = 0;i<dongs.length;i++){
			dongname.add(dongs[i]);
		}
		
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
		
		add(nations);
		add(kuname);
		add(dongname);
		add(computers);
		
		add(id);
		add(passwd);
		add(intro);
		
		btn1.setForeground(Color.green); //��ư ���ڻ� �ٲٱ�
		btn1.setSize(200, 200);
		btn2.setEnabled(false); //��ư ��Ȱ��ȭ
		
		setSize(300, 500); //������ ������
		setBackground(Color.GRAY); //����
		setLocation(600,300);
		setVisible(true);
	
		addWindowListener(new WindowCloseListener());
	}
}

public class Test01 {

	public static void main(String[] args) {

		new FirstWindow("ù��° ������");
		
	}

}
