package april22;

public class UseOpenClass {

	static void doIt(String[] a){
		for(int i = 0;i < a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		//Wrapper Class
//		int price = 500;
//		Integer pi = new Integer(price);
//		
//		Integer pi2 = price;
//		
//		int money = 300;
//		int sum = money + pi2;
//		
//		System.out.println(sum);
		
//		Test01 oc = new Test01();
//		oc.setName("��浿");
//		String str = oc.getName();
//		System.out.println(str);
		
//		String[] strs = {"�츮����","���ѹα�","KOREA"};
//		doIt(strs);
//		String[] str = new String[3];
//		str[0] = "�ݼ�����"; str[1] = "�Ѱ��� ����"; str[2] = "��ħ�� ����";
//		doIt(str);
		
		int price = new Integer(args[0]);
		double money = new Double(args[1]);
		
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		
		System.out.println(price+money);
		
		
	}

}
