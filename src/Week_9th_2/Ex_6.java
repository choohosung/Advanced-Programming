package Week_9th_2;

interface FaxMachine {
	  void copy();
	  void fax(String from, String to);
	  void print();
}

class CopyMachine implements FaxMachine {
	  @Override
	  public void copy() {
	    System.out.println("### 복사 ###");
	  }

	  @Override
	  public void fax(String from, String to) {
	    // 사용하지 않는 인터페이스가 변경되어도 copy 의 변경과 동시에 수정이 일어난다.
	  }

	  @Override
	  public void print() {
	    // 사용하지 않는 인터페이스가 변경되어도 copy 의 변경과 동시에 수정이 일어난다.
	  }
}

public class Ex_6 {

}
