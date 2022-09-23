package Week_4th;

public class ex_3 {

	public static void main(String[] args) {
		// 얉은 복사
		
		int[] math = {1, 2, 3, 4, 5};
		int[] newMath = new int[5];
		
		for(int i=0; i<math.length;i++) {
			if(i == 0)
				System.out.printf("Math 데이터 : ");
			System.out.printf("%d ", math[i]);
		}
		System.out.println("math의 주소 : " + math);
		
		for(int i=0;i<newMath.length;i++) {
			if(i==0)
				System.out.printf("newMath의 주소 : " + newMath);
		}
		newMath = math;
		System.out.println("얉은 복사 결과");
		
		for(int i=0;i<math.length;i++){
	         if(i == 0)
	            System.out.printf("Math 데이터 : ");
	         System.out.printf("%d ", math[i]);
	      }
	      System.out.println("math의 주소 : " + math);
	      
	      for(int i=0;i<newMath.length;i++){
	         if(i == 0)
	            System.out.printf("newMath 데이터 : ");
	         System.out.printf("%d ", newMath[i]);
	      }
	      System.out.println("newMath의 주소 : " + newMath);
			

	}

}
