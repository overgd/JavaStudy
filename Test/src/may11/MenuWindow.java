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
			
			this.path = "./sajin/전지현.jpg";
			
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
		
		image = Toolkit.getDefaultToolkit().getImage("./sajin/김태희.jpg");
		this.setIconImage(image); // 아이콘 지정
		
		add("Center", new ThisImage("./sajin/전지현.jpg"));
		
		JMenuBar mb = new JMenuBar();  //메뉴바
		
		JMenu menu1 = new JMenu("항목1");  //메뉴
		button = new JButton(" 버튼 ");
		first_menu = new JMenuItem("첫번째 아이템"); //메뉴아이템
		first_menu.addActionListener(this);
		second_menu = new JMenuItem("두번째 아이템");
		second_menu.addActionListener(this);
		third_menu = new JMenuItem("세번째 아이템");
		third_menu.addActionListener(this);
		
		menu1.add(first_menu);
		menu1.add(second_menu);
		menu1.addSeparator(); //구분자
		menu1.add(third_menu);
		
		JMenu menu2 = new JMenu("항목2"); //메뉴 두번째
		JMenuItem fourth_menu = new JMenuItem("네번째 아이템");
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
			new DataProcessing("데이터 처리 시스템");
		}
		else if (item == second_menu) {
			
		}
		else if (item == third_menu) {
			
		}
	}

}
