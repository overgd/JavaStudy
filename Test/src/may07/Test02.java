package may07;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

class SwingWindow2 extends JFrame {
	
	JTabbedPane pane;
	JLabel label;
	JPanel p1, p2;
	
	SwingWindow2(String title) {
		
		super(title);
		
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
		pane = new JTabbedPane();
		p1 = new EmpManageSystem();
		p2 = new PcManageSystem();
		pane.addTab("��� ���� �ý���", p1);
		pane.addTab("PC�� ���� �ý���", p2);
		pane.setSelectedIndex(1);
		
		add("Center", pane);
		setBounds(300, 300, 600, 400); //������ ũ��� ��ġ ����
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

public class Test02 {

	public static void main(String[] args) {
	
		new SwingWindow2("���� ������2");
		
	}

}
