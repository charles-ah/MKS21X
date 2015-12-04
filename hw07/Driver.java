public class Driver
{
    public static void main(String[] arg)

    {/*
	Triangle first = new Triangle(1.0,0.0,0.0,0.0,0.5,0.0);
	System.out.println(first.toString());
	System.out.println("Right triangle: " + first.isRight());
     */
	Triangle second = new Triangle(1.0,0.0,0.0,0.0,0.0,1.0);
	System.out.println(second.toString());
	System.out.println("Right Triangle: " + second.isRight());
				      
	Triangle third = new Triangle(1.0,1.0,0.0,0.0,0.0,3.0);
	System.out.println("Right Triangle: " + third.isRight());
	
    }

}
