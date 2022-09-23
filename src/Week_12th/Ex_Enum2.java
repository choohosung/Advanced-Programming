package Week_12th;

enum MenuList2 { AMARICANO(3500), LATTE(4000), GREEN_TEA(4000), YUJU_TEA(4500);
	
	private final int value;
	MenuList2(int value) { this.value = value; }
	
	public int getValue() { return value; }
	
	}

public class Ex_Enum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuList2[] mlArr = MenuList2.values();
		for(int i=0;i<mlArr.length;i++) 
			System.out.printf("%s=%d%n", mlArr[i].name(), mlArr[i].getValue()); 
	}

}
