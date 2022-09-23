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
		System.out.println("æÓ»Ô");
	}
}

class Dog extends Animal implements Bark {
	Dog(String name){
		this.name = name;
	}
	public void bark() {
		System.out.println("∏€∏€");
	}
}

class Cat extends Animal implements Bark {
	Cat(String name){
		this.name = name;
	}
	public void bark() {
		System.out.println("æﬂøÀ");
	}
}

public class assignment_2 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger("»£∂˚¿Ã");
		tiger.bark();
		
		Dog dog = new Dog("πŸµœ¿Ã");
		dog.bark();
		
		Cat cat = new Cat("±Ó∏¡¿Ã");
		cat.bark();
	}

}
