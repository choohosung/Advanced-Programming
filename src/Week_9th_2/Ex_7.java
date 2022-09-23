package Week_9th_2;

interface Print{
	  void print();
}

interface Copy {
	  void copy();
}

interface Fax {
	  void fax(String from, String to);
}

class PrintMachine implements Print {
	  @Override
	  public void print() {
		  System.out.println("¿Œº‚«’¥œ¥Ÿ.");
	  }
}

public class Ex_7 {

}
