package Week_2nd;

public class ex_6 {

	public static void main(String[] args) {
		int num = 7;
		char ch ='0', ch2 = '7';
		System.out.printf("7 + '0' : %d\n", num + ch);
		System.out.printf("'7' - '0' : %d\n", ch2 - ch);
		
		System.out.printf("���� + �� ���ڿ� : %s\n", 7 + "");
		System.out.printf("���� + �� ���ڿ� : %s\n", '7' + "");
		
		num = Integer.parseInt("4000");
		Double pi = Double.parseDouble("3.14");
		
		System.out.printf("���ڿ��� ������ ��ȯ : %s\n", num);
		System.out.printf("���ڿ��� �Ǽ��� ��ȯ : %.2f\n", pi);
		
		String str = "CHAR";
		System.out.printf("ù��° ���� : %c\n", str.charAt(0));
		System.out.printf("����° ���� : %c\n", str.charAt(2));
	}

}
