package Week_5th;

// Ŭ���� Tv ����
class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power =! power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}

public class ex_1 {

	public static void main(String[] args) {
		Tv t; // Tv ����
		t = new Tv(); // Tv ��ü ���� �� �ʱ�ȭ
		
		System.out.printf("color : %s, power : %b, channel : %d\n", t.color, t.power, t.channel);
		t.channel = 7;
		System.out.println("ä�� �ʱ�ȭ ��� ä�ΰ� : " + t.channel);
		t.channelDown();
		System.out.println("ä�� �ٿ� �޼��� ���� ��� ä�ΰ�: " + t.channel);

	}

}
