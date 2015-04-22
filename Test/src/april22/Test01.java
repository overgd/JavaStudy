package april22;

import april21.Test11;

public class Test01 {

	private int score;     //변수는 private로 선언
	private String name;	//변수의 Getter, Setter 메서드를 만들어준다.
	private char gender;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void putData(int a){  //Setter Method
		score = a;
	}
	
	public int retData(){  //Getter Method
		return score;
	}
	
	public void doIt(){
		score++;
	}
		
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public static void main(String[] args) {
		
		Test11 t1 = new Test11();
		
		int money = t1.money;
		
	}

}
