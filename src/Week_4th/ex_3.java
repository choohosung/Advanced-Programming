package Week_4th;

public class ex_3 {

	public static void main(String[] args) {
		// ���� ����
		
		int[] math = {1, 2, 3, 4, 5};
		int[] newMath = new int[5];
		
		for(int i=0; i<math.length;i++) {
			if(i == 0)
				System.out.printf("Math ������ : ");
			System.out.printf("%d ", math[i]);
		}
		System.out.println("math�� �ּ� : " + math);
		
		for(int i=0;i<newMath.length;i++) {
			if(i==0)
				System.out.printf("newMath�� �ּ� : " + newMath);
		}
		newMath = math;
		System.out.println("���� ���� ���");
		
		for(int i=0;i<math.length;i++){
	         if(i == 0)
	            System.out.printf("Math ������ : ");
	         System.out.printf("%d ", math[i]);
	      }
	      System.out.println("math�� �ּ� : " + math);
	      
	      for(int i=0;i<newMath.length;i++){
	         if(i == 0)
	            System.out.printf("newMath ������ : ");
	         System.out.printf("%d ", newMath[i]);
	      }
	      System.out.println("newMath�� �ּ� : " + newMath);
			

	}

}
