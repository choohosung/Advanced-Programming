package Week_13th;

public class Ex_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);			
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); 	// 실행되지 않음
		} catch (Exception e)	{	 
			System.out.println(5);  // 에러 발생시 catch 내용 실행
		} 
		
		System.out.println(6);
	}
}
