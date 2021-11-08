package Cylinder;

import Shape.Shape;

/**
* The Circle class models a circle with a radius and color.
*/
public class Circle { 
	// private instance variable, not accessible from outside this class
	private double radius; //jari-jari
	private String color; //warna

	// Constructors (overloaded) 
	/** Constructs a Circle instance with default value for radius and color  */  
	public Circle() { // 1st (default) constructor
		radius = 1.0;
		color = "red";
	}

	/** Constructs a Circle instance with the given radius and default color */  
	public Circle(double r) { // 2nd constructor
		radius = r;
		color = "red";
	}
	
	/** Menambahkan Constructs a Circle instance with the given radius and given color */ 
	public Circle(double r, String c) { // 3rd constructor
		radius = r;
		color = c;
	}

	/** Returns the radius */
	public double getRadius() {
		return radius;	
	}
	
	/** Menambahkan Getter untuk color */
	public String getColor() {
		return color;
	}

	/** Returns the area of this Circle instance */
	public double getArea() {
		return radius*radius*Math.PI;  
		//rumus luas lingkaran phi x r kuadrat 
		//Math.PI adalah static final double constant di Java
	}
	
    /** Menambahkan Setter untuk radius */
    public void setRadius(double r){
        radius = r;
    }
	
	/** Menambahkan Setter untuk color */
    public void setColor(String c){
        color = c;
    }

	/** Return a self-descriptive string of this instance in the form of
	Circle[radius=?,color=?] */
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}
