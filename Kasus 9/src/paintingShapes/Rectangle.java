package paintingShapes;

public class Rectangle extends Shape{
    private double width;
    private double length;
    
    //constructor for sets up the rectangle with given w and l
    public Rectangle(double w, double l){
        super("Rectangle");
        width = w;
        length = l;
    }

    @Override
    public double area() {
        return width*length; //Rectangle's surface area Formula
    }
    
    @Override
    public String toString(){
        return super.toString() + " of length " + length +" and width "+ width;
    }
}

