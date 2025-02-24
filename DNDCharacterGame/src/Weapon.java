
public class Weapon {
	private String name;
	private int addedDamage;
	
	public Weapon() {
		super();
		this.name = "weapon";
		this.addedDamage = 0;
	}
	
	public Weapon(String name, int addedDamage) {
		super();
		this.name = name;
		this.addedDamage = addedDamage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAddedDamage() {
		return addedDamage;
	}

	public void setAddedDamage(int addedDamage) {
		this.addedDamage = addedDamage;
	}

	@Override
	public String toString() {
		return "\nWeapon:" + name + "\nAdded Damage:" + addedDamage;
	}
	
	
}
