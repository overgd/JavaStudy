package april17;

class KidsSchool{
	
	Kids kid1 = new Kids("���ٿ�", 100, 100);
	Kids kid2 = new Kids("��ٿ�", 100, 100);
	Kids kid3 = new Kids("���ٿ�", 100, 100);
	
}

class Kids{
	Kids(String a, int b, int c){
		name = a; height = b; weight = c;
	}
		String name;
		int height;
		int weight;
}

public class Test05 {

	public static void main(String[] args) {

		KidsSchool ks = new KidsSchool();
		
		System.out.println(ks.kid1.height);

	}

}
