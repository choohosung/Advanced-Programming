package Week_10th;

interface Drinks {
	static int AMERICANO = 1;
	static int LATTE = 2;
	static int GREEN_TEA = 3;
	static int YUJU_TEA = 4;
}

interface Cost {
	static int AMERICANO_COST = 4000;
	static int LATTE_COST = 4500;
	static int GREENTEA_COST = 4500;
	static int YUJUTEA_COST = 5000;
}

interface Menu extends Drinks, Cost {
	static String UPDATEDATE = "20211022";
}

// MARK: FactoryMethod Pattern
class MenuV2 implements Menu {
	
	MenuV2 provideMenu() {
		MenuFactory menuFactory = new MenuFactory();
		MenuV2 menu = menuFactory.createMenu();
		return menu;
	}

}

class MenuFactory {
	public MenuV2 createMenu() {
		MenuV2 menu = new MenuV2();
		return menu;
	}
}
// -----------------------------

// MARK: Decorator Pattern
class Order implements Menu {
	int productNO;
	int cost;
	
	Order getOrder() {
		return this;
	}
	
	public boolean checkPurchasble(int money) {
		return false;
	}
	
	public Order(int productNO) {
		this.productNO = productNO;
	}
}

class CompletedOrder extends Order {
	
	CompletedOrder provideOrder() {
		return this;
	}

	public CompletedOrder(int productNO) {
		super(productNO);
		// TODO Auto-generated constructor stub
	}
}
// ----------------------------------------------

class BuyerV2 implements Menu {
	private int money;  // 소지금
	private String inventory; // 소지물품
	
	Order order;
	
	// 구매요청이 없는....?
	void buyDrinks(int productNO) {
		order = new Order(productNO);
	}
	
	public void get_Product(int money, String product) {
		this.money -= money;
		this.inventory += product;
	}
	
	public Order setOrder(int productNO) {
		return new Order(productNO);
	}
	
	public int get_Money() {
		return money;
	}
	
	public String toString() {
		return "소지금 : " + money + "\t보유물품 : " + inventory; 
	}
	
	BuyerV2(int money)
	{
		this.money = money;
		this.inventory = "";
	}
}

class CasherV2 implements Menu {
	private static SalesVolume salesVolume;
	
	public void getSalesVolume() {
		System.out.println("매상 :" + salesVolume.getSalesVolume());
	}
	
	String sell(int money, String name) {
		if(money >= 4000 && name.equals("아메리카노")) {
			salesVolume.addSalesVolume(4000);
			return "아메리카노";
		} else if(money >= 4500 && name.equals("라떼")) {
			salesVolume.addSalesVolume(4500);
			return "라떼";
		} else if(name.equals("녹차")) {
			salesVolume.addSalesVolume(4500);
			return "녹차";
		} else if(money >= 5000 && name.equals("유자차")) {
			salesVolume.addSalesVolume(5000);
			return "유자차";
		} else {
			return "미등록상품";
		}
	}
	
	public String toString() {
		return "매출액 : " + salesVolume; 
	}
	
	void getOrder(Order order) {
		System.out.println("주문 받았습니다.");
	}
	
	void provideCompletedOrder(CompletedOrder order) {
		System.out.println("주문하신 음료 나왔습니다.");
	}
	
	CasherV2(int salesVolume) {
		this.salesVolume = new SalesVolume(salesVolume);
	}
}
// MARK: Singleton Pattern
class SalesVolume {
	private static int salesVolume;
	
	public int getSalesVolume() {
		return salesVolume;
	}
	
	public void addSalesVolume(int salesVolume) {
		this.salesVolume += salesVolume;
	}
	
	SalesVolume(int volume) {
		salesVolume = volume;
	}
}
// --------------------------

class Barista {
	private int coffee; 
	private int milk;
	private int greentea;
	private int yujatea;
	
	
	boolean Make_Tea(String product) {
		if(product.equals("아메리카노") && coffee >= 1)
			return true;
		else if(product.equals("라떼") && milk >= 1) // coffee -> milk로 바꿈 
			return true;
		else if(product.equals("녹차") && greentea >= 1)
			return true;
		else if(product.equals("유자차") && yujatea >= 1)
			return true;
		else
			return false;
	}
	
	Barista(int coffee, int milk, int greentea, int yujatea) {
		this.coffee = coffee;
		this.milk = milk;
		this.greentea = greentea;
		this.yujatea = yujatea;
	}
}
// MARK: Strategy Pattern
interface MakingStrategy {
	public void make();
}

class CoffeeStrategy implements MakingStrategy {
	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("로스팅기계로 제작");
	}
}

class TeaStrategy implements MakingStrategy {
	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("티백으로 제작");
	}
}

class Brewing {
	private MakingStrategy makingStrategy;
	
	void make() {
		makingStrategy.make();
	}
	
	void setMakingStrategy(MakingStrategy makingStrategy) {
		this.makingStrategy = makingStrategy;
	}
}

class Coffee extends Brewing {
	
}

class Tea extends Brewing {
	
}

// -----------------------------------------------------

public class Solution_10th {
	public static void main(String[] args) {
		
		CasherV2 ch = new CasherV2(0);
		ch.getSalesVolume();
		CasherV2 ch2 = new CasherV2(100);
		ch2.getSalesVolume();
		ch.getSalesVolume();
		
		Brewing coffee = new Coffee();
		Brewing tea = new Tea();
		
		coffee.setMakingStrategy(new CoffeeStrategy());
		tea.setMakingStrategy(new TeaStrategy());
		
		coffee.make();
		tea.make();
	}
	
}
