package Week_4th;

public class ex_4 {

	public static void main(String[] args) {
		// 깊은 복사
		
		  int[] math = { 1, 2, 3, 4, 5 } ;
	      int[] newMath = new int[5];
	      
	      System.out.println("math의 주소 : " + math);
	      System.out.println("newMath의 주소 : " + newMath);
	      
	      for(int i=0;i<math.length;i++)
	         newMath[i]=math[i];
	      
	      for(int i=0;i<newMath.length;i++){
	         if(i == 0)
	            System.out.printf("newMath 데이터 : ");
	         System.out.printf("%d ", newMath[i]);
	      }
	      System.out.println();
	      
	      int[] mathClone = math.clone();
	      System.out.println("mathClone의 주소 : " + mathClone);
	      
	      for(int i=0;i<mathClone.length;i++){
	         if(i == 0)
	            System.out.printf("mathClone 데이터 : ");
	         System.out.printf("%d ", mathClone[i]);
	      }
	      System.out.println();
	      
	      for(int i=0;i<newMath.length;i++) // newMath 0으로 값 변경
	         newMath[i]=0;
	      
	      System.arraycopy(math, 2, newMath, 0, 2); // 원본 배열, 시작 인덱스, 복사할 배열, 시작 인덱스, 개수
	      
	      for(int i=0;i<newMath.length;i++){
	         if(i == 0)
	            System.out.printf("newMath 데이터 : ");
	         System.out.printf("%d ", newMath[i]);
	      }
	      System.out.println();
	}

}
