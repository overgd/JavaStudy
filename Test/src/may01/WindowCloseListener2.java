package may01;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloseListener2 extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		
		e.getWindow().setVisible(false); //ȭ�鿡�� ����
		e.getWindow().dispose(); //�޸� ����
		
		super.windowClosing(e);
	}

	
}
