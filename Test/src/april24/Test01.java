package april24;

/*
 *  스타크래프트에 등장하는 유닛
 * 질럿, 저글링, 마린, 메딕을 설계하시오.
 * 질럿, 저글링, 마린은 공격유닛이고, 상대방을 공격할 수 있습니다.
 * 공격 당하면 일정한 수준의 에너지가 소멸됩니다.
 * 메딕은 공격유닛의 에너지를 복구하는 역활을 합니다.
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
