import java.util.Random;
import java.util.Scanner;

public class Character {
	private Random rand = new Random();
	private String name;
	private String type;
	private int health;
	private int strength;
	private Weapon weapon;
	
	public static Scanner input = new Scanner(System.in);
	
	public Character() {
		this.name = "";
		this.type = "";
		this.health = 0;
		this.strength = 0;
	}
	
	public Character(String name, String type, int health, int strength) {
		this.name = name;
		this.type = type;
		this.health = health;
		this.strength = strength;
	}
	
	public static Character createChar(Character chr)
	{
		
		System.out.println("Enter your characters name.");		
		String name = input.nextLine();
		
		chr.setName(name);
		
		System.out.println("Enter your characters type.");		
		String type = input.nextLine();
		
		chr.setType(type);
		
		System.out.println("Enter your characters health.");
		int hlth = input.nextInt();
		
		chr.setHealth(hlth);
		
		System.out.println("Enter your characters strength.");
		int str = input.nextInt();
		
		chr.setStrength(str);
		input.nextLine();
		return chr;
	}

	
	public int attack(int strength)
	{
		return strength * rand.nextInt(4)+1 + weapon.getAddedDamage();
	}
	
	public void damage(int amount)
	{
		this.health = this.health - amount;
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
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(String name, int damage) {
		this.weapon = new Weapon(name, damage);
	}

	@Override
	public String toString() {
		String rtrn = "Character name:" + name + "\ntype:" 
				+ type + "\nhealth:" + health + "\nstrength:" 
				+ strength;
		if(weapon != null) rtrn += this.weapon;
		
		return rtrn;
	}
	
	
	
	
	
}
