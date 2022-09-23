package Week_7th;

interface Area{
	void getArea();
}

class Point{
	int x;
	int y;
}

class Circle implements Area{
	int radius;
	double area;
	Point p = new Point();
	Circle(int radius, int x, int y){
		this.radius = radius;
		p.x = x;
		p.y = y;
	}
	public void getPoint() {
		System.out.println("원의 좌표는 ("+ p.x + "," + p.y + ") 입니다.");
	}
	public void getArea() {
		area = radius * radius * 3.14;
		System.out.println("원의 넓이는 "+ area + " 입니다.");
	}
}

public class assignment_1 {

	public static void main(String[] args) {
		Circle c = new Circle(3, 2, 1);
		c.getPoint();
		c.getArea();
	}

}
