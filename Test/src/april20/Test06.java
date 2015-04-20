package april20;

/*2.자바고등학교에 학생 20명이 있다.
 * 모든 학생은 점수가 있다.
 * 점수는 난수, 범위는 0~100점
 * 자바고등학교엔 담임선생님이 있다.
 * 담임선생님은 모든 학생의 점수 합과 평균을 출력한다.
 */

/*3.자바주식회사에 영업부, 개발부가 있다.
 * 영업부는 10명, 개발부는 8명이 있다.
 * 모든 직원은 월급이 있다.
 * 월급은 난수이고 범위는 일만~십만원이다.
 * 자바주식회사의 사장이 모든 직원의 월급의 합과 평균을 출력한다.
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
