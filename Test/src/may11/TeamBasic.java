package may11;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

class FirstMember extends TeamBasic {
	
	String[] captions = {"학번 : ", "이름 : ", "주소 : ", "학과 : "};

	public FirstMember() {
		
		super();

		for(int i = 0; i < captions.length; i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(captions[i]);
			tf[i] = new JTextField(20);
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		super.actionPerformed(arg0);
	}	
	
	
}

class SecondMember extends TeamBasic {
	
	String[] captions = {"고객번호 : ", "고객이름 : "};

	public SecondMember() {
		
		super();
	
		for(int i = 0; i < captions.length; i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(captions[i]);
			tf[i] = new JTextField(20);
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
		}	
		
	}
	
	
}

public class TeamBasic extends JPanel implements ActionListener {

	protected JPanel[] jp = new JPanel[6];
	protected JLabel[] jl = new JLabel[5];
	protected JTextField[] tf = new JTextField[5];
	
	public TeamBasic() {
	
		setLayout(new GridLayout(6,1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
			
	}

}
