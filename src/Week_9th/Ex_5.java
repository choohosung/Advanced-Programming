package Week_9th;

abstract class NCoffeeShop {
    int money; 
    int coffeeStock;
    String printStock() {
        return "커피 재고 : " + coffeeStock;
    }
    
    NCoffeeShop(int money, int coffeeStock)
    {
        this.money = money;
        this.coffeeStock = coffeeStock;
    }
}

class AngelCoffee extends NCoffeeShop {
    int teaStock;

    String printStock() {
        return super.printStock() + " 홍차 재고 : " + teaStock;
    }

    String brewing(int money) {
        this.money += money; 
    if(money == 4500)    
        return "천사다방 아메리카노를 구입했습니다"; 
    else if(money == 5000) 
        return "천사다방 라떼를 구입했습니다";
    else if(money == 5700) 
        return "천사다방 홍차를 구입했습니다"; 
    else {
        this.money -= money;
        return "메뉴를 다시 골라주십시오.";
        }
    }

    AngelCoffee(int money, int coffeeStock, int teaStock)
    {
        super(money, coffeeStock);
        this.teaStock = teaStock;
    }
}

class HellCoffee extends NCoffeeShop {
    int teaStock;
    int powder;

    String printStock(int powder) {
    	this.powder += powder;
        return super.printStock() + " 사망차 재고 : " + teaStock + " 파우더 입고 : " + powder;
    }
    
    //int printStock() {
    	//return this.coffeeStock + this.teaStock;
    //}

    String brewing(int money) {
        this.money += money; 
    if(money == 4500)    
        return "지옥다방 아메리카노를 구입했습니다"; 
    else if(money == 5000) 
        return "지옥다방 라떼를 구입했습니다";
    else if(money == 5700) 
        return "지옥다방 홍차를 구입했습니다"; 
    else {
        this.money -= money;
        return "메뉴를 다시 골라주십시오.";
        }
    }
    
    String brewing(int money, int tip) {
        this.money += money; 
    if(money == 4500)    
        return "지옥다방 아메리카노를 구입했습니다" + tip + "고마워"; 
    else if(money == 5000) 
        return "지옥다방 라떼를 구입했습니다" + tip + "고마워";
    else if(money == 5700) 
        return "지옥다방 홍차를 구입했습니다" + tip + "고마워"; 
    else {
        this.money -= money;
        return "메뉴를 다시 골라주십시오." + tip + "고마워";
        }
    }

    HellCoffee(int money, int coffeeStock, int teaStock, int powder)
    {
        super(money, coffeeStock);
        this.teaStock = teaStock;
        this.powder = powder;
    }
}
 
public class Ex_5 { }
