package paintingShapes;

public abstract class Shape {
	protected String shapeName;
    public abstract double area();
  
    public Shape(String shapeName){ //constructor for sets up shapeName
        this.shapeName=shapeName;
    }
    
    @Override
    public String toString(){
        return "\nShape name: "+shapeName;
    }
}


