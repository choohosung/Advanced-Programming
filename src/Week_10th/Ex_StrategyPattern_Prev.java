package Week_10th;

interface Movable {
    public void move();
}

interface Movable2 {
	public void move2();
}

interface MovableFull extends Movable, Movable2 {
	
}

class Ship implements Movable{
    public void move(){
        System.out.println("���θ� ���� �̵�");
    }
}

class Car implements Movable{
    public void move(){
        System.out.println("���θ� ���� �̵�");
    }
}



public class Ex_StrategyPattern_Prev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movable ship = new Ship();
        Movable car = new Car();

        ship.move();
        car.move();
	}

}
