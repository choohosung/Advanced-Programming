package Week_5th;

class NewTime{
	int hour;
	int minute;
	int second;
	
	NewTime(){
		hour = 0; minute = 0; second = 0;
	}
	
	NewTime(int h){
		//hour = 0;
		this(h, 0, 0);
	}
	
	NewTime(int h, int min){
		//NewTime(h, min, 0);
	}
	
	NewTime(int h, int min, int sec){
		hour = h; minute = min; second = sec;
	}
}

public class ex_6 {

	public static void main(String[] args) {
		NewTime t = new NewTime();
		t.hour = 12;
		t.minute = 20;
		t.second = 25;
		
		NewTime t2 = new NewTime(12, 20, 25);
		
		int res = ex_5.add(3, 5); // static �޼���. �ν��Ͻ� �������� �ʰ� ȣ�� ����
		
		System.out.println("static add method 3 + 5 : " + res);
		//int res2 = ex_5.minus(5, 3); // �Ϲ� �޼���� �ν��Ͻ� ���� �� ȣ��
		ex_5 ex5 = new ex_5();
		int res2 = ex5.minus(5, 3);
		
		System.out.println("minus method 5 - 3 : " + res2);

	}

}
