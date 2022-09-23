package Week_9th;

// MARK: ISP - ������ ����, �۱��� �и���. 
interface Purchasable {
	void withdraw(int amount);
}

interface Depositable {
	void deposit(int amount);
}

interface Payment extends Purchasable {
	boolean isPurchasable();
}

interface Remittable {
	void sendMoney(int toAccountNumber, int amount);
}
// ---------------------------------------

// MARK: SRP (Account, Card, Point) - ����, ī��, ����Ʈ�� ���� �ش�Ǵ� å���� ����. 
class Account implements Purchasable, Depositable, Remittable {
	// MARK: OCP ( �ν��Ͻ����� �� �޼ҵ� ) - �ܺο��� ���� �ν��Ͻ� ������ �������� ����. �޼ҵ带 ���� ������ ����.
	private int balance;
	private int accountNumber;
	
	public void sendMoney(int toAccountNumber, int amount) {
		System.out.println(toAccountNumber + "��" + amount + "���� �۱��߽��ϴ�.");
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + "�� ��ݿϷ�");
		
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + "�� �ԱݿϷ�");
	}
	
	void setBalance(int amount) {
		this.balance = amount;
	}
	
	int getBalance() {
		return balance;
	}
	
	void setAccountNumber(int number) {
		this.accountNumber = number;
	}
	
	int getAccountNumber() {
		return accountNumber;
	}
	

}

class Card1 implements Payment {
	int balance;

	@Override
	public void withdraw(int amount) {
		System.out.println("ī������Ϸ�");
	}

	@Override
	public boolean isPurchasable() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

class Point1 implements Payment, Depositable {
	private int balance;

	@Override
	public void withdraw(int amount) {
		System.out.println("����Ʈ�����Ϸ�");
	}

	@Override
	public boolean isPurchasable() {
		// TODO Auto-generated method stub
		return false;
	}
	
	void addPoint(int amount) {
		this.balance += amount;
	}
	
	int getPoint() {
		return balance;
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		
	}

}

class Member {
	private UserInfo userInfo;
	private Account account;
	
	Point1 point;
	Coupon[] coupons;
	
	public Member(UserInfo userInfo) {
		// TODO Auto-generated constructor stub
		this.userInfo = userInfo;
		point = new Point1();
		coupons = new Coupon[10];
	}
	
	// MARK: OCP
	
	void purchase(Payment payment, int amount) {
		payment.withdraw(amount);
	}
	
}

class UserInfo {
	private String name;
	String phone;
	String email;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
}

class PartnerStore {
	String name;

}

class Coupon {
	String identifier;

}


public class mansuk {
	public static void main(String[] args) {
		// MARK: LSP & DIP - �������̽��κ��� �ο����� ����� �����ϰ� �۵���. ����ü�� ��ȯ�ص� ���� ����� ��. 
		Payment payment = (Payment) new Card1();
		payment.withdraw(500);
		
		Card1 card = new Card1();
		card.withdraw(500);
		
		Payment payment2 = (Payment) new Point1();
		payment2.withdraw(500);
		
		Point1 point = new Point1();
		point.withdraw(500);
	
	}
}