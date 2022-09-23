package Week_11th;
import java.util.*;

public class Ex_LinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(2);       // 일반적으로 주로 사용되는 데이터 추가 방식
		list.add(3);       
		list.addFirst(1);  // 최상단 노드에 데이터 추가
		list.addLast(4);   // 마지막 노드에 데이터 추가
		System.out.println("list:" + list);
		list.add(1, 10);   //index 1에 데이터 10 추가 add(index, value) index를 추가하면 해당 위치에 데이터
		System.out.println("list:" + list);
		
		list.removeFirst(); // 최상단 노드 데이터 삭제
		list.removeLast();  // 마지막 노드 데이터 삭제
		System.out.println("list:" + list);
		System.out.println("list 크기:" + list.size());
		
		System.out.println("list에 10의 값이 있는지 검색 : " + list.contains(10));
		System.out.println("list에 2의 값 위치 검색: " + list.indexOf(2)); 
		System.out.println("list에 5의 값 위치 검색: " + list.indexOf(5)); // 해당 값이 없으면 -1 반환
	}
}
