package Week_3rd;

public class ex_3 {

	public static void main(String[] args) {
		// byte ���� : -128 ~ 127
		byte a = 5, b = 10;
		// byte c = a+b; // ���� int ������ byte���� ����� �۱� ������ int ������ ��ȯ �� ���� ����
		byte c = (byte)(a+b);
		
		int iTemp = 200000;
		long l = iTemp*iTemp;
		System.out.println("20�� * 20�� ����ȯ ���� �� : " + l);
		l = (long)iTemp*(long)iTemp;
		System.out.println("20�� * 20�� ����ȯ �� : " + l);
		
		System.out.println("int / int : " + 12/5);
		System.out.println("int / double : " + 12/5.0);
		
		int div = 10/7, mod = 10%7;
		System.out.println("������ �� ���  : " + div + " ������ ��� : " + mod);
		
		a = 10;
		b = (byte)(a<<2);
		
		System.out.printf("���� �� : %d, ����Ʈ ������ : %d\n", a, b);
		
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		System.out.println("f�� �� : " + f + " d�� �� : " + d + " d2�� �� : " + d2);

	}

}
