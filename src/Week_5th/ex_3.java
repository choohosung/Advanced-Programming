package Week_5th;

// 클래스 Tv 추가요소본
class NewTv{
	String color;
	boolean power;
	int channel;
	
	static int width;
	static int height;
	
	void power() {power =! power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}

public class ex_3 {

	public static void main(String[] args) {
		NewTv t = new NewTv();
		NewTv t2 = new NewTv();
		
		// 클래스 변수 초기화
		t.width = 300;
		t.height = 200;

		// 인스턴스 변수 초괴화
		t.color = "Blue";
		t.channel = 5;
		t2.color = "White";
		t2.power = true;
		t2.channel = 7;
		
		// 각 클래스 값 출력
		System.out.printf("T - color : %s, power : %b, channel : %d\n", t.color, t.power, t.channel);
		System.out.printf("T2 - color : %s, power : %b, channel : %d\n", t2.color, t2.power, t2.channel);
		// 클래스 변수 출력
		System.out.printf("T1 - width : %d, height : %d\n", t.width, t.height);
		t.width = 700;
		System.out.printf("T2 - width : %d, height : %d\n", t2.width, t2.height);
	}

}
