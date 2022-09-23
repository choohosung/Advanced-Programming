package Week_10th;

// 데코레이터 패턴

interface Component {
    String addIngredient(); //재료 추가
}

class BaseComponent implements Component {

    @Override
    public String addIngredient() {
        // TODO Auto-generated method stub
        return "Espresso";
    }
}

abstract class Decorator implements Component {
    private Component coffeeComp;
    
    public Decorator(Component coffeeComp) {
        this.coffeeComp = coffeeComp;
    }
    
    public String add() {
        return coffeeComp.addIngredient();
    }
}

class WaterDecorator extends Decorator {
    public WaterDecorator(Component coffeeComp) {
        super(coffeeComp);
    }
    
    @Override
    public String addIngredient() {
        // TODO Auto-generated method stub
        return super.add() + " + Water";
    }
}

class MilkDecorator extends Decorator {
    public MilkDecorator(Component coffeeComp) {
        super(coffeeComp);
    }
    
    @Override
    public String addIngredient() {
        // TODO Auto-generated method stub
        return super.add() + " + Milk";
    }
}

class CinnamonDecorator extends Decorator {
    public CinnamonDecorator(Component coffeeComp) {
        super(coffeeComp);
    }
    
    @Override
    public String addIngredient() {
        // TODO Auto-generated method stub
        return super.add() + " + Cinnamon";
    }
}


public class Ex_DecoratorPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Component espresso = new BaseComponent();
	    System.out.println("Espresso : " + espresso.addIngredient());

	    Component amaricano = new WaterDecorator(new BaseComponent());
	    System.out.println("Amaricano : " + amaricano.addIngredient());
	    
	    Component cafelatte = new MilkDecorator(new BaseComponent());
	    System.out.println("CafeLatte : " + cafelatte.addIngredient());
	    
	    Component cappuccino = new CinnamonDecorator(new MilkDecorator(new BaseComponent()));
	    System.out.println("Cappuccino : " + cappuccino.addIngredient());
	    
	}
}
