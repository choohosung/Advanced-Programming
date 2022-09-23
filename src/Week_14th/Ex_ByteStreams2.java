package Week_14th;
import java.io.*;
import java.util.*;

public class Ex_ByteStreams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;

		byte[] temp = new byte[4];

		ByteArrayInputStream  input  = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		try {
			while(input.available() > 0) { // 읽어올 데이터가 0 이상일 때
				input.read(temp);   // 데이터를 읽어온다.
				output.write(temp); // 읽어온 데이터를 temp에 쓴다.
				//int len = input.read(temp); // 데이터를 읽어온 후 해당 데이터의 개수를 반환한다.
				//output.write(temp, 0, len); // 읽어온 개수만큼 temp에 쓴다.
			}
		} catch(IOException e) {}

		outSrc = output.toByteArray();

		System.out.println("Input Source  :" + Arrays.toString(inSrc));
		System.out.println("temp          :" + Arrays.toString(temp));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}

}
