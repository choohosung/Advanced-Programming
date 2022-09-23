package Week_10th;

//싱글톤 패턴
class Sales {
	private int money;
	private static Sales salesInstance = new Sales();
	private Sales() { }
	public static Sales getInstance() {
		return salesInstance;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;
	}
}

//팩토리 메서드 패턴
abstract class CItem{ }

class Americano extends CItem { 
	Americano() {
		Making americanoMake = new Making(new AmericanoMaking());
		americanoMake.make();
		
		Request americano = new AmericanoDecorator(new BaseRequest());
		System.out.println(americano.addMenu());
	}
}

class Espresso extends CItem {
	Espresso() {
		Making espressoMake = new Making(new EspressoMaking());
		espressoMake.make();
		
		Request espresso = new EspressoDecorator(new BaseRequest());
		System.out.println(espresso.addMenu());
	}
}

class Latte extends CItem {
	Latte() {
		Making latteMake = new Making(new LatteMaking());
		latteMake.make();
		
		Request latte = new AmericanoDecorator(new BaseRequest());
		System.out.println(latte.addMenu());
	}
}

class CItemFactory {
	public CItem createItem(String type) {
		CItem returnItem = null;
		
		if(type.equals("아메리카노"))
			returnItem = new Americano();
		else if(type.equals("에스프레소"))
			returnItem = new Espresso();
		else if(type.equals("라떼"))
			returnItem = new Latte();
		return returnItem;	
	}
}

class CoffeeMachine {
	public CItem provideItem(String type) { 
        CItemFactory factory = new CItemFactory();
        CItem returnType = factory.createItem(type);

        return returnType;
    }
}

//데코레이터 패턴
interface Request{
	String addMenu();
}

class BaseRequest implements Request{
	public String addMenu() {
		return "서빙할 메뉴는 ";
	}
}

abstract class CDecorator implements Request {
	private Request coffeeRequest;
	
	public CDecorator(Request coffeeRequest) {
        this.coffeeRequest = coffeeRequest;
    }
    
    public String add() {
        return coffeeRequest.addMenu();
    }
}

class AmericanoDecorator extends CDecorator{
	public AmericanoDecorator(Request coffeeRequest) {
        super(coffeeRequest);
    }

    public String addMenu() {
        return super.add() + "아메리카노 입니다. \n";
    }
}

class EspressoDecorator extends CDecorator{
	public EspressoDecorator(Request coffeeRequest) {
        super(coffeeRequest);
    }

    public String addMenu() {
        return super.add() + "에스프레소 입니다. \n";
    }
}

class LatteDecorator extends CDecorator{
	public LatteDecorator(Request coffeeRequest) {
        super(coffeeRequest);
    }

    public String addMenu() {
        return super.add() + "라떼 입니다. \n";
    }
}

//전략 패턴
class Making {
	private MakingCoffee makingCoffee;
	
	public Making(MakingCoffee makingCoffee)
	{
		this.makingCoffee = makingCoffee;
	}

    public void make(){
        makingCoffee.make();
    }

    public void setMakingStrategy(MakingCoffee makingCoffee){
        this.makingCoffee = makingCoffee;
    }
}

interface MakingCoffee {
	public void make();
}

class AmericanoMaking implements MakingCoffee {
	public void make() {
		System.out.println("1500원 아메리카노 제작");
		Sales sales = Sales.getInstance();
		sales.setMoney(1500);
	}
}

class EspressoMaking implements MakingCoffee {
	public void make() {
		System.out.println("2000원 에스프레소 제작");
		Sales sales = Sales.getInstance();
		sales.setMoney(2000);
	}
}

class LatteMaking implements MakingCoffee {
	public void make() {
		System.out.println("3000원 라떼 제작");
		Sales sales = Sales.getInstance();
		sales.setMoney(3000);
	}
}

public class assignment_2 {

	public static void main(String[] args) {
		CoffeeMachine coffeemachine = new CoffeeMachine();
		Sales sales = Sales.getInstance();
		
		coffeemachine.provideItem("아메리카노");
		coffeemachine.provideItem("에스프레소");
		coffeemachine.provideItem("라떼");
		
		System.out.println("총 매상은 " + sales.getMoney() + "원 입니다.");		
		}
}
