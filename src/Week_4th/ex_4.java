package Week_4th;

public class ex_4 {

	public static void main(String[] args) {
		// ���� ����
		
		  int[] math = { 1, 2, 3, 4, 5 } ;
	      int[] newMath = new int[5];
	      
	      System.out.println("math�� �ּ� : " + math);
	      System.out.println("newMath�� �ּ� : " + newMath);
	      
	      for(int i=0;i<math.length;i++)
	         newMath[i]=math[i];
	      
	      for(int i=0;i<newMath.length;i++){
	         if(i == 0)
	            System.out.printf("newMath ������ : ");
	         System.out.printf("%d ", newMath[i]);
	      }
	      System.out.println();
	      
	      int[] mathClone = math.clone();
	      System.out.println("mathClone�� �ּ� : " + mathClone);
	      
	      for(int i=0;i<mathClone.length;i++){
	         if(i == 0)
	            System.out.printf("mathClone ������ : ");
	         System.out.printf("%d ", mathClone[i]);
	      }
	      System.out.println();
	      
	      for(int i=0;i<newMath.length;i++) // newMath 0���� �� ����
	         newMath[i]=0;
	      
	      System.arraycopy(math, 2, newMath, 0, 2); // ���� �迭, ���� �ε���, ������ �迭, ���� �ε���, ����
	      
	      for(int i=0;i<newMath.length;i++){
	         if(i == 0)
	            System.out.printf("newMath ������ : ");
	         System.out.printf("%d ", newMath[i]);
	      }
	      System.out.println();
	}

}
