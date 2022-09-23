package Week_14th;

enum Season { Spring(1), Summer(2), Fall(3), Winter(4);
	
	private final int value;
	Season(int value) { this.value = value; }
	
	public int getValue() { return value; }
	
	}

public class sdfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Season[] mlArr = Season.values();
		for(int i=0;i<mlArr.length;i++) 
			System.out.printf("%s=%d%n", mlArr[i].name(), mlArr[i].getValue()); 
	}

}
