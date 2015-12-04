public class Coordinate
{

    private double x,y;

    public Coordinate()
    {
	x = 0;
	y = 0;
    }

    public Coordinate(double xCoord,double yCoord)
    {
	x = xCoord;
	y = yCoord;
    }

    public double getX()
    {
	return x;
    }

    public double getY()
    {
        return y;
    }

    public String toString()
    {
	String string = "(" + x + "," + y + ")";
	return string;
    }

    public double distToOrigin()
    {
	double dist = Math.sqrt(x*x + y*y);
	return dist;
    }

    public void  setX(double xCoord)
    {
	x = xCoord;
    }

    public void setY(double yCoord)
    {
	y = yCoord;
    }

    public double dist(Coordinate AnotherCoordinate)
    {
	double dist = Math.sqrt(Math.pow(x-AnotherCoordinate.getX(), 2) + Math.pow(y-AnotherCoordinate.getY(), 2));
	return dist;
    }
}
