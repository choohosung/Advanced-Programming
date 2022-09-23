package Week_10th;


// ÆÑÅä¸® ¸Ş¼­µå ÆĞÅÏ (Àû¿ë Àü)

abstract class Item { }

class OrangeJuice extends Item {
        OrangeJuice(){
        System.out.println("¿À·»ÁöÁê½º »ı¼º");
    }
}
class MelonJuice extends Item {
        MelonJuice(){
        System.out.println("¸á·ĞÁê½º »ı¼º");
    }
}
class GreenTea extends Item {
        GreenTea(){
        System.out.println("³ìÂ÷ »ı¼º");
    }
}

class VendingMachine {
    Item provideItem(String type){
        Item returnItem = null;
        
        if(type.equals("¿À·»ÁöÁê½º"))
            returnItem = new OrangeJuice();
        else if(type.equals("¸á·ĞÁê½º"))
            returnItem = new OrangeJuice();
        else if(type.equals("³ìÂ÷"))
            returnItem = new GreenTea();
        
        return returnItem;
    }
}

class Buyer {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        VendingMachine vm = new VendingMachine();
        vm.provideItem("¿À·»ÁöÁê½º");
        vm.provideItem("³ìÂ÷");
    }
}

public class Ex_FactoryMethod_Prev {

}
