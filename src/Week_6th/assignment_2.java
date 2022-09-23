package Week_6th;

class Vehicle{
	String name;
	int passenger = 0;
	int maxPassenger;
	int luggage = 0;
	int maxLuggage;
}

interface Transport{
	void ride();
	void drop();
	void move();
	void stop();
	void load();
	void unload();
}

class Bus extends Vehicle implements Transport{
	int maxLuggage = 1;
	public Bus(String name, int maxPassenger) {
		this.name = name;
		this.maxPassenger = maxPassenger;
	}
	
	public void ride() {
		if(passenger == maxPassenger) {
			System.out.println("������ �����Դϴ�.");
		}
		else {
			passenger +=1;
			System.out.println("������ �°��� �����ϴ�.");
		}
	}
	
	public void drop() {
		if(passenger == 0) {
			System.out.println("������ �°��� �����ϴ�.");
		}
		else {
			passenger -=1;
			System.out.println("�������� �°��� ���Ƚ��ϴ�.");
		}
	}
	
	public void move() {
		System.out.println("������ ����մϴ�.");
	}
	
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}
	
	public void load() {
		if(luggage == maxLuggage) {
			System.out.println("���� �� ĭ�� �� á���ϴ�.");
		}
		else {
			luggage +=1;
			System.out.println("������ ���� �Ǿ����ϴ�.");
		}
	}
	
	public void unload() {
		if(luggage == 0) {
			System.out.println("���� �� ĭ�� ������ϴ�.");
		}
		else {
			luggage -=1;
			System.out.println("�������� ���� ���Ƚ��ϴ�.");
		}
	}
}

class Truck extends Vehicle implements Transport{
	int maxLuggage = 3;
	public Truck(String name, int maxPassenger) {
		this.name = name;
		this.maxPassenger = maxPassenger;
	}
	
	public void ride() {
		if(passenger == maxPassenger) {
			System.out.println("Ʈ���� �����Դϴ�.");
		}
		else {
			passenger +=1;
			System.out.println("Ʈ���� �°��� �����ϴ�.");
		}
	}
	
	public void drop() {
		if(passenger == 0) {
			System.out.println("Ʈ���� �°��� �����ϴ�.");
		}
		else {
			passenger -=1;
			System.out.println("Ʈ������ �°��� ���Ƚ��ϴ�.");
		}
	}
	
	public void move() {
		System.out.println("Ʈ���� ����մϴ�.");
	}
	
	public void stop() {
		System.out.println("Ʈ���� ����ϴ�.");
	}
	
	public void load() {
		if(luggage == maxLuggage) {
			System.out.println("Ʈ�� �� ĭ�� �� á���ϴ�.");
		}
		else {
			luggage +=1;
			System.out.println("Ʈ���� ���� �Ǿ����ϴ�.");
		}
	}
	
	public void unload() {
		if(luggage == 0) {
			System.out.println("Ʈ�� �� ĭ�� ������ϴ�.");
		}
		else {
			luggage -=1;
			System.out.println("Ʈ������ ���� ���Ƚ��ϴ�.");
		}
	}
}

class Ship extends Vehicle implements Transport{
	int maxLuggage = 2;
	public Ship(String name, int maxPassenger) {
		this.name = name;
		this.maxPassenger = maxPassenger;
	}
	
	public void ride() {
		if(passenger == maxPassenger) {
			System.out.println("�谡 �����Դϴ�.");
		}
		else {
			passenger +=1;
			System.out.println("�迡 �°��� �����ϴ�.");
		}
	}
	
	public void drop() {
		if(passenger == 0) {
			System.out.println("�迡 �°��� �����ϴ�.");
		}
		else {
			passenger -=1;
			System.out.println("�迡�� �°��� ���Ƚ��ϴ�.");
		}
	}
	
	public void move() {
		System.out.println("�谡 ����մϴ�.");
	}
	
	public void stop() {
		System.out.println("�谡 ����ϴ�.");
	}
	
	public void load() {
		if(luggage == maxLuggage) {
			System.out.println("�� �� ĭ�� �� á���ϴ�.");
		}
		else {
			luggage +=1;
			System.out.println("�迡 ���� �Ǿ����ϴ�.");
		}
	}
	
	public void unload() {
		if(luggage == 0) {
			System.out.println("�� �� ĭ�� ������ϴ�.");
		}
		else {
			luggage -=1;
			System.out.println("�迡�� ���� ���Ƚ��ϴ�.");
		}
	}
}

public class assignment_2 {

	public static void main(String[] args) {
		Transport[] tp = new Transport[3];
		tp[0] = new Bus("Bus", 2);
		tp[1] = new Truck("Truck", 1);
		tp[2] = new Ship("Ship", 3);
				
		tp[0].ride();
		tp[0].ride();
		tp[0].ride();
		tp[0].move();
		tp[0].stop();
		tp[0].drop();
		tp[0].drop();
		tp[0].drop();
		tp[0].load();
		tp[0].load();
		tp[0].unload();
		tp[0].unload();
		System.out.print("\n");

		tp[1].ride();
		tp[1].ride();
		tp[1].move();
		tp[1].stop();
		tp[1].load();
		tp[1].load();
		tp[1].load();
		tp[1].load();
		tp[1].unload();
		tp[1].unload();
		tp[1].unload();
		tp[1].unload();
		System.out.print("\n");
		
		tp[2].ride();
		tp[2].ride();
		tp[2].ride();
		tp[2].ride();
		tp[2].move();
		tp[2].stop();
		tp[2].load();
		tp[2].load();
		tp[2].load();
		tp[2].unload();
		tp[2].unload();
		tp[2].unload();
		System.out.print("\n");
	}

}
