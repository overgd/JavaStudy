package april16;

/*1. �ڵ����� �ִ�. ������ "����","û��","������"�̰�, ���� ������ ���Դ� ���� �ٸ���.
 * ��� �ڵ����� ������ ������ 4���̴�.
 * ��� ������ �ڵ����� ��������.
 * 
 *2. TV�� �ִ�. TV�� ������ �ʸ����̰�, ���δ� 100cm, ���δ� 50cm�̴�.
 * TV�� �������� "�߱�","�ѱ�","��Ʈ��"���� �ϳ��̴�.
 * ù��° TV�� �߱���, �ʸ���
 * �ι�° TV�� �ѱ���, ������
 * ����° TV�� ��Ʈ����, �ȸ����̴�.
 * 
 *3. ����Ʈ���� ī�޶� �ִ�.
 * ����Ʈ���� ������� "�Ｚ","����"�̴�.
 * ����Ʈ���� �ػ󵵴� õ��ȭ��, ���鸸ȭ���̴�.
 * 
 * ī�޶��� �������� "�Ϻ�"�̰�, ������� "�Ҵ�","�ø�Ǫ��","ĳ��"�̴�.
 * ī�޶��� ���Դ� ���� 100g,150g,200g�̴�.
 * ������ ����Ʈ���� �� ���� ī�޶� �����Ѵ�.
 */

class Car{
	int numberOfDoor;
	double weight = 2.3;
	static int numberOfWheel = 4;
	String color = new String("����");
}
class TV{
	int price = 100000;
	static int width = 100;
	static int height = 50;
	String origin = "�߱�";
}
class Smartphone{
	
	String maker = "�Ｚ";
	int camerapixel = 1000;
	
}
class Camera{
	
	static String origin = "�Ϻ�";
	String maker = "�Ҵ�";
	int weight = 100;
	
}

public class Test07 {

	public static void main(String[] args) {
		
		//ù��° ��
		Car car1 = new Car();
		car1.numberOfDoor = 3;
		//�ι�° ��
		Car car2 = new Car();
		car2.numberOfDoor = 2;
		car2.weight = 5.6;
		car2.color = "û��";
		//������ ��
		Car car3 = new Car();
		car3.weight = 6.6;
		car3.color = "������";
		
		//ù��° TV
		TV tv1 = new TV();
		//�ι�° TV
		TV tv2 = new TV();
		tv2.origin = "�ѱ�";
		tv2.price = 90000;
		//����° TV
		TV tv3 = new TV();
		tv3.origin = "��Ʈ��";
		tv3.price = 80000;
		
		//ù��° ����Ʈ��
		Smartphone smartphone1 = new Smartphone();
		smartphone1.camerapixel = 500;
		//�ι�° ����Ʈ��
		Smartphone smartphone2 = new Smartphone();
		smartphone2.maker = "����";
		//����° ����Ʈ��
		Smartphone smartphone3 = new Smartphone();
		
		//ù��° ī�޶�
		Camera camera1 = new Camera();
		camera1.maker = "�ø�Ǫ��";
		//�ι�° ī�޶�
		Camera camera2 = new Camera();
		camera2.weight = 150;

	}

}
