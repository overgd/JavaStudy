package april16;

//1. ���ڰ� �ִ�. ���ڴ� �ٸ��� �װ�, �����԰� 105.1kg, ���̰� 3��, ���ڴ� ���� ���ڰ� �ִ�.

//��ü : ����
//���� : ���� ���ڰ� �ִ�.
//�Ӽ� : �ٸ�4��, ������ 105.1kg, ���� 3��

//////////////////////////////////////////////////////////////////////////////////////////////////

//2. ������� �ִ�. ��� ������ ���ѹα��̴�.
//ù��° ����� �̸��� "ȫ�浿", ���̴� 34��, ������ ����
//�ι�° ����� �̸��� "���浿", ���̴� 56��, ������ ����
//����° ����� �̸��� "��浿", ���̴� 12��, ������ ����

//��ü : ���
//�Ӽ� : ����, �̸�, ����, ����
//���� : X
//������ ��ΰ� ���� ������ static�� �ٿ��ش�.

class Human{
	
	static String nation = new String("���ѹα�");
	/*static�� �ٿ��ָ� �޸𸮿� �������� nation�� �ϳ��� ���������.*/
	
	String name = new String("ȫ�浿");
	String gender = new String("����");
	int age = 34;
	
}

class Lion{
	
	Lion(){}//������
	int numberOfLegs = 4; //�ٸ�
	double weight = 105.1; //������
	int age = 3; //����
		
	void sleep(){
		System.out.println("���ܴ�");
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

		Human h1 = new Human(); //ù��° �ΰ�
		
		Human h2 = new Human(); //�ι�° �ΰ�
		h2.name = new String("���浿"); //���ڿ� ���� ù��° ���
		h2.gender = "����"; //�ι�° ���
		h2.age = 56;
		
		Human h3 = new Human(); // ����° �ΰ�
		h3.name = new String("��浿");
		h3.gender = new String("����");
		h3.age = 12;
		
	}

}
