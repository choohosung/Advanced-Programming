package Week_12th;

import java.util.ArrayList;

interface Drinkable { } 

class Menu<T>{
//class Menu<T extends Drinkable>{ // �������̽��� implements�� �ƴ� extends �� �����
//class Menu<T extends Coffee> { // ���ϵ� ī���� ���� ����. T�� �� �ڽĵ鸸 ����
	//static T staticitem; // static ����� Ÿ�� ���� ��� �Ұ�
	ArrayList<T> list = new ArrayList<T>();
	// T[] itemArr; Ÿ�� ������ �迭 ���� ����
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
//		Box<Grape> grapeBox = new Box<Apple>(); // ����. Ÿ�� ����ġ

		coffeeMenu.add(new Coffee());
		coffeeMenu.add(new Amaricano()); // �Ƹ޸�ī�밡 Ŀ���� �ڽ��̹Ƿ� ��� ����

		amaricanoMenu.add(new Amaricano());
		amaricanoMenu.add(new Amaricano());
//		amaricanoMenu.add(new Tea()); // ����. Menu<Amaricano>���� Amaricano�� ���� �� ����

		teaMenu.add(new Tea());
//		teaMenu.add(new Amaricano()); // ����. Box<Toy>���� Apple�� ���� �� ����

		System.out.println(coffeeMenu);
		System.out.println(amaricanoMenu);
		System.out.println(teaMenu);
		
		ItemizeMenu<Coffee> itemizeCoffee   = new ItemizeMenu<Coffee>();
		itemizeCoffee.add(new Amaricano());
		itemizeCoffee.add(new Latte());
		System.out.println(Server.serveMenu(itemizeCoffee)); // ���Ե� Ÿ�� ���� ����
		//System.out.println(Server.<Coffee>serveMenu(itemizeCoffee));
	}

}
