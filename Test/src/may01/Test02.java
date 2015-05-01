package may01;

import java.awt.*;

class Ex_Window extends Frame {
	
	Label lbl1, lbl2;
	Checkbox cbx1, cbx2, cbx3;
	CheckboxGroup group;
	Checkbox radio1, radio2, radio3;
	
	Ex_Window(String str){
		
		super(str);
		
		FlowLayout layout = new FlowLayout();

		setLayout(layout);

		lbl1 = new Label("설치되어 있는 OS선택(복수)");
		lbl2 = new Label("컴퓨터 CPU종류 선택");
		
		cbx1 = new Checkbox("윈도우 98", false);
		cbx2 = new Checkbox("윈도우 2000", false);
		cbx3 = new Checkbox("윈도우 xp", false);
		
		group = new CheckboxGroup();
		radio1 = new Checkbox("펜티엄4", group, true);
		radio2 = new Checkbox("애슬론xp", group, false);
		radio3 = new Checkbox("셀러론", group, false);
		
		add(lbl1);
		add(cbx1);
		add(cbx2);
		add(cbx3);
		add(lbl2);
		add(radio1);
		add(radio2);
		add(radio3);
		
		setSize(500, 150);
		setLocation(500, 400);
		setVisible(true);
		
		addWindowListener(new WindowCloseListener());
		
	}
	
}

public class Test02 {

	public static void main(String[] args) {

		new Ex_Window("체크 박스 예제 1");
		
	}

}
