package Shape;

public class Square extends Rectangle {
	public Square() {
		super();
		double side = 1.0;
	}
	
	public Square(double side) {
		super(side,side); //call superclass Rectangle(double,double)
	}
	
	public Square(double side, String color, boolean filled) {
		super(side,side,color,filled);
	}
	
	public double getSide() {
		return super.getWidth();
	}

	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}

	// return luas persegi
	public double getArea() {
		return getSide()*getSide();
	}

	// return keliling persegi
	public double getPerimeter() {
		return 4*getSide();    
	}

	public String toString() {
		return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
	} 
	
}
