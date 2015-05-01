package may01;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloseListener2 extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		
		e.getWindow().setVisible(false); //화면에서 삭제
		e.getWindow().dispose(); //메모리 삭제
		
		super.windowClosing(e);
	}

	
}
