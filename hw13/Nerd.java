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

    public String attack(Actor other)
    {
	other.takeDamage(7);
	return getName()+" wins a debate against "+other.getName();
    }

    public String specialAttack(Actor other)
    {
	grades -= 10;
	other.takeDamage(10);
	return getName()+" causes a shower of textbooks to rain on "+other.getName();
    }

    public int getResource()
    {
	return grades;
    }

    public String getResourceName()
    {
	return "grades";
    }


}