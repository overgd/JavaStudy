package april21;

class Clock{
	int hour;
	int minute;
	int second;
	
	Clock(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	Clock(int minute, int second){
		this(12, minute, second);
	}
	Clock(int second){
		this(12, 12, second);
	}
	Clock(){
		this(12, 12, 12);
	}
}

class JavahomeCo{
	JavahomeCo(){
		o = new Online();
	}
	Online o;
	Client c;

}
class Online{
	
	Online(){}
	Client c;
	
	void input_client(Client c){
		this.c = c;
	}

}
class Client{
	
	Client(String name, String gender, int id, int old, String num, String adress, String hobby, String job){
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.old = old;
		this.num = num;
		this.adress = adress;
		this.hobby = hobby;
		this.job = job;
	}
	Client(String name, String gender, int id, int old, String num, String adress, String hobby){
		this(name, gender, id, old, num, adress, hobby, "무직");
	}
	Client(String name, String gender, int id, int old, String num, String adress){
		this(name, gender, id, old, num, adress, "없음", "무직");
	}
	Client(String name, String gender, int id, int old, String num){
		this(name, gender, id, old, num, "서울시", "없음", "무직");
	}
	Client(String name, String gender, int id, int old){
		this(name, gender, id, old, "010-0000-0000", "서울시", "없음", "무직");
	}
	Client(String name, String gender, int id){
		this(name, gender, id, 21, "010-0000-0000", "서울시", "없음", "무직");
	}
	
	String name;
	String gender;
	int id;
	int old;
	String num;
	String adress;
	String hobby;
	String job;	
}

class JavaCC{
	JavaCC(){}
	
	void input_Data(){}
}

class Apart{
	Apart(){
		
	}
	Room_info ri;
	
	void input_data(Room_info ri){
		this.ri = ri;
	}
}

class Room_info{
	Room_info(String room_name, int room_size, int room_num, int room_bath){
		this.room_name = room_name;
		this.room_size = room_size;
		this.room_num = room_num;
		this.room_bath = room_bath;
	}
	Room_info(String room_name){
		this("기본", 30, 3, 1);
	}
	String room_name;
	int room_size;
	int room_num;
	int room_bath;
}

public class Test10 {

	public static void main(String[] args) {
		
		Clock time1 = new Clock(11, 11, 11);
		Clock time2 = new Clock();
		System.out.println(time1.hour+" "+time1.minute+" "+time1.second);
		System.out.println(time2.hour+" "+time2.minute+" "+time2.second);
		
		JavahomeCo jhs = new JavahomeCo();
		jhs.o.input_client(new Client("김", "남", 123));
	
		System.out.println(jhs.o.c.name);
	}
}
