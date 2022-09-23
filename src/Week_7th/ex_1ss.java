package Week_7th;
/* ��ü������ �м� 
/ ����, å��, ����
/ �ƴ� ��, �� �� �ִ� ��

 ���� �޴��� ���ϰ� ���� �غ��ؼ� ĳ�ſ��� �����Ѵ�.
 ĳ�Ŵ� ���� Ȯ���ϰ� ���Ḧ �����ް� �ϰ� �ֹ��Ѵ�.
 ���۵� ���Ḧ ĳ�Ű� �����Ѵ�.
 ---------------------------------------
��
�ƴ� �� - ������, ������ǰ
�� ���ִ� �� - ���� ��û, ��ǰ �μ�

�ֹ�
�ƴ� �� - ��ǰ��ȣ, ��ǰ�̸� 
�� �� �ִ� �� - ��ǰ��ȣ�� ��ǰ�̸� ��Ī 
 
ĳ��
�ƴ� �� - ��ǰ �ݾ�, �ֹ��������ɿ���   
�� �� �ִ� �� - ��� ���, ��ǰ �䱸, ��ǰ �μ��ΰ�
 
�ٸ���Ÿ
�ƴ� �� - ��ǰ, ���
�� �� �ִ� �� - ��ǰ ����, ��ǰ �ΰ�
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
			return "�Ƹ޸�ī��";
		case 2:
			return "��";
		case 3:
			return "����";
		case 4:
			return "������";
		default:
			return "�̵�ϻ�ǰ";
		}
	}
	
	int getProductNO(String productName) {
		switch (productName) {
		case "�Ƹ޸�ī��":
			return 1;
		case "��":
			return 2;
		case "����":
			return 3;
		case "������":
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
	private int money;  // ������
	private String inventory; // ������ǰ
	
	public void get_Product(String product) {
		this.inventory += product;
	}
	
	public Order_v2 buy(String productName) {
		Order_v2 order = new Order_v2(productName);
		System.out.println("�մ�_ " + productName + "�� �ֹ��߽��ϴ�.");
		return order;
	}
	
	public int get_Money() {
		return money;
	}
	
	public String toString() {
		return "�մ�_ ������ : " + money + ",\t������ǰ : " + inventory; 
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
		if(money >= 4000 && order.productName.equals("�Ƹ޸�ī��")) {
			setPurchasable(true);
			salesVolume += 4000;
		} else if(money >= 4500 && (order.productName.equals("��") || order.productName.equals("����"))) {
			setPurchasable(true);
			salesVolume += 4500;
		} else if(money >= 5000 && order.productName.equals("������")) {
			setPurchasable(true);
			salesVolume += 5000;
		} else {
			return;
		}
	}
	
	public String toString() {
		return "������_ ����� : " + salesVolume; 
	}
	
	Casher_v2(int salesVolume) {
		this.salesVolume = salesVolume;
	}

	public boolean isPurchasable() {
		System.out.println("������_ �����Ϸ�.");
		return isPurchasable;
	}

	public void setPurchasable(boolean isPurchasable) {
		this.isPurchasable = isPurchasable;
	}

	@Override
	public Order_v2 sendCompletedProduct(Order_v2 order) {
		// TODO Auto-generated method stub
		System.out.println("������_ �մԿ��� ���� ����");
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
		System.out.println("�ٸ���Ÿ_ ����������.....");
		if(product.equals("�Ƹ޸�ī��") && coffee >= 1) {
			setProductNO(AMERICANO);
			coffee -= 1;
			return true;
		} else if(product.equals("��") && latte >= 1) {
			setProductNO(LATTE);
			latte -= 1;
			return true;
		} else if(product.equals("����") && greentea >= 1) {
			setProductNO(GREEN_TEA);
			greentea -= 1;
			return true;
		} else if(product.equals("������") && yujutea >= 1) {
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
		System.out.println("�ٸ���Ÿ_ ���������� ���� ����");
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
		
		
//		String want_drink = "�Ƹ޸�ī��";
//		String want_drink = "��";
//		String want_drink = "����";
		String want_drink = "������";
		
		order = buyer.buy(want_drink);
		casher.count(buyer.get_Money(), order);
		
		if (casher.isPurchasable() && barista.Make_Tea(order.productName)) {
			System.out.println("�ٸ���Ÿ_ " + order.productName + " ���ۿϷ�.");
			Order_v2 completedProduct = barista.sendCompletedProduct(order);
			buyer.get_Product(casher.sendCompletedProduct(completedProduct).productName);
		}
		
		System.out.println(buyer.toString());
		System.out.println(casher.toString());
		
	}
}