import java.util.Random;

public class Character {
	private Random rand = new Random();
	private int health;
	private int strength;
	private String name;
	private Weapon weapon;
	
	public Character() {
		this.health = 0;
		this.strength = 0;
		this.name = "";
		this.weapon = new Weapon("", 0);
	}
	
	public Character(int health, int strength, String name, String wName,int damage) {
		this.health = health;
		this.strength = strength;
		this.name = name;
		this.weapon = new Weapon(wName, damage);
	}
	
	public int doDamage()
	{
		int chances = rand.nextInt(100);
		if(chances < 40)
		{
			int damage = rand.nextInt(this.strength) + rand.nextInt(this.weapon.damage);
			return damage;
		}				
		return 0;
	}
	
	public void recieveDamage(int damage)
	{
		this.health -= damage;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Character [health=" + health + ", strength=" + strength + 
				", name=" + name + "]\n" + weapon + "\n";
	}	

}
