package may01;

import java.awt.*;

class FirstWindow extends Frame {
	
	Label lbl1, lbl2, lbl3, lbl4; //레이블
	Button btn1, btn2, btn3, btn4; //버튼
	Checkbox cbx1, cbx2; //체크박스
	CheckboxGroup group; //라디오 그룹
	Checkbox radio1, radio2, radio3; //라디오버튼
	
	FirstWindow(String str) {
		
		super(str); // 윈도우의 제목
//		setTitle("첫번째 윈도우"); //확정된 윈도우 제목
		
		setLayout(new FlowLayout()); // 배치관리자 설정
		
		lbl1 = new Label("봄"); //레이블 생성
		lbl2 = new Label("여름");
		lbl3 = new Label("가을");
		lbl4 = new Label("겨울");
		
		btn1 = new Button("가위"); //버튼 생성
		btn2 = new Button("바위");
		btn3 = new Button("보");
		
		cbx1 = new Checkbox("내국인", true); //체크박스
		cbx2 = new Checkbox("외국인", false);
		
		group = new CheckboxGroup(); //라디오 버튼은 체크박스를 그룹으로
		radio1 = new Checkbox("서울", group, true); 
		radio2 = new Checkbox("경기", group, false);
		radio3 = new Checkbox("부산", group, false);
			
		add(lbl1); //추가
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
		
		btn1.setForeground(Color.green); //버튼 글자색 바꾸기
		btn2.setEnabled(false); //버튼 비활성화
				
		setSize(300, 300); //윈도우 사이즈
		setBackground(Color.GRAY); //배경색
		setLocation(400,400);
		setVisible(true);
	}
}

public class Test01 {

	public static void main(String[] args) {

		new FirstWindow("첫번째 윈도우");
		
	}

}
