public class Wizard extend Actor
{
    private int mana;
    
    public Wizard()
    {
	this("Siegfried");
    }

    public Wizard(String name)
    {
	this(name,10,10,25,20);
    }

    public Wizard(String name,int str,int agi,int intel,int health)
    {
	super(name,str,agi,intel,health);
	
	mana = 20;
    }

    public int getMana()
    {
	return mana;
    }
    public String attack()
    {
	return super.getName() + " transformed the target into bytes! ";
    }

    public String specialAttack()
    {
	return super.getName() + " vanished the target! ";
    }

}