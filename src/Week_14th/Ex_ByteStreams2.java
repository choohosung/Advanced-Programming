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
			while(input.available() > 0) { // �о�� �����Ͱ� 0 �̻��� ��
				input.read(temp);   // �����͸� �о�´�.
				output.write(temp); // �о�� �����͸� temp�� ����.
				//int len = input.read(temp); // �����͸� �о�� �� �ش� �������� ������ ��ȯ�Ѵ�.
				//output.write(temp, 0, len); // �о�� ������ŭ temp�� ����.
			}
		} catch(IOException e) {}

		outSrc = output.toByteArray();

		System.out.println("Input Source  :" + Arrays.toString(inSrc));
		System.out.println("temp          :" + Arrays.toString(temp));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}

}
