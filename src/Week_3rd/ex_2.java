package Week_3rd;

public class ex_2 {

	public static void main(String[] args) {
		// ����ȭ ������
		double avg = 90.5;
		int score = (int)avg;
		
		System.out.printf("avg�� �� : %f, score�� �� : %d\n", avg, score);
		
		char ch = '0'; // Unicode 48
		int temp = (int)ch;
		
		System.out.printf("ch�� �� : %c, temp�� �� : %d\n", ch, temp);
		
		// �ڵ� ����ȯ
		// int pi = 3.14; ���� �� -> ū �� ���� �߻�, ���� ����ȭ �ʿ�
		
		double dAuto = 314; // ū �� -> ���� �� ����
		double dManual = (double)314;
		
		System.out.printf("�ڵ� ����ȯ double �� : %f, ���� ����ȯ double �� : %f\n", dAuto, dManual);
		
		score = 400;
		byte bScore = (byte)score;
		
		System.out.printf("int score�� �� : %d, ���� ����ȯ bScore�� �� : %d\n", score, bScore);
		// ������ ������
		boolean bOn = false;
		System.out.println("������ ���� ��� : "+ !bOn);
		// ��Ʈ��ȯ ������
		// 10���� 12  : 00001101
		// 10���� -13 : 11110010
		score = 12;
		System.out.printf("score = %d, ��Ʈ��ȯ ���� ��� = %d\n", score, ~score);

	}

}
