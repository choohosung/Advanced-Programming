package Week_13th;

public class Ex_MultiException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);			
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); 		// ������� ����
		} catch (ArithmeticException ae) { // ���� catch ��� �� �ϳ��� ���� ��.
			ae.printStackTrace();
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println(6);
	}
}
