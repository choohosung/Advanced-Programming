package Week_11th;

import java.util.*;
public class Ex_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet setA    = new HashSet();
		HashSet setB    = new HashSet();
		HashSet setUnion = new HashSet();
		HashSet setIntersection = new HashSet();
		HashSet setDifference = new HashSet();
		HashSet setSubset = new HashSet();
		
		setA.add("1"); setA.add("2");
		setA.add("3"); setA.add("4");
		setA.add("5");
		System.out.println("A = "+setA);

		setB.add("4");setB.add("5");
		setB.add("6");setB.add("7");
		setB.add("8");
		System.out.println("B = "+setB);

		boolean addResult = setA.add("1");
		System.out.println("중복 값 추가 결과 = " + addResult);
		System.out.println("A = "+setA);

		setUnion.addAll(setA);
		setIntersection.addAll(setA);
		setDifference.addAll(setA);
		setSubset.addAll(setA);

		setUnion.addAll(setB);
		setIntersection.retainAll(setB);
		setDifference.removeAll(setB);

		System.out.println("A ∪ B = " + setUnion);
		System.out.println("A ∩ B = " + setIntersection);
		System.out.println("A - B = " + setDifference);
		System.out.println("A ⊂ B = " + setSubset.containsAll(setB));

	}
}
