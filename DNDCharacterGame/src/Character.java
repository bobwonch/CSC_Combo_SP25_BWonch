import java.util.Random;
import java.util.Scanner;

public class Character {
	private String name;
	private String type;
	private int health;
	private int strength;
	private Weapon weapon;
	
	private static Scanner input = new Scanner(System.in);
	private Random rand = new Random();
	
	public Character() 
	{
		super();
		this.name = "player";
		this.type = "";
		this.health = 0;
		this.strength = 0;
	}
	
	public Character(String name, String type, int health, int strength) 
	{
		super();
		this.name = name;
		this.type = type;
		this.health = health;
		this.strength = strength;
	}
	
	public int attack() {
		return this.strength + (rand.nextInt(4)+1) * 2 + this.weapon.getAddedDamage();
	}
	
	public void damage(int amt)
	{
		this.health = this.health-amt;
	}
	public static Character createCharacter(Character chr)
	{
		System.out.println("What is your characters name?");
		String name = input.nextLine();
		chr.setName(name);
		
		System.out.println("What is your characters type?");
		String type = input.nextLine();
		chr.setType(type);
		
		System.out.println("Health");
		int health = input.nextInt();
		chr.setHealth(health);
		
		System.out.println("Strength");
		int strength = input.nextInt();
		chr.setStrength(strength);
		
		return chr;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(String name, int dmg) {
		this.weapon = new Weapon(name, dmg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	@Override
	public String toString() {
		String rtrn = "Character Name:" + name + 
				"\nType:" + type + "\nHealth:" + 
				health + "\nStrength:" + strength;
		if(this.weapon != null)
		{
			rtrn += weapon;
		}
		return rtrn;
	}
	
	
	
}
