package Week_7th;
/* 객체지향적 분석 
/ 협동, 책임, 역할
/ 아는 것, 할 수 있는 것

 고객이 메뉴를 정하고 돈을 준비해서 캐셔에게 전달한다.
 캐셔는 돈을 확인하고 음료를 만들어달고 하고 주문한다.
 제작된 음료를 캐셔가 제공한다.
 ---------------------------------------
고객
아는 것 - 소지금, 소지물품
할 수있는 것 - 구매 요청, 제품 인수

주문
아는 것 - 제품번호, 제품이름 
할 수 있는 것 - 제품번호와 제품이름 매칭 
 
캐셔
아는 것 - 제품 금액, 주문결제가능여부   
할 수 있는 것 - 요금 계산, 제품 요구, 제품 인수인계
 
바리스타
아는 것 - 제품, 재고
할 수 있는 것 - 제품 제작, 제품 인계
*/
interface Drinks_v2 {
	static int AMERICANO = 1;
	static int LATTE = 2;
	static int GREEN_TEA = 3;
	static int YUJU_TEA = 4;
}

interface Cost_v2 {
	static int AMERICANO_COST = 4000;
	static int LATTE_COST = 4500;
	static int GREENTEA_COST = 4500;
	static int YUJUTEA_COST = 5000;
}

interface Menu_v2 extends Drinks_v2, Cost_v2 {
	static String UPDATEDATE = "20211022";
}

interface Employee {
	Order_v2 sendCompletedProduct(Order_v2 order);
}

class Order_v2 implements Menu_v2 {
	int productNO;
	String productName;
	
	String getProductName(int productNO) {
		switch (productNO) {
		case 1:
			return "아메리카노";
		case 2:
			return "라떼";
		case 3:
			return "녹차";
		case 4:
			return "유자차";
		default:
			return "미등록상품";
		}
	}
	
	int getProductNO(String productName) {
		switch (productName) {
		case "아메리카노":
			return 1;
		case "라떼":
			return 2;
		case "녹차":
			return 3;
		case "유자차":
			return 4;
		default:
			return 0;
		}
	}
	
	Order_v2(int productNO) {
		this.productNO = productNO ;
		this.productName = getProductName(productNO);
	}
	
	Order_v2(String productName) {
		this.productNO = getProductNO(productName) ;
		this.productName = productName;
	}
	
	Order_v2(int productNO, String productName) {
		this.productNO = productNO;
		this.productName = productName;
	}
}

class Buyer_v2 implements Menu_v2 {
	private int money;  // 소지금
	private String inventory; // 소지물품
	
	public void get_Product(String product) {
		this.inventory += product;
	}
	
	public Order_v2 buy(String productName) {
		Order_v2 order = new Order_v2(productName);
		System.out.println("손님_ " + productName + "를 주문했습니다.");
		return order;
	}
	
	public int get_Money() {
		return money;
	}
	
	public String toString() {
		return "손님_ 소지금 : " + money + ",\t보유물품 : " + inventory; 
	}
	
	Buyer_v2(int money)
	{
		this.money = money;
		this.inventory = "";
	}
}

class Casher_v2 implements Menu_v2, Employee {
	private int salesVolume;
	private boolean isPurchasable = false;
	
	void count(int money, Order_v2 order) {
		if(money >= 4000 && order.productName.equals("아메리카노")) {
			setPurchasable(true);
			salesVolume += 4000;
		} else if(money >= 4500 && (order.productName.equals("라떼") || order.productName.equals("녹차"))) {
			setPurchasable(true);
			salesVolume += 4500;
		} else if(money >= 5000 && order.productName.equals("유자차")) {
			setPurchasable(true);
			salesVolume += 5000;
		} else {
			return;
		}
	}
	
	public String toString() {
		return "종업원_ 매출액 : " + salesVolume; 
	}
	
	Casher_v2(int salesVolume) {
		this.salesVolume = salesVolume;
	}

	public boolean isPurchasable() {
		System.out.println("종업원_ 결제완료.");
		return isPurchasable;
	}

	public void setPurchasable(boolean isPurchasable) {
		this.isPurchasable = isPurchasable;
	}

	@Override
	public Order_v2 sendCompletedProduct(Order_v2 order) {
		// TODO Auto-generated method stub
		System.out.println("종업원_ 손님에게 음료 전달");
		return order;
	}
}

class Barista_v2 implements Drinks_v2, Employee {
	private int productNO;
	private int coffee; 
	private int latte;
	private int greentea;
	private int yujutea;
	
	Barista_v2(int coffee, int latte, int greentea, int yujutea)
	{
		this.coffee = coffee;
		this.latte = latte;
		this.greentea = greentea;
		this.yujutea = yujutea;
	}
	
	boolean Make_Tea(String product) {
		System.out.println("바리스타_ 음료제작중.....");
		if(product.equals("아메리카노") && coffee >= 1) {
			setProductNO(AMERICANO);
			coffee -= 1;
			return true;
		} else if(product.equals("라떼") && latte >= 1) {
			setProductNO(LATTE);
			latte -= 1;
			return true;
		} else if(product.equals("녹차") && greentea >= 1) {
			setProductNO(GREEN_TEA);
			greentea -= 1;
			return true;
		} else if(product.equals("유자차") && yujutea >= 1) {
			setProductNO(YUJU_TEA);
			yujutea -= 1;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public Order_v2 sendCompletedProduct(Order_v2 order) {
		// TODO Auto-generated method stub
		System.out.println("바리스타_ 종업원에게 음료 전달");
		return order;
	}

	public int getProductNO() {
		return productNO;
	}

	public void setProductNO(int productNO) {
		this.productNO = productNO;
	}
}


public class ex_1ss {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order_v2 order;
		Buyer_v2 buyer = new Buyer_v2(10000);
		Casher_v2 casher = new Casher_v2(0);
		Barista_v2 barista = new Barista_v2(10, 10, 10, 10);
		
		
//		String want_drink = "아메리카노";
//		String want_drink = "라떼";
//		String want_drink = "녹차";
		String want_drink = "유자차";
		
		order = buyer.buy(want_drink);
		casher.count(buyer.get_Money(), order);
		
		if (casher.isPurchasable() && barista.Make_Tea(order.productName)) {
			System.out.println("바리스타_ " + order.productName + " 제작완료.");
			Order_v2 completedProduct = barista.sendCompletedProduct(order);
			buyer.get_Product(casher.sendCompletedProduct(completedProduct).productName);
		}
		
		System.out.println(buyer.toString());
		System.out.println(casher.toString());
		
	}
}