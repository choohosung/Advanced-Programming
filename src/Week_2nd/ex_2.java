package Week_2nd;

public class ex_2 {

	public static void main(String[] args) {
		int a=5, b=10;
		
		a=b;
		b=a;
		
		System.out.println("a:"+a+" b:"+b);
		System.out.println("������ ��ȯ ����");
		
		int temp;
		a=5;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a:"+a+" b:"+b);
		System.out.println("������ ��ȯ ����");
		
	}

}
