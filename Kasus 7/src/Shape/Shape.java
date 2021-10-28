package Shape;

public abstract class Shape {
	// private instance variable, not accessible from outside this class
	private String color;
	private boolean filled;
	
	/** Constructs a Shape instance with default color and filled */
	public Shape() { // 1st (default) constructor
		filled = true;  
		color = "green"; 
	}
	
	/** Constructs a Shape instance with the given color and filled */  
	// 2nd constructor with given color and filled
	public Shape(String color, boolean filled) { // 2nd constructor
		this.color = color;
		this.filled = filled;
	}

	/** Getter and setter for all the instance variables */
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/** Return a self-descriptive string of this instance in the form of
	Shape[Color=?,filled=?] */
	public String toString() {
		String not = ""; 
		if(isFilled() == false) {
			not = "not";
			}
		return "A Shape with color of " + color + " and " + not + " filled ";
	}
}
		
