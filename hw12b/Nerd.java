public class Nerd extends Actor{

    private int grades;

    public Nerd(String name,int str,int agi,int intel,int health)
    {
	super(name,str,agi,intel,health);
	grades = 100;
    }

    public Nerd(String name)
    {
	this(name,5,15,20,15);
    }

    public Nerd()
    {
	this("Peter Stuyvesant",5,15,20,15);
    }

    public String attack()
    {
	return getName()+" shoots a pencil at the target!";
    }

    public String specialAttack()
    {
	return getName()+" causes a shower of textbooks to rain on the target!";
    }

    public int getResources()
    {
	return grades;
    }

    public String geResourceName()
    {
	return "grades";
    }


}