package april16;

//1. 사자가 있다. 사자는 다리가 네개, 몸무게가 105.1kg, 나이가 3살, 사자는 현재 잠자고 있다.

//객체 : 사자
//동작 : 현재 잠자고 있다.
//속성 : 다리4개, 몸무게 105.1kg, 나이 3살

//////////////////////////////////////////////////////////////////////////////////////////////////

//2. 세사람이 있다. 모두 국적이 대한민국이다.
//첫번째 사람의 이름은 "홍길동", 나이는 34세, 성별은 남자
//두번째 사람의 이름은 "마길동", 나이는 56세, 성별은 여자
//세번째 사람의 이름은 "고길동", 나이는 12세, 성별은 남자

//객체 : 사람
//속성 : 국적, 이름, 나이, 성별
//동작 : X
//국적은 모두가 같기 때문에 static을 붙여준다.

class Human{
	
	static String nation = new String("대한민국");
	/*static을 붙여주면 메모리에 공통적인 nation이 하나만 만들어진다.*/
	
	String name = new String("홍길동");
	String gender = new String("남자");
	int age = 34;
	
}

class Lion{
	
	Lion(){}//생성자
	int numberOfLegs = 4; //다리
	double weight = 105.1; //몸무게
	int age = 3; //나이
		
	void sleep(){
		System.out.println("잠잔다");
	}
}

public class Test06 {
	Test06(){}
	public static void main(String[] args) {
		
		Lion animal = new Lion();
		
		System.out.println(animal.numberOfLegs);
		System.out.println(animal.age);
		System.out.println(animal.weight);
		animal.sleep();

		Human h1 = new Human(); //첫번째 인간
		
		Human h2 = new Human(); //두번째 인간
		h2.name = new String("마길동"); //문자열 생성 첫번째 방법
		h2.gender = "여자"; //두번째 방법
		h2.age = 56;
		
		Human h3 = new Human(); // 세번째 인간
		h3.name = new String("고길동");
		h3.gender = new String("남자");
		h3.age = 12;
		
	}

}
