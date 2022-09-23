package Week_7th;

// 절차지향적 분석
// 고객이 메뉴를 정하고 돈을 준비해서 캐셔에게 전달한다.
// 캐셔는 돈을 확인하고 음료를 만들어달고 하고 주문한다.
// 제작된 음료를 캐셔가 제공한다.

public class Ex_1 {

	static int AMARICANO = 1, AMARICANO_COST = 4000;
	static int LATTE = 2, LATTE_COST = 4500;
	static int GREEN_TEA = 3, GREENTEA_COST = 4500;
	static int YUJU_TEA = 4, YUJUTEA_COST = 5000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int buyer_money = 5000;
		int shop_money = 0;
		String buyer_inventory = "";
		int want_item = LATTE; // 아메리카노를 구매하고 싶음
		
		String make_item = "";
		 
		if(Order_possiable(buyer_money, want_item)) {
			if(want_item == AMARICANO) {
				System.out.println("아메리카노를 구입합니다.");
				buyer_money -= AMARICANO_COST;
				System.out.println(AMARICANO_COST + "를 지불했습니다.");
				shop_money += AMARICANO_COST;
			}
			else if(want_item == LATTE) {
				System.out.println("라떼를 구입합니다.");
				buyer_money -= LATTE_COST;
				System.out.println(LATTE_COST + "를 지불했습니다.");
				shop_money += LATTE_COST;
			}
			else if(want_item == GREEN_TEA)	{
				System.out.println("녹차를 구입합니다.");
				buyer_money -= GREENTEA_COST;
				System.out.println(GREENTEA_COST + "를 지불했습니다.");
				shop_money += GREENTEA_COST;
			}
			else if(want_item == YUJU_TEA) {
				System.out.println("유자차를 구입합니다.");
				buyer_money -= YUJUTEA_COST;
				System.out.println(YUJUTEA_COST + "를 지불했습니다.");
				shop_money += YUJUTEA_COST;
			}
			
			make_item = Make_Drink(want_item); // 음료 제작
			System.out.println("바리스타가 음료를 제작하였습니다.");
			buyer_inventory += make_item;      // 물품 전달
			System.out.println(buyer_inventory + "를 종업원으로부터 전달받았습니다.");
			
		}
		else {
			System.out.println("없는 제품이거나 소지액이 부족합니다.");
		}
		
		System.out.println("오늘 매출은 " + shop_money + "원 입니다.");
	}
	
	static String Make_Drink(int item) {
		if(item == AMARICANO)
			return "아메리카노";
		else if(item == LATTE)
			return "라떼";
		else if(item == GREEN_TEA)
			return "녹차";
		else
			return "유자차";
	}
	
	static boolean Order_possiable(int buyer_money, int want_item) {
		if(want_item == AMARICANO && buyer_money >= AMARICANO_COST)	{
			return true;
		}
		else if(want_item == LATTE && buyer_money >= LATTE_COST) {
			return true;
		}
		else if(want_item == GREEN_TEA && buyer_money >= GREENTEA_COST) {
			return true;
		}
		else if(want_item == YUJU_TEA && buyer_money >= YUJUTEA_COST) {
			return true;
		}
		else
			return false;
	}

}
