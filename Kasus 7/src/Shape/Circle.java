package Shape;

public class Circle extends Shape {
	private double radius;
	
	/** Constructs a Circle instance with default radius */
	public Circle() { // 1st (default) constructor
		radius = 1.0;
	}
	
	/** Constructs a Circle instance with the given radius */
	public Circle(double radius) { // 2nd constructor
		super();
		this.radius = radius;
	}
	
	/** Constructs a Circle instance with the given radius, given color, and given filled */
	public Circle(double radius, String color, boolean filled) { // 3rd constructor
		super(color,filled);
		this.radius = radius;
	}

	/** Getter and setter for the instance variable radius */
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// return luas lingkaran
	public double getArea()
	{
	return radius*radius*Math.PI;
	}

	//return keliling lingkaran
	public double getPerimeter()
	{
	return 2*radius*Math.PI;
	}
	
	@Override 
	public String toString() {
		return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
	}
}

