package Week_3rd;

public class ex_8 {

	public static void main(String[] args) {
		// �ݺ���
		// for��
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1���� 10���� ���� ��� : " + sum);
		//System.out.println("�ݺ��� �� ���� i : " + i);
		
		// ��ø for��
		// ������ ��� ��
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++)
				System.out.println(i + "*" + j + "=" + (i*j));
		}
	}
}
