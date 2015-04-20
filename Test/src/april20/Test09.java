package april20;

class ArrayTest2{
	Baseball[] bb1 = new Baseball[5];
	Baseball[][] bb2 = new Baseball[5][5];
	Baseball[] bb3 = {new Baseball(), new Baseball(), null, null, null};
	Baseball[][] bb4 = {
			{new Baseball(), null},
			{null, new Baseball()}
	};
	
	int[][] some = new int[3][4];
	
	void doArray(){
		bb1[0] = new Baseball();
		bb1[1] = new Baseball();
		
		bb2[0][0] = new Baseball();
		
		int[][] values = new int[3][4];
		values[0][0] = 1;
		values[0][1] = 2;
	}
}

class Baseball{
	Baseball(){}
	
}

public class Test09 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		
		int b[][] = {{1, 1}
					,{1, 1}};
		
		int[] score = {100,12,123,4124,45};
		int[][] score1 = {{10,10,10,10}
						 ,{20,20,20,20}
						 ,{30,30,30,30}
						 ,{40,40,40,40}};
		int sum = 0;
		for(int cnt_l=0;cnt_l<score1.length;cnt_l++){
			for(int cnt_h=0;cnt_h<score1[cnt_l].length;cnt_h++){
				System.out.println(score1[cnt_l][cnt_h]);
				sum = sum + score1[cnt_l][cnt_h];
			}
		}
		System.out.println(sum);
	}

}
