package may11;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import may08.DataProcessing;

class ThisImage extends JPanel {

	Image img;
	String path;

	ThisImage(String path) {
		
		this.path = path;

		if(!path.equals("")) {
			
			this.path = "./sajin/������.jpg";
			
		}

		img = Toolkit.getDefaultToolkit().getImage(this.path);
	
	}

	@Override
	public void paint(Graphics g) {
	
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		
		super.paint(g);
	}
	
}


public class MenuWindow extends JFrame implements ActionListener {

	JMenuItem first_menu, second_menu, third_menu;
	Image image;
	JButton button;
	
	public MenuWindow(String title) {
		
		super(title);
		
		image = Toolkit.getDefaultToolkit().getImage("./sajin/������.jpg");
		this.setIconImage(image); // ������ ����
		
		add("Center", new ThisImage("./sajin/������.jpg"));
		
		JMenuBar mb = new JMenuBar();  //�޴���
		
		JMenu menu1 = new JMenu("�׸�1");  //�޴�
		button = new JButton(" ��ư ");
		first_menu = new JMenuItem("ù��° ������"); //�޴�������
		first_menu.addActionListener(this);
		second_menu = new JMenuItem("�ι�° ������");
		second_menu.addActionListener(this);
		third_menu = new JMenuItem("����° ������");
		third_menu.addActionListener(this);
		
		menu1.add(first_menu);
		menu1.add(second_menu);
		menu1.addSeparator(); //������
		menu1.add(third_menu);
		
		JMenu menu2 = new JMenu("�׸�2"); //�޴� �ι�°
		JMenuItem fourth_menu = new JMenuItem("�׹�° ������");
		menu2.add(fourth_menu);
		
		mb.add(menu1);
		mb.add(menu2);
		setJMenuBar(mb);
		
		add("South", button);
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
						
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JMenuItem item = (JMenuItem)arg0.getSource();
		
		if(item == first_menu) {
			new DataProcessing("������ ó�� �ý���");
		}
		else if (item == second_menu) {
			
		}
		else if (item == third_menu) {
			
		}
	}

}
