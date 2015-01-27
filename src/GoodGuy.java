
public class GoodGuy 
{
	
	private String name;
	private int strength;
	private int ammo;
	private boolean isAlive;
	
	public GoodGuy()
	{
		this("Unknown",0,0,false);
	}
	
	public GoodGuy(String name,int strength,int ammo,boolean isAlive)
	{
		setName(name);
		setStrength(strength);
		setAmmo(ammo);
		setAlive(isAlive);
	}

	public String getName()
	{
		return name;
	}
	
	public int getStrength()
	{
		return strength;
	}
	
	public int getAmmo()
	{
		return ammo;
	}
	
	public boolean getAlive()
	{
		return isAlive;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setStrength(int strength)
	{
		this.strength=strength;
	}
	
	public void setAmmo(int ammo)
	{
		this.ammo=ammo;
	}
	
	public void setAlive(boolean isAlive)
	{
		this.isAlive=isAlive;
	}
	
	public String toString()
	{
		String output=String.format("Name: %s \nStrength: %d \nAmmo: %d \nAlive: ",name,strength,ammo);
		output+=isAlive;
		return output;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
