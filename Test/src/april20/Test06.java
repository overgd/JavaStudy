package april20;

/*2.�ڹٰ���б��� �л� 20���� �ִ�.
 * ��� �л��� ������ �ִ�.
 * ������ ����, ������ 0~100��
 * �ڹٰ���б��� ���Ӽ������� �ִ�.
 * ���Ӽ������� ��� �л��� ���� �հ� ����� ����Ѵ�.
 */

/*3.�ڹ��ֽ�ȸ�翡 ������, ���ߺΰ� �ִ�.
 * �����δ� 10��, ���ߺδ� 8���� �ִ�.
 * ��� ������ ������ �ִ�.
 * ������ �����̰� ������ �ϸ�~�ʸ����̴�.
 * �ڹ��ֽ�ȸ���� ������ ��� ������ ������ �հ� ����� ����Ѵ�.
 */
class JavaCo
{
	Busi_De[] dep1;
	De_De[] dep2;
	Boss bs;

	JavaCo(int de1, int de2){
		dep1 = new Busi_De[de1];
		for(int cnt=0;cnt<de1;cnt++){
			dep1[cnt] = new Busi_De();
		}
		dep2 = new De_De[de2];
		for(int cnt=0;cnt<de2;cnt++){
			dep2[cnt] = new De_De();
		}
		bs = new Boss();
	}

}
class Busi_De{
	Busi_De(){
		int rnd = (int)(Math.random()*100000+10000);
		em = new Emplo(rnd);
	}
	Emplo em;
	
}
class De_De{
	De_De(){
		int rnd = (int)(Math.random()*100000+10000);
		em = new Emplo(rnd);
	}
	Emplo em;
	
}
class Emplo{
	Emplo(int salary){this.salary = salary;}
	int salary;
}
class Boss{
	Boss(){}
	void sum_avg(JavaCo jc){
		int sum=0;
		for(int ct=0;ct<jc.dep1.length;ct++){
			sum = sum + jc.dep1[ct].em.salary;
		}
		for(int ct=0;ct<jc.dep2.length;ct++){
			sum = sum + jc.dep2[ct].em.salary;
		}
		System.out.println(sum+" "+sum/(jc.dep1.length+jc.dep2.length));
	}
}

class JavaHighSchool{
	JavaHighSchool(int a){
			std = new JHStudent[a];
			for(int cnt=0;cnt<a;cnt++){
				std[cnt] = new JHStudent((int)(Math.random()*100+1));
			}
			jht = new JHTeacher();
		}
	JHStudent[] std;
	JHTeacher jht;
}

class JHStudent{
	JHStudent(int score){this.score = score;}
	int score;
}

class JHTeacher
{
	JHTeacher(){}
	void sum_avg(JavaHighSchool jhs){
		int sum = 0;
		for(int cnt=0;cnt<jhs.std.length;cnt++){
			sum = sum + jhs.std[cnt].score;
		}
		System.out.println(sum+" "+sum/jhs.std.length);
	}
}

public class Test06 {
	
	public static void main(String[] args){
		JavaHighSchool jhs = new JavaHighSchool(20);
		jhs.jht.sum_avg(jhs);
		
		
		JavaCo jc = new JavaCo(10, 8);
		jc.bs.sum_avg(jc);	
	}
	
}
