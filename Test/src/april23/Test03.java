package april23;

class JavaCo{
	JavaCo(){
		
		ceo = new Ceo(1000);
		
		dept = new Department[3];
		
		dept[0] = new Sales(new Employee(1000), new Employee(1000), new Employee(1000), new Employee(1000), new Employee(1000));
		dept[1] = new Sales(new Employee(1000), new Employee(1000), new Employee(1000), new Employee(1000), new Employee(1000));
		dept[2] = new Sales(new Employee(1000), new Employee(1000), new Employee(1000), new Employee(1000), new Employee(1000));
		
	}
	 
	Department[] dept;
	
	Ceo ceo;
}

class Department{
	Department(Employee em1, Employee em2, Employee em3, Employee em4, Employee em5){
		this.em = new Employee[5];
		
		em[0] = em1; 
		em[1] = em2; 
		em[2] = em3; 
		em[3] = em4; 
		em[4] = em5; 
	}
	Employee[] em;
}

class Sales extends Department {
	Sales(Employee em1, Employee em2, Employee em3, Employee em4, Employee em5) {
		super(em1, em2, em3, em4, em5); 
	}
}

class Develop extends Department {
	Develop(Employee em1, Employee em2, Employee em3, Employee em4, Employee em5) {
		super(em1, em2, em3, em4, em5); 
	}
}

class GA extends Department {
	GA(Employee em1, Employee em2, Employee em3, Employee em4, Employee em5) {
		super(em1, em2, em3, em4, em5);
	}
}

class Employee{
	int salary;
	Employee(int salary){ this.salary = salary; }
}

class Ceo extends Employee {

	Ceo(int salary){super(salary);}

	void sum_employee(Department dept1, Department dept2, Department dept3){
		
		int sum = 0;
		
		for(int cnt = 0; cnt < dept1.em.length; cnt++){
			sum = sum + dept1.em[cnt].salary;
		}
		for(int cnt = 0; cnt < dept2.em.length; cnt++){
			sum = sum + dept2.em[cnt].salary;
		}
		for(int cnt = 0; cnt < dept3.em.length; cnt++){
			sum = sum + dept3.em[cnt].salary;
		}
		
		System.out.println(sum);
	}
}

public class Test03 {

	public static void main(String[] args) {
		
		JavaCo com1 = new JavaCo();
		
		com1.ceo.sum_employee(com1.dept[0], com1.dept[1], com1.dept[2]);		
	}

}
