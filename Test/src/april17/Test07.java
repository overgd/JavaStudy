package april17;

class Ju{
	Ju(){}

	Ju_st_info[] std;
	
	void Input(){
		
		std = new Ju_st_info[] {new Ju_st_info("��������", "���ٿ�", 77),
				new Ju_st_info("��������", "�űٿ�", 78),
				new Ju_st_info("��������", "���ٿ�", 88),
				new Ju_st_info("���޷���", "���ٿ�", 98),
				new Ju_st_info("���޷���", "���ٿ�", 68) };
		
	}
	
	void Output(Ju_st_info std[]){
		
		int sum = 0;
		
		for(int i=0;i<std.length;i++){
		sum = sum + (std[i].score);
		}
		int avg = sum/std.length+1;
		
		System.out.println(sum);
		System.out.println(avg);
	}
	
}

class Ju_class_jin{
	Ju_class_jin(String a){
		cl_name = a;
	}
	String cl_name;
	String m_name = "�����";
}

class Ju_class_gae{
	Ju_class_gae(String a){
		cl_name = a;
	}
	String cl_name;
	String m_name = "������";
}

class Ju_st_info{
	
	Ju_st_info(String a, String b, int c){
		if(a=="��������"){
			Ju_class_gae cl = new Ju_class_gae(a);
			cla = cl.cl_name;
			m_name = cl.m_name;
		}
		else if(a=="���޷���"){
			Ju_class_jin cl = new Ju_class_jin(a);
			cla = cl.cl_name;
			m_name = cl.m_name;
		}
		name = b;
		score = c;
	}
	
	String cla;
	String m_name;
	String name;
	int score;	
	
}

public class Test07 {

	public static void main(String[] args) {
	
		Ju ju = new Ju();
		
		ju.Input();
		
		ju.Output(ju.std);
			
	}

}
