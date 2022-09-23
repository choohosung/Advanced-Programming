package Week_11th;
import java.util.*;

public class Ex_LinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(2);       // �Ϲ������� �ַ� ���Ǵ� ������ �߰� ���
		list.add(3);       
		list.addFirst(1);  // �ֻ�� ��忡 ������ �߰�
		list.addLast(4);   // ������ ��忡 ������ �߰�
		System.out.println("list:" + list);
		list.add(1, 10);   //index 1�� ������ 10 �߰� add(index, value) index�� �߰��ϸ� �ش� ��ġ�� ������
		System.out.println("list:" + list);
		
		list.removeFirst(); // �ֻ�� ��� ������ ����
		list.removeLast();  // ������ ��� ������ ����
		System.out.println("list:" + list);
		System.out.println("list ũ��:" + list.size());
		
		System.out.println("list�� 10�� ���� �ִ��� �˻� : " + list.contains(10));
		System.out.println("list�� 2�� �� ��ġ �˻�: " + list.indexOf(2)); 
		System.out.println("list�� 5�� �� ��ġ �˻�: " + list.indexOf(5)); // �ش� ���� ������ -1 ��ȯ
	}
}
