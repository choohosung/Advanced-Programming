package Week_3rd;

public class ex_7 {

	public static void main(String[] args) {
		// ��ø if��
		int math = 95;
		if(math>=90) {
			// A ���
			if(math>=97 ) {
				System.out.println("A+ ���");
			} else if(math>=94) {
				System.out.println("A0 ���");
			} else {
				System.out.println("A- ���");
			}
		} // ... B ��޵� ����
		
		// switch ��
		int cardKey = 1;
		boolean b201_chairman = false, b201 = false, bfront_gate = false;
		
		switch(cardKey) {
		case 3 : 
			// 201ȣ ����� ��� ����
			b201_chairman = true;
		case 2 : 
			// 201ȣ ��� ����
			b201 = true;
		case 1 : 
			// ���� ��� ����
			bfront_gate = true;
			break;
		default : 
			bfront_gate = false;
		}
		
		System.out.println("���� ���� ���� : " + bfront_gate);
		System.out.println("201ȣ ���� ���� : " + b201);
		System.out.println("201ȣ ����� ���� ���� : " + b201_chairman);

	}

}
