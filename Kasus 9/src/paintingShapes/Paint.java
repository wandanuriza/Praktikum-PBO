package paintingShapes;

public class Paint {
    private double coverage; //number of square feet per gallon
    
    //constructor for sets up the paint object with given c
    public Paint(double c) 
    { 
        this.coverage = c; 
    } 
    
    //return the amount of paint (number of gallons)
    //needed to paint the shape given as the parameter
    public double amount (Shape s){
        System.out.println("Computing amount for" + s); //
        //return 0;
        return s.area()/coverage;  //change the return value
    }
}