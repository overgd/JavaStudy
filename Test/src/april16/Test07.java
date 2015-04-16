package april16;

/*1. 자동차가 있다. 색상은 "적색","청색","검정색"이고, 문의 갯수와 무게는 서로 다르다.
 * 모든 자동차의 바퀴의 갯수는 4개이다.
 * 모두 세대의 자동차를 생성하자.
 * 
 *2. TV가 있다. TV의 가격은 십만원이고, 가로는 100cm, 세로는 50cm이다.
 * TV의 원산지는 "중국","한국","베트남"중의 하나이다.
 * 첫번째 TV는 중국산, 십만원
 * 두번째 TV는 한국산, 구만원
 * 세번째 TV는 베트남산, 팔만원이다.
 * 
 *3. 스마트폰과 카메라가 있다.
 * 스마트폰의 제조사는 "삼성","엘지"이다.
 * 스마트폰의 해상도는 천만화소, 오백만화소이다.
 * 
 * 카메라의 원산지는 "일본"이고, 제조사는 "소니","올림푸스","캐논"이다.
 * 카메라의 무게는 각각 100g,150g,200g이다.
 * 세대의 스마트폰과 두 대의 카메라를 생성한다.
 */

class Car{
	int numberOfDoor;
	double weight = 2.3;
	static int numberOfWheel = 4;
	String color = new String("적색");
}
class TV{
	int price = 100000;
	static int width = 100;
	static int height = 50;
	String origin = "중국";
}
class Smartphone{
	
	String maker = "삼성";
	int camerapixel = 1000;
	
}
class Camera{
	
	static String origin = "일본";
	String maker = "소니";
	int weight = 100;
	
}

public class Test07 {

	public static void main(String[] args) {
		
		//첫번째 차
		Car car1 = new Car();
		car1.numberOfDoor = 3;
		//두번째 차
		Car car2 = new Car();
		car2.numberOfDoor = 2;
		car2.weight = 5.6;
		car2.color = "청색";
		//세번재 차
		Car car3 = new Car();
		car3.weight = 6.6;
		car3.color = "검정색";
		
		//첫번째 TV
		TV tv1 = new TV();
		//두번째 TV
		TV tv2 = new TV();
		tv2.origin = "한국";
		tv2.price = 90000;
		//세번째 TV
		TV tv3 = new TV();
		tv3.origin = "베트남";
		tv3.price = 80000;
		
		//첫번째 스마트폰
		Smartphone smartphone1 = new Smartphone();
		smartphone1.camerapixel = 500;
		//두번째 스마트폰
		Smartphone smartphone2 = new Smartphone();
		smartphone2.maker = "엘지";
		//세번째 스마트폰
		Smartphone smartphone3 = new Smartphone();
		
		//첫번째 카메라
		Camera camera1 = new Camera();
		camera1.maker = "올림푸스";
		//두번째 카메라
		Camera camera2 = new Camera();
		camera2.weight = 150;

	}

}
