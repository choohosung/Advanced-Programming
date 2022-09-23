package Week_11th;
import java.util.*;

/*
class Point {
	int x; 
	int y; 
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
*/

class Point implements Comparable<Point> {
	 
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x > o.x) 
			return 1; // x가 매개변수 o의 x보다 크다면 1 리턴

		else if(this.x == o.x) 
			return 0; // x가 매개변수 o의 x과 같다면 0 리턴

		else 
			return -1; // x가 매개변수 o의 x보다 작다면 -1 리턴
      }
}

class Point2 implements Comparator<Point2> {
	 
	int x;
	int y;
	
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compare(Point2 o1, Point2 o2) {
		if(o1.x > o2.x)
			return 1;

		else if(o1.x == o2.x)
			return 0;	

		else
			return -1;
	}
}

public class Ex_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point a = new Point(5, 4);
		Point b = new Point(10, 2);
	
		int number = a.compareTo(b);
		
		if(number > 0) 
			System.out.println("a객체 > b객체");

		else if(number == 0) 
			System.out.println("a객체 == b객체");
	
		else 
			System.out.println("a객체 < b객체");
		
		Point2 a2 = new Point2(8, 10);
		Point2 b2 = new Point2(2, 3);
		
		number = a2.compare(a2, b2);
		
		if(number > 0) 
			System.out.println("a객체 > b객체");

		else if(number == 0) 
			System.out.println("a객체 == b객체");
	
		else 
			System.out.println("a객체 < b객체");
	}
}
