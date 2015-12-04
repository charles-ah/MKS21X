public class Driver
{

    public static void main(String[]args)
    {
	Circle C = new Circle(2);
	Rectangle R = new Rectangle(1,2);
	Square S = new Square(2);

	System.out.println("Circle Area = "+C.getArea() + "\tCircle Perimeter = " + C.getPerimeter());
	System.out.println(C.toString());
	
	System.out.println("Rectangle Area = "+R.getArea() + "\tRectangle  Perimeter = " + R.getPerimeter());
        System.out.println(R.toString());
	
	S.setColor("blue");
	S.setFilled(true);
	System.out.println("Suqare Area = "+S.getArea() + "\tSquare Perimeter = " + S.getPerimeter());
        System.out.println(S.toString());
    }
}