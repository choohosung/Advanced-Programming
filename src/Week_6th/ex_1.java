package Week_6th;

class CoffeeShop {
	int money; // �Ǹ��� Ŀ�ǰ��� ���� �� ����
	int coffeeStock;
	String printStock() {
		return "Ŀ�� ��� : " + coffeeStock;
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
		return super.printStock() + " ����ũ ��� : " + shakeStock;
	}
	
	String brewing(int money) {
		this.money += money; // �Ǹ��� Ŀ�� ���� ��ŭ ���忡 ���� ����
		if(money == 4500)    // ���ٹ��� �Ƹ޸�ī��(4000)�� ���� ������
			return "���ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�"; 
		else if(money == 5000)  // ���ٹ��� ��(5000)�� ���� ������
			return "���ٹ� �󶼸� �����߽��ϴ�"; 
		else {
			this.money -= money;
			return "�޴��� �ٽ� ����ֽʽÿ�.";
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
