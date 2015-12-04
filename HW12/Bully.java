public class Bully extends Actor{


    private int Reputation;

    public Bully(String name,int str,int agi.int intel,int health)
    {
	super(name,str,agi,intel,health);
	Reputation = 10;
    }
    
    public Bully(String name)
    {
	this(name,20,5,5,15);
    }

    public Bully()
    {
	this("Biggus Dickus",20,5,5,15);
    }

    public String attack()
    {
	return name+" taunts the target.";
    }

    public String specialAttack()
    {
	return name+" mocks the target on social media!";
    }

    public int getResource()
    {
	return Reputation;
    }

    public String getResourceName()
    {
	return "Reputation";
    }

}