package Week_10th;

class Moving {
    private MovableStrategy movableStrategy;

    public void move(){
        movableStrategy.move();
    }

    public void setMovableStrategy(MovableStrategy movableStrategy){
        this.movableStrategy = movableStrategy;
    }
}
class Bus extends Moving{

}
class Train extends Moving{

}

interface MovableStrategy {
    public void move();
}

class WaterStrategy implements MovableStrategy{
    public void move(){
        System.out.println("수로를 통해 이동");
    }
}

class LandStrategy implements MovableStrategy{
    public void move() {
        System.out.println("도로를 통해 이동");
    }
}

public class Ex_StrategyPattern_Apply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moving train = new Train();
        Moving bus = new Bus();

        train.setMovableStrategy(new WaterStrategy());
        bus.setMovableStrategy(new LandStrategy());
        train.move();
        bus.move();
        bus.setMovableStrategy(new WaterStrategy());
        bus.move();
	}

}
