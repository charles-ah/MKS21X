public class Teacher extends Actor{

    private int Awesomeness;

    public Teacher(String name,int str,int agi,int intel,int health)
    {
	super(name,str,agi,intel,health);
	Awesomeness = 50;
    }

    public Teacher(String name)
    {
	this(name,10,15,30,35);
    }

    public Teacher()
    {
	this("Sensei",10,15,30,35);
    }

    public String attack()
    {
	return name+" suspended the target.";
    }

    public String specialAttack()
    {
	return name+" expelled the target";
    }

    public int getResource()
    {
	return Awesomeness;
    }

    public String getResourceName()
    {
	return "Awesomeness";
    }



}
