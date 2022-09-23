package Week_6th;

class Tv {
	boolean power;
	int channel;
	int price;
	int bonusPoint;

	void onOff() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
	
}

class SmartTv extends Tv {
	String text; // �ڸ��� �����ֱ� ���� ���ڿ�	
	void caption() { }
}

class MonitorTv extends Tv {
	int inputSelect;
}

class Buyer {
	int money;
	int bonusPoint;
	
	void buy(Tv t){
		money -= t.price;
		bonusPoint += t.bonusPoint;
	}
	
	Buyer(int money, int bonusPoint)
	{
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
}

public class ex_3 {

	public static void main(String[] args) {
		Tv t = new SmartTv();     // �θ� Ÿ���� ���������� �ڽ� Ÿ���� ��ü�� ����ų �� ����.
		SmartTv s = new SmartTv();
		// SmartTv s2 = new Tv(); // �ڽ� Ÿ���� ���������� ���� Ÿ���� ��ü�� ����ų �� ����.
		SmartTv s2 = (SmartTv)t;
		MonitorTv mt = new MonitorTv();
		
		s.price = 2000;
		s.bonusPoint = 20;
		mt.price = 1500;
		mt.bonusPoint = 15;
		
		Buyer b = new Buyer(10000, 100);
		
		b.buy(s);
		System.out.println("����ƮTV ���ſϷ�.");
		System.out.println("�������� ���� �ڻ� : " + b.money);
		System.out.println("�������� ���ʽ�����Ʈ : " + b.bonusPoint);
		
		b.buy(mt);
		System.out.println("�����TV ���ſϷ�.");
		System.out.println("�������� ���� �ڻ� : " + b.money);
		System.out.println("�������� ���ʽ�����Ʈ : " + b.bonusPoint);
	}

}
