package april17;

class Student{
	
	String name = "홍길동";
	int score[] = {84, 89, 92};
	
	void Output_SumAvg(){
		
		int sum = score[0]+score[1]+score[2];
		int avg = sum/3;
		System.out.println(name+"의 점수의 합은 "+sum+", 평균은 "+avg);
	}
}

class Zoo{
	
	String animal[] = {"사자", "호랑이", "얼룩말"};
	String animal_name[] = {"레오", "호동", "얼룩"};
	int price[] = {5000, 6000, 7000};
	
	void Output_ValSum(int num){
		
		int sum = 0;
		
		for(int cnt=0;cnt<=num-1;cnt++){
			sum = sum + price[cnt];
			if(cnt<num-1)
			System.out.print(animal_name[cnt]+animal[cnt]+"와 ");
			else
			System.out.print(animal_name[cnt]+animal[cnt]);
		}
		System.out.println("의 총 가격은 "+sum+"만원");
	}
}

class Store{
	
	String product_Name[] = {"초코파이", "신라면", "삼다수"};
	int price[] = {1000, 1500, 800};
	
	void Output_Sum(){
		int sum = 0;
		for(int cnt = 0;cnt<product_Name.length;cnt++){
			sum = sum + price[cnt];
			System.out.print(product_Name[cnt]+" ");
		}
		System.out.println("총 "+sum+"원");
	}
	
}

class IntSum{
	
	int Output_Sum(int num[]){
		int sum = 0;
		for(int cnt = 0;cnt<num.length;cnt++){
			sum = sum + num[cnt];
		}
		System.out.println(sum);
		return sum;
	}
	
}

public class Test01 {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.Output_SumAvg();
		
		Student student2 = new Student();
		student2.name = "마길동";
		student2.score[0] = 92;
		student2.score[1] = 82;
		student2.score[2] = 81;
		student2.Output_SumAvg();
		
		Student student3 = new Student();	
		student3.name = "오길동";
		student3.score[0] = 93;
		student3.score[1] = 88;
		student3.score[2] = 80;
		student3.Output_SumAvg();
		
		Zoo animal = new Zoo();
		animal.Output_ValSum(3);
		
		Store store = new Store();
		store.Output_Sum();
		
		IntSum storesum = new IntSum();
		storesum.Output_Sum(store.price);
		
	}
	
}
