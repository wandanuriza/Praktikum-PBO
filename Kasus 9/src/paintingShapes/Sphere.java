package paintingShapes;

public class Sphere extends Shape {
    private double radius; //radius in feet
    
    //constructor for sets up the sphere with given r
    public Sphere(double r) 
    { 
        super("Sphere");  //call parent constructor
        radius = r; 
    } 
    
    //return surface area of the sphere
    public double area() 
    { 
        return 4*Math.PI*radius*radius; 
    } 
    
    //return the sphere as a String --> di Override dari class parent
    public String toString() 
    { 
        return super.toString() + " of radius " + radius; 
    } 
}