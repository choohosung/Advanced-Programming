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
	String text; // 자막을 보여주기 위한 문자열	
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
		Tv t = new SmartTv();     // 부모 타입의 참조변수로 자식 타익의 객체를 가르킬 수 있음.
		SmartTv s = new SmartTv();
		// SmartTv s2 = new Tv(); // 자식 타입의 참조변수로 조상 타입의 객체를 가르킬 수 없음.
		SmartTv s2 = (SmartTv)t;
		MonitorTv mt = new MonitorTv();
		
		s.price = 2000;
		s.bonusPoint = 20;
		mt.price = 1500;
		mt.bonusPoint = 15;
		
		Buyer b = new Buyer(10000, 100);
		
		b.buy(s);
		System.out.println("스마트TV 구매완료.");
		System.out.println("구매자의 남은 자산 : " + b.money);
		System.out.println("구매자의 보너스포인트 : " + b.bonusPoint);
		
		b.buy(mt);
		System.out.println("모니터TV 구매완료.");
		System.out.println("구매자의 남은 자산 : " + b.money);
		System.out.println("구매자의 보너스포인트 : " + b.bonusPoint);
	}

}
