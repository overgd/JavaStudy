package may11;

import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class TeamMainWindow extends JFrame {

	public static void main(String[] args) {

		new TeamMainWindow("1조 윈도우");
		
	}

	public TeamMainWindow(String title)  {
		super(title);
		setLayout(new FlowLayout());
		add(new FirstMember());
		add(new SecondMember());
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
