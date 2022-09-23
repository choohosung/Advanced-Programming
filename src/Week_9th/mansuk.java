package Week_9th;

// MARK: ISP - 결제와 적립, 송금을 분리함. 
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

// MARK: SRP (Account, Card, Point) - 계좌, 카드, 포인트가 각각 해당되는 책임을 가짐. 
class Account implements Purchasable, Depositable, Remittable {
	// MARK: OCP ( 인스턴스변수 및 메소드 ) - 외부에서 직접 인스턴스 변수를 변경하지 못함. 메소드를 통한 수정만 가능.
	private int balance;
	private int accountNumber;
	
	public void sendMoney(int toAccountNumber, int amount) {
		System.out.println(toAccountNumber + "로" + amount + "원을 송금했습니다.");
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + "원 출금완료");
		
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + "원 입금완료");
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
		System.out.println("카드결제완료");
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
		System.out.println("포인트결제완료");
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
		// MARK: LSP & DIP - 인터페이스로부터 부여받은 기능이 동일하게 작동함. 조상객체로 변환해도 같은 기능을 함. 
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