public class Student
{

    String firstName,lastName;
    int osis;
    int age;
    double gpa;
   
    public Student(String first, String last, int ID, int years)
    {
	firstName = first;
	lastName = last;
	age = 14 + years - 1;
	osis = ID;
    }
    
    public void printStudent()
    {
	System.out.println(firstName + " " + lastName);
    }

    public void lowerGPA(double n)
    {
	gpa = gpa - n;
    }

    public void raiseGPA(double n)
    {
	gpa = gpa + n;
    }

}