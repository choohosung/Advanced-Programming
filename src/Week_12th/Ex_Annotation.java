package Week_12th;

class Parent {
	void parentMethod() { }
}

class Child extends Parent {
	@Override
	//void parentmethod() { } // 오류. 조상 메서드의 이름을 잘못적음.
	void parentMethod() { } 
}

class NewClass{
	int newField;

	int getNewField() { 
		return newField;
	}	

	@Deprecated
	int oldField;

	@Deprecated
	int getOldField() { 
		return oldField;
	}
}

@FunctionalInterface
interface Runnable {
	abstract void run(); // 추상 메서드
	// abstract void run2(); // 에러. 메서드가 2개인 경우.
}

public class Ex_Annotation {
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass nc = new NewClass();
		
		nc.oldField = 10;
		System.out.println(nc.getOldField());
	}
}
