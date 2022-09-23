package Week_12th;

interface MenuInterface {
	static int AMARICANO = 1;
	static int LATTE = 2;
	static int GREEN_TEA = 3;
	static int YUJU_TEA = 4;
}

enum MenuList { AMARICANO, LATTE, GREEN_TEA, YUJU_TEA }

public class Ex_Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MenuList m1 = MenuList.AMARICANO;
			MenuList m2 = MenuList.valueOf("LATTE");
			MenuList m3 = Enum.valueOf(MenuList.class, "AMARICANO");
			MenuList m4 = MenuList.GREEN_TEA;
			
			System.out.println("m1="+m1);
			System.out.println("m2="+m2);
			System.out.println("m3="+m3);

			System.out.println("m1==m2 ? "+ (m1==m2));
			System.out.println("m1==m3 ? "+ (m1==m3));
			System.out.println("m1.equals(m3) ? "+ m1.equals(m3));
//			System.out.println("m2 > m3 ? "+ (m1 > m3)); // ¿¡·¯
			System.out.println("m2.compareTo(m3) ? "+ (m2.compareTo(m1)));
			System.out.println("m2.compareTo(m4) ? "+ (m2.compareTo(m4)));
			System.out.println("m2.compareTo(m2) ? "+ (m2.compareTo(m2)));
			
			MenuList[] mlArr = MenuList.values();
			for(int i=0;i<mlArr.length;i++) 
				System.out.printf("%s=%d%n", mlArr[i].name(), mlArr[i].ordinal()); 
	}

}
