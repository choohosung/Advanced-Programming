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
 
캐셔
아는 것 - 물픔 금액, 제품,   
할 수 있는 것 - 요금 검사, 제품 요구, 제품 인계
 
바리스타
아는 것 - 제품, 재고
할 수 있는 것 - 제품 제작, 제품 인계
*/

interface Menu {
	void set_Menu(String menu);
	String get_Menu();
}

class Information {
	protected String menu;
}

class Buyer extends Information implements Menu {
	private int money;  // 소지금
	private String inventory; // 소지물품
	
	public void get_Product(int money, Casher c)
	{
		this.money -= money;
		this.inventory += c.get_Menu();
	}
	
	public void set_Menu(String menu) {
		this.menu = menu;
	}
	
	public String get_Menu() {
		return menu;
	}
	
	public int get_Money() {
		return money;
	}
	
	public String toString() {
		return "소지금 : " + money + "\t보유물품 : " + inventory; 
	}
	
	Buyer(int money)
	{
		this.money = money;
		this.inventory = "";
	}
	
	Buyer(){
		
	}
}

class Casher extends Information implements Menu{
	private int salesVolume;
	private String menu;
	
	void getSalesVolume() {
		System.out.println("매상 :" + salesVolume);
	}
	
	String buy(Buyer buyer) {
		if(buyer.get_Money() >= 4000 && buyer.get_Menu().equals("아메리카노"))
		{
			salesVolume += 4000;
			this.menu = "아메리카노";
			return "아메리카노";
		}
		else if(buyer.get_Money() >= 4500) {
			if(buyer.get_Menu().equals("라떼"))
			{
				salesVolume += 4500;
				this.menu = "라떼";
				return "라떼";
			}
			else if(buyer.get_Menu().equals("녹차"))
			{
				salesVolume += 4500;
				this.menu = "녹차";
				return "녹차";
			}
			else
			{
				salesVolume += 4500;
				this.menu = "미등록상품";
				return "미등록상품";
			}
		} 
		else if((buyer.get_Money() >= 5000)) {
			if(buyer.get_Menu().equals("유자차"))
			{
				salesVolume += 5000;
				this.menu = "유자차";
				return "유자차";
			}
			else
				this.menu = "미등록상품";
				return "미등록상품";
		}
		else
			return null;
	}
	
	public String get_Menu() {
		return menu;
	}
	
	public void set_Menu(String menu) {
		this.menu = menu;
	}
	
	public String toString() {
		return "매출액 : " + salesVolume; 
	}
	
	Casher(int salesVolume) {
		this.salesVolume = salesVolume;
	}
}

class Barista extends Information implements Menu {
	private int coffee; 
	private int milk;
	private int greentea;
	private int yujutea;
	
	boolean Make_Tea(Casher c)
	{
		if(c.get_Menu().equals("아메리카노") && coffee >= 1)
			return true;
		else if(c.get_Menu().equals("라떼") && coffee >= 1)
			return true;
		else if(c.get_Menu().equals("녹차") && greentea >= 1)
			return true;
		else if(c.get_Menu().equals("유자차") && yujutea >= 1)
			return true;
		else
			return false;
	}
	
	public void set_Menu(String menu) {
		
	}
	public String get_Menu(){
		return menu;
	}
	
	Barista(int coffee, int milk, int greentea, int yujutea)
	{
		this.coffee = coffee;
		this.milk = milk;
		this.greentea = greentea;
		this.yujutea = yujutea;
	}
}

public class Ex_2 {

	static int AMARICANO = 1, AMARICANO_COST = 4000;
	static int LATTE = 2, LATTE_COST = 4500;
	static int GREEN_TEA = 3, GREENTEA_COST = 4500;
	static int YUJU_TEA = 4, YUJUTEA_COST = 5000;
	
	public static void main(String[] args) {
		Buyer b = new Buyer(10000);
		Casher ch = new Casher(0);
		Barista ba = new Barista(10, 10, 10, 10);
		
		b.set_Menu("아메리카노");
		ch.buy(b); 
			
		if(b.get_Menu().equals(ch.get_Menu())) {
			if(ba.Make_Tea(ch))
			{
				System.out.println("커피제작 완료.");
				b.get_Product(AMARICANO_COST, ch);
			}
		}
		
		System.out.println(b.toString());
		System.out.println(ch.toString());
	}
}
