package Week_6th;

class Unit {
	String name;
	int hp;
	int mp;
}

interface Fightable {
	void move(int x, int y);
	void attack(Unit u);
}

class Fighter extends Unit implements Fightable{
	public void move(int x, int y) { /* 내용 생략 */ }
	public void attack(Unit u) { /* 내용 생략 */ }
}
public class ex_5 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable fa = new Fighter();
	}

}
