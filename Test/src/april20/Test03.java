package april20;

class ComStore{
	
	LenovoNotebook lenovo;
	LGNotebook lg;
	SamsungNotebook sam;
	
	ComStore(){
		sam = new SamsungNotebook(100);
	}
	
	void import_Notebook(LenovoNotebook v, LGNotebook l){
		
		lenovo = v; lg = l;
	}
	
	void showAll(){
		int sum = lenovo.price + lg.price + sam.price;
		System.out.println(sum);
	}
}

class SamsungNotebook{
	int price;
	SamsungNotebook(int price){this.price = price;}
}

class LenovoNotebook{
	int price;
	LenovoNotebook(int price){this.price = price;}
}

class LGNotebook{
	int price;
	LGNotebook(int price){this.price = price;}
}

public class Test03 {

	public static void main(String[] args) {
	
		ComStore cs = new ComStore();
		cs.import_Notebook(new LenovoNotebook(100), new LGNotebook(150));
		cs.showAll();
		
	}

}
