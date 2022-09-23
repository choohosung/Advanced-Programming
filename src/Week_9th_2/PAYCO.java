package Week_9th_2;

interface Pay{
	public void addCoupon();
}
interface cardPay extends Pay{	
	public void cardpay(int amount);
	}
interface pointPay extends Pay{
	public void pointpay(int amount);
}
interface accountPay extends Pay{
	public void accountpay(int amount);
}

class information{
	public int payMoney;
	static int numberofcoupon;
	public void useCoupon() {
		if(numberofcoupon > 0) {
			System.out.println("������ ����մϴ�.");
			numberofcoupon--;
		}
		else
			System.out.println("������ �����ϴ�.");	
	}
}

class Card extends information implements cardPay{
	public void cardpay(int amount) {
		payMoney = amount;
		System.out.println(amount + "�� ī�� �����Ϸ�");
	}
	public void addCoupon() {
		if(payMoney > 10000) {
			numberofcoupon++;
			System.out.println("���� ���� �߰�");
		}
		else
			System.out.println("���� �ݾ� �������� ���� �߱� ����");
	}
	public void useCoupon() {
		super.useCoupon();
	}
}

class Point extends information implements pointPay{
	int personalPoint = 0;
	public void pointpay(int amount) {
		System.out.println(amount + "�� ����Ʈ �����Ϸ�");
	}
	public void accumulatepoint(int amount) {
		personalPoint += amount * 0.1;
	}
	public void addCoupon() {
		if(payMoney > 10000) {
			numberofcoupon++;
			System.out.println("���� ���� �߰�");
		}
		else
			System.out.println("���� �ݾ� �������� ���� �߱� ����");
	}
	public void useCoupon() {
		super.useCoupon();
	}
}

class Account extends information implements accountPay{
	public void accountpay(int amount) {
		System.out.println(amount + "�� ���¼۱� �����Ϸ�");
		}
	public void addCoupon() {
		if(payMoney > 10000) {
			numberofcoupon++;
			System.out.println("���� ���� �߰�");
		}
		else
			System.out.println("���� �ݾ� �������� ���� �߱� ����");
	}
	public void useCoupon() {
		super.useCoupon();
	}
}

class Coupon{
	public void addCoupon(Pay pay) {
		if(pay == null) {}
		else
			pay.addCoupon();
	}
}

class Member{
	String name;
	int memberNumber;
	Pay pay;
	
	Member(String name, int memberNumber){
		this.name = name;
		this.memberNumber = memberNumber;
	}
	
	public void payType(Pay p) { }
}

class Affiliate{
	String address;
	Affiliate(String address){
		this.address = address;
	}
}

public class PAYCO {

	public static void main(String[] args) {
		Coupon coupon = new Coupon();
		
		cardPay pay1 = (cardPay)new Card();
		pay1.cardpay(40000);
		coupon.addCoupon(pay1);
		
		pointPay pay2 = (pointPay)new Point();
		pay2.pointpay(3000);
		coupon.addCoupon(pay2);
		
		accountPay pay3 = (accountPay)new Account();
		pay3.accountpay(2000);
		coupon.addCoupon(pay3);
	}

}
