package Week_10th;


// ÆÑÅä¸® ¸Þ¼­µå ÆÐÅÏ (Àû¿ë ÈÄ)

abstract class NItem { }

class NOrangeJuice extends NItem { /* »ý·« */ }
class NMelonJuice extends NItem { /* »ý·« */ } 
class NGreenTea extends NItem { /* »ý·« */ }

class ItemFactory {
    public NItem createItem(String type) {
    NItem returnItem = null;
    
        if(type.equals("¿À·»ÁöÁê½º"))
            returnItem = new NOrangeJuice();
        else if(type.equals("¸á·ÐÁê½º"))
            returnItem = new NMelonJuice();
        else if(type.equals("³ìÂ÷"))
            returnItem = new NGreenTea();

        return returnItem;
    }
}

class NVendingMachine {
    public NItem provideItem(String type) { 
        ItemFactory factory = new ItemFactory();
        NItem returnType = factory.createItem(type);

        return returnType;
    }
}

class NBuyer {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        NVendingMachine vm = new NVendingMachine();
        vm.provideItem("¿À·»ÁöÁê½º");
        vm.provideItem("³ìÂ÷");
    }
}

public class Ex_FactoryMethod_Apply {

}
