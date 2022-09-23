package Week_12th;

class Parent {
	void parentMethod() { }
}

class Child extends Parent {
	@Override
	//void parentmethod() { } // ����. ���� �޼����� �̸��� �߸�����.
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
	abstract void run(); // �߻� �޼���
	// abstract void run2(); // ����. �޼��尡 2���� ���.
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
