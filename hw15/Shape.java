public abstract class Shape{

    private String color;
    private boolean filled;

    public Shape()
    {
	color = "black";
	filled = false;
    }
    
    public Shape(String input,boolean Bool)
    {
	color = input;
	filled = Bool;
    }

    public String getColor(){return color;}

    public void setColor(String input){color = input;}
    
    public boolean isFilled(){return filled;}

    public void setFilled(boolean Bool){filled = Bool;}

    public double getSemiPerimeter(){return getPerimeter()/2;}

    public String toString()
    {
	String uh;
	if (filled){uh = "filled";}else{uh = "not filled";}

	return "A Shape with color of " + color + " and is " + uh; 
    }

    public abstract double getArea();
    public abstract double getPerimeter();
						

}