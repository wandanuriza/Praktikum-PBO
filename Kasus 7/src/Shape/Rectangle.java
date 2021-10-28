package Shape;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	/** Constructs a Rectangle instance with default width and length */
	public Rectangle() { // 1st (default) constructor
		width  = 1.0; 
		length = 1.0;
	}
	
	/** Constructs a Rectangle instance with the given width and given length */
	public Rectangle(double width, double length) { // 2nd constructor
		this.width  = width;
		this.length = length;
 	}
	
	/** Constructs a Rectangle instance with the given width and given length, given color and given filled */
	public Rectangle(double width, double length, String color, boolean filled) { // 3rd constructor
		super(color,filled);
		this.width  = width;
		this.length = length;
	}
	
	/** Getter and setter for all the instance variables. */
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	// return luas segitiga
	public double getArea() {
		return length*width;
	}

	//return keliling segitiga
	public double getPerimeter() {
		return (2*length)+(2*width);
	}
	
	@Override 
	public String toString() {
		return "A Rectangle with width " + width +  " and length " + length + " which is a subclass of " + super.toString() + " where " + super.toString() + " is the output of the toString() method from the superclass. "; 
	}

}
