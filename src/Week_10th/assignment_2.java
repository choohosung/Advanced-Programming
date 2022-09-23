package Week_10th;

//�̱��� ����
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

//���丮 �޼��� ����
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
		
		if(type.equals("�Ƹ޸�ī��"))
			returnItem = new Americano();
		else if(type.equals("����������"))
			returnItem = new Espresso();
		else if(type.equals("��"))
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

//���ڷ����� ����
interface Request{
	String addMenu();
}

class BaseRequest implements Request{
	public String addMenu() {
		return "������ �޴��� ";
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
        return super.add() + "�Ƹ޸�ī�� �Դϴ�. \n";
    }
}

class EspressoDecorator extends CDecorator{
	public EspressoDecorator(Request coffeeRequest) {
        super(coffeeRequest);
    }

    public String addMenu() {
        return super.add() + "���������� �Դϴ�. \n";
    }
}

class LatteDecorator extends CDecorator{
	public LatteDecorator(Request coffeeRequest) {
        super(coffeeRequest);
    }

    public String addMenu() {
        return super.add() + "�� �Դϴ�. \n";
    }
}

//���� ����
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
		System.out.println("1500�� �Ƹ޸�ī�� ����");
		Sales sales = Sales.getInstance();
		sales.setMoney(1500);
	}
}

class EspressoMaking implements MakingCoffee {
	public void make() {
		System.out.println("2000�� ���������� ����");
		Sales sales = Sales.getInstance();
		sales.setMoney(2000);
	}
}

class LatteMaking implements MakingCoffee {
	public void make() {
		System.out.println("3000�� �� ����");
		Sales sales = Sales.getInstance();
		sales.setMoney(3000);
	}
}

public class assignment_2 {

	public static void main(String[] args) {
		CoffeeMachine coffeemachine = new CoffeeMachine();
		Sales sales = Sales.getInstance();
		
		coffeemachine.provideItem("�Ƹ޸�ī��");
		coffeemachine.provideItem("����������");
		coffeemachine.provideItem("��");
		
		System.out.println("�� �Ż��� " + sales.getMoney() + "�� �Դϴ�.");		
		}
}
