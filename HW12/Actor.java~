
public class Actor{
    private String name;
    private int strength,agility,intelligence;
    private int health;

    //actor constructor to initialize all instance variables
    public Actor(String name, int str, int agi, int intel, int health){
        this.name = name;
        agility = agi;
        strength = str;
        intelligence = intel;
        this.health = health;
    }

    //specific named actor
    public Actor(String name){
        this(name,10,10,10,20);
    }

    //generic named actor
    public Actor(){
        this("Joe Dirt",10,10,10,20);
    }

    //You must write these methods:
    public String getName()
    {
	return name;
    }

    public int getInt()
    {
	return intelligence;
    }

    public int getStr()
    {
	return strength;
    }

    public int getAgi()
    {
	return agility;
    }

    public int getHealth()
    {
	return health;
    }

    public int takeDamage(int damage)
    {
	health -= damage;
	return health
    }

    public String attack()
    {
	return "attacked the target!";
    }

    public String specialAttack()
    {
	return "used a special attack on the target!";
    }
}