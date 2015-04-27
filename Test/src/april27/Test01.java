package april27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class GetterSetter{
	GetterSetter() {}
	private int score;
	private int age;
	private String name;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

class Printer {
	
	private Printer(){}
	private static Printer printer = new Printer();
	
	static public Printer getPrinter() {
		return printer;
	}

	static public void setPrinter(Printer printer) {
		Printer.printer = printer;
	}

	void doPrint(){
		System.out.println("출력!");
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		GetterSetter gs1 = new GetterSetter(); //일반적 방법
		GetterSetter gs2 = new GetterSetter();
		
		if(gs1 == gs2) {
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다");
		}
		
		Printer p1 = Printer.getPrinter(); // 생성자 은닉해서
		Printer p2 = Printer.getPrinter();
				
		if(p1 == p2) {
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다");
		}
		
		
		p1.doPrint();
		
		System.out.println();
		
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("하나");
		hs.add("둘");
		hs.add("셋");
		hs.add("하나");
		
		hs.add(3.141592);
		
		System.out.println(hs);
		
		HashSet lo = new HashSet();
		
		for(int i = 0; lo.size() < 6; i++){
			int num = (int)(Math.random()*45)+1;
			lo.add(num);
		}
		
		System.out.println(lo);
		
		TreeSet ts = new TreeSet();
		
		for(int i = 0; ts.size() < 6; i++){
			int num = (int)(Math.random()*45)+1;
			ts.add(num);
		}
		
		System.out.println(ts);
		
		ArrayList al = new ArrayList();
		
		al.add("셋");
		al.add("하나");
		al.add("둘");
		
		Iterator it = al.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
