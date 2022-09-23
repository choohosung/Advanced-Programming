package Week_6th;

abstract class NCoffeeShop {
	int money; // 판매한 커피값을 저장 할 변수
	int coffeeStock;
	String printStock() {
		return "커피 재고 : " + coffeeStock;
	}
	
	abstract String brewing(int money);
	
	NCoffeeShop(int money, int coffeeStock)
	{
		this.money = money;
		this.coffeeStock = coffeeStock;
	}
}

class AngelCoffee extends NCoffeeShop{
	int teaStock;

	String printStock() {
		return super.printStock() + " 홍차 재고 : " + teaStock;
	}
	
	String brewing(int money) {
		this.money += money; 
		if(money == 4500)    
			return "천사다방 아메리카노를 구입했습니다"; 
		else if(money == 5000) 
			return "천사다방 라떼를 구입했습니다";
		else if(money == 5700) 
			return "천사다방 홍차를 구입했습니다"; 
		else {
			this.money -= money;
			return "메뉴를 다시 골라주십시오.";
		}
	}
	
	AngelCoffee(int money, int coffeeStock, int teaStock)
	{
		super(money, coffeeStock);
		this.teaStock = teaStock;
	}
}

class ComCoffee extends NCoffeeShop{
	String brewing(int money) {
		this.money += money; 
		if(money == 3000)    
			return "컴다방 아메리카노를 구입했습니다"; 
		else if(money == 3500)  
			return "컴다방 아이스 아메리카노를 구입했습니다"; 
		else if(money == 4500)  
			return "컴다방 XXL 아이스 아메리카노를 구입했습니다";
		else {
			this.money -= money;
			return "메뉴를 다시 골라주십시오.";
		}
	}
	
	ComCoffee(int money, int coffeeStock)
	{
		super(money, coffeeStock);
	}
}

public class ex_4 {

	public static void main(String[] args) {
		NCoffeeShop[] cs = new NCoffeeShop[2];
		cs[0] = new AngelCoffee(0, 40, 30);
		cs[1] = new ComCoffee(0, 200);
		
		System.out.println(cs[0].printStock());
		System.out.println(cs[1].printStock());
		
		System.out.println(cs[0].brewing(4500));
		System.out.println(cs[1].brewing(3000));
		System.out.println(cs[1].brewing(4500));
		
		System.out.println("천사다방 매출액 : " + cs[0].money);
		System.out.println("컴다방 매출액 : " + cs[1].money);
	}

}
