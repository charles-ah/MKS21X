public class Driver
{
    public static void main(String[] arg)
    {
	Student student1;
	student1 = new Student("Bob","Adams",8090,3);
	System.out.print("Name: ");
	student1.printStudent();
	//	System.out.println();
	System.out.println("Age :" + student1.age);
	System.out.println("ID: " + student1.osis); 
    }



}