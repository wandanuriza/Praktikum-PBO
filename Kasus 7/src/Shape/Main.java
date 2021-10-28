package Shape;

public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		System.out.println("Circle\n"
			+ "-radius		= " + c.getRadius() + "\n"
			+ "-color		= " + c.getColor() + "\n"
			+ "-base area	= " + c.getArea() + "\n"
			+ "-perimeter	= " + c.getPerimeter() + "\n");

		Rectangle r = new Rectangle(10.0,8.0);
		System.out.println("Rectangle\n"
			+ "-width=" + r.getWidth() + "\n"
			+ "-length=" + r.getLength() + "\n"
			+ "-base area=" + r.getArea() + "\n"
			+ "-perimeter=" + r.getPerimeter() + "\n");

		Square s = new Square(10.0);
		System.out.println("Square\n"
			+ "-side=" + s.getSide() + "\n"
			+ "-base area=" + s.getArea() + "\n"
			+ "-perimeter=" + s.getPerimeter() + "\n");
		
		System.out.println(c.toString());
	    System.out.println(r.toString());
	    System.out.println(s.toString());

	}

}
