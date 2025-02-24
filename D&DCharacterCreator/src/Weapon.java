
public class Weapon {
	private String weaponName;
	private int addedDamage;
	
	public Weapon() {
		this.weaponName = "";
		this.addedDamage = 0;
	}
	
	public Weapon(String weaponName, int addedDamage) {
		this.weaponName = weaponName;
		this.addedDamage = addedDamage;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public int getAddedDamage() {
		return addedDamage;
	}

	public void setAddedDamage(int addedDamage) {
		this.addedDamage = addedDamage;
	}

	@Override
	public String toString() {
		return "\nWeapon:" + weaponName + "\nAdded Damage:" + addedDamage ;
	}
	
	
	
}
