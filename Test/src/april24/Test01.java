package april24;

/*
 *  ��Ÿũ����Ʈ�� �����ϴ� ����
 * ����, ���۸�, ����, �޵��� �����Ͻÿ�.
 * ����, ���۸�, ������ ���������̰�, ������ ������ �� �ֽ��ϴ�.
 * ���� ���ϸ� ������ ������ �������� �Ҹ�˴ϴ�.
 * �޵��� ���������� �������� �����ϴ� ��Ȱ�� �մϴ�.
 */

class StarCraft {
	Common_Unit[] unit;
	StarCraft(){
		unit = new Common_Unit[3];
		
		unit[0] = new Zealot(1000, 100);
		unit[1] = new Zealot(1000, 100);
		unit[2] = new Medic(1500, 200);
	}
}

class Common_Unit {
	
	int health = 0;
	int attack_val = 0;
	int healing_val = 0;
	
	Common_Unit(int health, int attack_val, int healing_val){
		this.health = health;
		this.attack_val = attack_val;
		this.healing_val = healing_val;
	}
	
	void attack(Common_Unit unit){}
	void healing(Common_Unit unit){}
	
}

class Attack_Unit extends Common_Unit { 
	Attack_Unit(int health, int attack_val) {
		super(health, attack_val, 0);
	}
	@Override
	void attack(Common_Unit unit){
		unit.health = unit.health - this.attack_val;
	}
}

class Heal_Unit extends Common_Unit {
	Heal_Unit(int health, int healing_val) {
		super(health, 0, healing_val);
	}

	@Override
	void healing(Common_Unit unit) {
		unit.health = unit.health + this.healing_val;
	}	
}

class Zealot extends Attack_Unit {
	Zealot(int health, int attack_val){
		super(health, attack_val);
	}
}

class Zergling extends Attack_Unit {
	Zergling(int health, int attack_val){
		super(health, attack_val);
	}
}

class Marin extends Attack_Unit {
	Marin(int health, int attack_val){ 
		super(health, attack_val);
	}
}

class Medic extends Heal_Unit {
	Medic(int health, int healing_val){
		super(health, healing_val);
	}
	void healing(){}
}

public class Test01 {

	public static void main(String[] args) {
		StarCraft game = new StarCraft();
		
		System.out.println(game.unit[0].health);
		
		game.unit[0].attack(game.unit[1]);
		
		System.out.println(game.unit[1].health);
		
		game.unit[2].healing(game.unit[1]);
		
		System.out.println(game.unit[1].health);

	}

}
