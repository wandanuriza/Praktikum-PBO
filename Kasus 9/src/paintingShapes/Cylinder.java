package paintingShapes;

public class Cylinder extends Shape{
    private double height;
    private double radius;
    
  //constructor for sets up the cylinder with given r and h
    public Cylinder(double r, double h){
        super("Cylinder");
        height = h;
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius*height; //Cylinder's surface area Formula
    }
    
    @Override
    public String toString(){
        return super.toString() + " of radius " + radius +" and height "+ height;
    }
}

