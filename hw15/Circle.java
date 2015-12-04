public class Circle extends Shape
{
    private double radius;

    public Circle(){radius = 1.0;}
    public Circle(double rad){radius = rad;}

    public double getRadius(){return radius;}

    public void setRadius(double rad){radius = rad;}

    public double getArea(){return Math.PI*radius*radius;}
    public double getPerimeter(){return 2*Math.PI*radius;}

    public String toString()
    {
	return "A Circle of radius=" + radius + " which is a subclass of " + super.toString();
    }

}
