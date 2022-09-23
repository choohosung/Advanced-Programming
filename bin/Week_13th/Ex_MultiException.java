package Week_13th;

public class Ex_MultiException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);			
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); 		// 실행되지 않음
		} catch (ArithmeticException ae) { // 다중 catch 사용 시 하나만 적용 됨.
			ae.printStackTrace();
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println(6);
	}
}
