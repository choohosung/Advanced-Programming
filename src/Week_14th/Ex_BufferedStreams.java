package Week_14th;
import java.io.*;
import java.util.*;

public class Ex_BufferedStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		     FileOutputStream fos = new FileOutputStream("C://Java//test.txt");
		     // BufferedOutputStream�� ���� ũ�⸦ 5�� �Ѵ�.
		     BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		     // ���� 123.txt�� 1���� 9���� ���
		     for(int i='1'; i <= '9'; i++) {
			     bos.write(i);
		     }


 		    //fos.close(); // ���ۿ� �����ִ� �����Ͱ� ��µ��� ���� ä�� ���α׷� ����.
 		    bos.close();   // flush()�� ȣ���ؼ� ���ۿ� ���� �ִ� ������ ����ϰ� ���α׷� ����.
		    
		} catch (IOException e) {
		     e.printStackTrace();		
		}
	}

}
