package Week_6th;

class CoffeeShop {
	int money; // 판매한 커피값을 저장 할 변수
	int coffeeStock;
	String printStock() {
		return "커피 재고 : " + coffeeStock;
	}
	
	CoffeeShop(int money, int coffeeStock)
	{
		this.money = money;
		this.coffeeStock = coffeeStock;
	}
}

class StarCoffee extends CoffeeShop{
	int shakeStock;

	String printStock() {
		return super.printStock() + " 쉐이크 재고 : " + shakeStock;
	}
	
	String brewing(int money) {
		this.money += money; // 판매한 커피 가격 만큼 매장에 매출 증가
		if(money == 4500)    // 별다방의 아메리카노(4000)의 값을 받으면
			return "별다방 아메리카노를 구입했습니다"; 
		else if(money == 5000)  // 별다방의 라떼(5000)의 값을 받으면
			return "별다방 라떼를 구입했습니다"; 
		else {
			this.money -= money;
			return "메뉴를 다시 골라주십시오.";
		}
	}
	
	StarCoffee(int money, int coffeeStock, int shakeStock)
	{
		super(money, coffeeStock);
		this.shakeStock = shakeStock;
	}
}

public class ex_1 {

	public static void main(String[] args) {
		StarCoffee sc = new StarCoffee(0, 200, 50);
		System.out.println(sc.printStock());
	}

}
