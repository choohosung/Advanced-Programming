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
			System.out.println("버스가 만원입니다.");
		}
		else {
			passenger +=1;
			System.out.println("버스에 승객이 탔습니다.");
		}
	}
	
	public void drop() {
		if(passenger == 0) {
			System.out.println("버스에 승객이 없습니다.");
		}
		else {
			passenger -=1;
			System.out.println("버스에서 승객이 내렸습니다.");
		}
	}
	
	public void move() {
		System.out.println("버스가 출발합니다.");
	}
	
	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}
	
	public void load() {
		if(luggage == maxLuggage) {
			System.out.println("버스 짐 칸이 다 찼습니다.");
		}
		else {
			luggage +=1;
			System.out.println("버스에 짐을 실었습니다.");
		}
	}
	
	public void unload() {
		if(luggage == 0) {
			System.out.println("버스 짐 칸이 비었습니다.");
		}
		else {
			luggage -=1;
			System.out.println("버스에서 짐을 내렸습니다.");
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
			System.out.println("트럭이 만원입니다.");
		}
		else {
			passenger +=1;
			System.out.println("트럭에 승객이 탔습니다.");
		}
	}
	
	public void drop() {
		if(passenger == 0) {
			System.out.println("트럭에 승객이 없습니다.");
		}
		else {
			passenger -=1;
			System.out.println("트럭에서 승객이 내렸습니다.");
		}
	}
	
	public void move() {
		System.out.println("트럭이 출발합니다.");
	}
	
	public void stop() {
		System.out.println("트럭이 멈춥니다.");
	}
	
	public void load() {
		if(luggage == maxLuggage) {
			System.out.println("트럭 짐 칸이 다 찼습니다.");
		}
		else {
			luggage +=1;
			System.out.println("트럭에 짐을 실었습니다.");
		}
	}
	
	public void unload() {
		if(luggage == 0) {
			System.out.println("트럭 짐 칸이 비었습니다.");
		}
		else {
			luggage -=1;
			System.out.println("트럭에서 짐을 내렸습니다.");
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
			System.out.println("배가 만원입니다.");
		}
		else {
			passenger +=1;
			System.out.println("배에 승객이 탔습니다.");
		}
	}
	
	public void drop() {
		if(passenger == 0) {
			System.out.println("배에 승객이 없습니다.");
		}
		else {
			passenger -=1;
			System.out.println("배에서 승객이 내렸습니다.");
		}
	}
	
	public void move() {
		System.out.println("배가 출발합니다.");
	}
	
	public void stop() {
		System.out.println("배가 멈춥니다.");
	}
	
	public void load() {
		if(luggage == maxLuggage) {
			System.out.println("배 짐 칸이 다 찼습니다.");
		}
		else {
			luggage +=1;
			System.out.println("배에 짐을 실었습니다.");
		}
	}
	
	public void unload() {
		if(luggage == 0) {
			System.out.println("배 짐 칸이 비었습니다.");
		}
		else {
			luggage -=1;
			System.out.println("배에서 짐을 내렸습니다.");
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
