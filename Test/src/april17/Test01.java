package april17;

class Student{
	
	String name = "ȫ�浿";
	int score[] = {84, 89, 92};
	
	void Output_SumAvg(){
		
		int sum = score[0]+score[1]+score[2];
		int avg = sum/3;
		System.out.println(name+"�� ������ ���� "+sum+", ����� "+avg);
	}
}

class Zoo{
	
	String animal[] = {"����", "ȣ����", "��踻"};
	String animal_name[] = {"����", "ȣ��", "���"};
	int price[] = {5000, 6000, 7000};
	
	void Output_ValSum(int num){
		
		int sum = 0;
		
		for(int cnt=0;cnt<=num-1;cnt++){
			sum = sum + price[cnt];
			if(cnt<num-1)
			System.out.print(animal_name[cnt]+animal[cnt]+"�� ");
			else
			System.out.print(animal_name[cnt]+animal[cnt]);
		}
		System.out.println("�� �� ������ "+sum+"����");
	}
}

class Store{
	
	String product_Name[] = {"��������", "�Ŷ��", "��ټ�"};
	int price[] = {1000, 1500, 800};
	
	void Output_Sum(){
		int sum = 0;
		for(int cnt = 0;cnt<product_Name.length;cnt++){
			sum = sum + price[cnt];
			System.out.print(product_Name[cnt]+" ");
		}
		System.out.println("�� "+sum+"��");
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
		student2.name = "���浿";
		student2.score[0] = 92;
		student2.score[1] = 82;
		student2.score[2] = 81;
		student2.Output_SumAvg();
		
		Student student3 = new Student();	
		student3.name = "���浿";
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
