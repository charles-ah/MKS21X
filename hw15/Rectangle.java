public class Rectangle extends Shape
{
    double width,length;
    public Rectangle()
    {
	width = 1.0;
	length = 1.0;
    }

    public Rectangle(double L, double W)
    {
	width = W;
	length = L;
    }
    
    public double getWidth(){return width;}
    public double getLength(){return length;}

    public void setWidth(double W){width = W;}
    public void setLength(double L){length = L;}

    public double getArea(){return width*length;}
    public double getPerimeter(){return 2*width + 2*length;}

    public String toString(){return "A Rectangle with width=" + width + " and length=" + length +",which is a subclass of "+super.toString();}
}
