package Week_6th;

abstract class NCoffeeShop {
	int money; // �Ǹ��� Ŀ�ǰ��� ���� �� ����
	int coffeeStock;
	String printStock() {
		return "Ŀ�� ��� : " + coffeeStock;
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
		return super.printStock() + " ȫ�� ��� : " + teaStock;
	}
	
	String brewing(int money) {
		this.money += money; 
		if(money == 4500)    
			return "õ��ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�"; 
		else if(money == 5000) 
			return "õ��ٹ� �󶼸� �����߽��ϴ�";
		else if(money == 5700) 
			return "õ��ٹ� ȫ���� �����߽��ϴ�"; 
		else {
			this.money -= money;
			return "�޴��� �ٽ� ����ֽʽÿ�.";
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
			return "�Ĵٹ� �Ƹ޸�ī�븦 �����߽��ϴ�"; 
		else if(money == 3500)  
			return "�Ĵٹ� ���̽� �Ƹ޸�ī�븦 �����߽��ϴ�"; 
		else if(money == 4500)  
			return "�Ĵٹ� XXL ���̽� �Ƹ޸�ī�븦 �����߽��ϴ�";
		else {
			this.money -= money;
			return "�޴��� �ٽ� ����ֽʽÿ�.";
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
		
		System.out.println("õ��ٹ� ����� : " + cs[0].money);
		System.out.println("�Ĵٹ� ����� : " + cs[1].money);
	}

}
