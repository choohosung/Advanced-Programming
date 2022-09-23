package Week_12th;

import java.util.ArrayList;

interface Drinkable { } 

class Menu<T>{
//class Menu<T extends Drinkable>{ // 인터페이스도 implements가 아닌 extends 를 사용함
//class Menu<T extends Coffee> { // 와일드 카드의 상한 제한. T와 그 자식들만 가능
	//static T staticitem; // static 멤버는 타입 변수 사용 불가
	ArrayList<T> list = new ArrayList<T>();
	// T[] itemArr; 타입 변수로 배열 선언 가능
	void add(T item)  { list.add(item); }
	T get(int i)      { return list.get(i); }
	int size() { return list.size(); }
	ArrayList<T> getList() { return list;  }
	public String toString() { return list.toString();}
}

class ItemizeMenu<T extends Coffee> extends Menu<T> {}

class Coffee		           { public String toString() { return "Coffee";}}
class Amaricano extends Coffee { public String toString() { return "Amaricano";}}
class Latte extends Coffee     { public String toString() { return "Latte";}}
class Tea		               { public String toString() { return "Tea"  ;}}

class Product {
	String name;

	Product(String name)	     { this.name = name + "Product"; }
	public String toString() { return name;		 }
}

class Server {
	static Product serveMenu(ItemizeMenu<? extends Coffee> menu) {
		String tmp = "";
		
		for(Coffee c : menu.getList()) 
			tmp += c + " ";
		return new Product(tmp);
	}
}

public class Ex_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu<Coffee> coffeeMenu = new Menu<Coffee>();
		Menu<Amaricano> amaricanoMenu= new Menu<Amaricano>();
		Menu<Tea>   teaMenu   = new Menu<Tea>();
//		Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 불일치

		coffeeMenu.add(new Coffee());
		coffeeMenu.add(new Amaricano()); // 아메리카노가 커피의 자식이므로 사용 가능

		amaricanoMenu.add(new Amaricano());
		amaricanoMenu.add(new Amaricano());
//		amaricanoMenu.add(new Tea()); // 에러. Menu<Amaricano>에는 Amaricano만 담을 수 있음

		teaMenu.add(new Tea());
//		teaMenu.add(new Amaricano()); // 에러. Box<Toy>에는 Apple을 담을 수 없음

		System.out.println(coffeeMenu);
		System.out.println(amaricanoMenu);
		System.out.println(teaMenu);
		
		ItemizeMenu<Coffee> itemizeCoffee   = new ItemizeMenu<Coffee>();
		itemizeCoffee.add(new Amaricano());
		itemizeCoffee.add(new Latte());
		System.out.println(Server.serveMenu(itemizeCoffee)); // 대입된 타입 생략 가능
		//System.out.println(Server.<Coffee>serveMenu(itemizeCoffee));
	}

}
