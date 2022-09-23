package Week_9th;

interface Operation { 
    void execute();
}

class Add implements Operation {
    private int left;  
    private int right; 
    private int result;

    // getter and setter ����

    public void execute() { result = left + right ; }

    Add(int left, int right) {
        this.left = left; 
        this.right = right; 
    }
    
    int getResult() {
    	return this.result;
    }
}


class Sub implements Operation {
    private int left;  
    private int right; 
    private int result;

    // getter and setter ����
  
    public void execute() { result = left - right ; }

    Sub(int left, int right) {
        this.left = left; 
        this.right = right; 
    }
    
    int getResult() {
    	return this.result;
    }
}

class Calculator {
    public void Calculate (Operation op) {
        if(op == null) 
            System.out.println("���� ���� �Ұ�");        
        else
            op.execute();
    }
}


public class Ex_4 { 
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		Add add = new Add(3, 5);
		Sub sub = new Sub(9, 2);
		cal.Calculate(add);
		cal.Calculate(sub);
		
		System.out.println("���� ������ : " + add.getResult());
		System.out.println("���� ������ : " + add.getResult());
		
	}
	
}
