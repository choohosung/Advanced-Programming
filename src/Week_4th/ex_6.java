package Week_4th;

public class ex_6 {

	public static void main(String[] args) {
		// StringBuffer 클래스
		
		StringBuffer sb = new StringBuffer("ABC"); // 문자열과 함께 생성 -> 버퍼 사이즈 19
		//StringBuffer sb = new StringBuffer(); // 기본 생성 -> 버퍼 사이즈 16
		//StringBuffer sb = new StringBuffer(30); // 문자열 버퍼 30 사이즈로 생성
				
		System.out.println(sb);
		sb.append(123); // String과 달리 내용 추가 가능. 내용 추가용 메서드. 
		System.out.println(sb);
		System.out.println("----------------------");
		System.out.println("sb  : " + sb.append(456).append(789));
		StringBuffer sb2 = new StringBuffer("ABC123456789");
		System.out.println("sb2 : " + sb2);

		System.out.println(sb.equals(sb2)); // equals를 사용해서 비교 불가능
		System.out.println(sb.toString().equals(sb2.toString())); 
		System.out.println("----------------------");

		System.out.printf("sb capacity = %d, length = %d\n", sb.capacity(), sb.length());
		System.out.println(sb.delete(3, sb.length()).toString());
		System.out.println(sb.deleteCharAt(2));
		System.out.println("----------------------");
				
		// StringBuffer 를 사용해서 아래와 같이 출력하시오.
		// 시작 문자열 : "Advanced Programming"
		// 출력 문자열 : "Enhanced Programming"
		//           "Enhanced Network"
	}

}
