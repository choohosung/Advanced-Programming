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
 
ĳ��
�ƴ� �� - ���� �ݾ�, ��ǰ,   
�� �� �ִ� �� - ��� �˻�, ��ǰ �䱸, ��ǰ �ΰ�
 
�ٸ���Ÿ
�ƴ� �� - ��ǰ, ���
�� �� �ִ� �� - ��ǰ ����, ��ǰ �ΰ�
*/

interface Menu {
	void set_Menu(String menu);
	String get_Menu();
}

class Information {
	protected String menu;
}

class Buyer extends Information implements Menu {
	private int money;  // ������
	private String inventory; // ������ǰ
	
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
		return "������ : " + money + "\t������ǰ : " + inventory; 
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
		System.out.println("�Ż� :" + salesVolume);
	}
	
	String buy(Buyer buyer) {
		if(buyer.get_Money() >= 4000 && buyer.get_Menu().equals("�Ƹ޸�ī��"))
		{
			salesVolume += 4000;
			this.menu = "�Ƹ޸�ī��";
			return "�Ƹ޸�ī��";
		}
		else if(buyer.get_Money() >= 4500) {
			if(buyer.get_Menu().equals("��"))
			{
				salesVolume += 4500;
				this.menu = "��";
				return "��";
			}
			else if(buyer.get_Menu().equals("����"))
			{
				salesVolume += 4500;
				this.menu = "����";
				return "����";
			}
			else
			{
				salesVolume += 4500;
				this.menu = "�̵�ϻ�ǰ";
				return "�̵�ϻ�ǰ";
			}
		} 
		else if((buyer.get_Money() >= 5000)) {
			if(buyer.get_Menu().equals("������"))
			{
				salesVolume += 5000;
				this.menu = "������";
				return "������";
			}
			else
				this.menu = "�̵�ϻ�ǰ";
				return "�̵�ϻ�ǰ";
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
		return "����� : " + salesVolume; 
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
		if(c.get_Menu().equals("�Ƹ޸�ī��") && coffee >= 1)
			return true;
		else if(c.get_Menu().equals("��") && coffee >= 1)
			return true;
		else if(c.get_Menu().equals("����") && greentea >= 1)
			return true;
		else if(c.get_Menu().equals("������") && yujutea >= 1)
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
		
		b.set_Menu("�Ƹ޸�ī��");
		ch.buy(b); 
			
		if(b.get_Menu().equals(ch.get_Menu())) {
			if(ba.Make_Tea(ch))
			{
				System.out.println("Ŀ������ �Ϸ�.");
				b.get_Product(AMARICANO_COST, ch);
			}
		}
		
		System.out.println(b.toString());
		System.out.println(ch.toString());
	}
}
