package Week_14th;
import java.io.*;
import java.util.*;

public class Ex_BufferedStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		     FileOutputStream fos = new FileOutputStream("C://Java//test.txt");
		     // BufferedOutputStream의 버퍼 크기를 5로 한다.
		     BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		     // 파일 123.txt에 1부터 9까지 출력
		     for(int i='1'; i <= '9'; i++) {
			     bos.write(i);
		     }


 		    //fos.close(); // 버퍼에 남아있는 데이터가 출력되지 못한 채로 프로그램 종료.
 		    bos.close();   // flush()를 호출해서 버퍼에 남아 있는 내용을 기록하고 프로그램 종료.
		    
		} catch (IOException e) {
		     e.printStackTrace();		
		}
	}

}
