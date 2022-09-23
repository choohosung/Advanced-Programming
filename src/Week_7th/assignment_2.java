package Week_7th;

interface Bark{
	void bark();
}

class Animal{
	String name;
}

class Tiger extends Animal implements Bark {
	Tiger(String name){
		this.name = name;
	}
	public void bark() {
		System.out.println("����");
	}
}

class Dog extends Animal implements Bark {
	Dog(String name){
		this.name = name;
	}
	public void bark() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal implements Bark {
	Cat(String name){
		this.name = name;
	}
	public void bark() {
		System.out.println("�߿�");
	}
}

public class assignment_2 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger("ȣ����");
		tiger.bark();
		
		Dog dog = new Dog("�ٵ���");
		dog.bark();
		
		Cat cat = new Cat("�����");
		cat.bark();
	}

}
