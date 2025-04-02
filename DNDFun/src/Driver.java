
public class Driver {

	public static void main(String[] args) {
		Character hero = new Character();
		Weapon sword = new Weapon("Sword", 34);
		hero.setName("Dr. Bigglesworth");
		hero.setHealth(135);
		hero.setStrength(16);
		hero.setWeapon(sword);
		
		
		System.out.println(hero.toString());
		
		Character villian = new Character(150, 11, "Owly", "Claws", 35);
		
		System.out.println(villian.toString());
		
		
//		System.out.println(hero.doDamage());
//		System.out.println(villian.doDamage());
		
		while(hero.getHealth() > 0 && villian.getHealth() > 0)
		{
			int dmg = hero.doDamage();
			villian.recieveDamage(dmg);
			System.out.println(hero.getName() + " struck " + villian.getName() + " for " + dmg + 
					" damage." + hero.getName() + "'s health is at " + hero.getHealth());
			dmg = villian.doDamage();
			hero.recieveDamage(dmg);
			System.out.println(villian.getName() + " struck " + hero.getName() + " for " + dmg + 
					" damage." + villian.getName() + "'s health is at " + villian.getHealth());
		
			System.out.println();
		}
		
		if(hero.getHealth() <= 0)
		{
			System.out.println(villian.getName() + " has struck down " + hero.getName());
		}
		else
		{
			System.out.println(hero.getName() + " has struck down " + villian.getName());
		}
		
		System.out.println();
		prettyPrint(hero);
		prettyPrint(villian);
	}
	
	public static void prettyPrint(Character character)
	{
		System.out.println(character.getName() + " has " + character.getHealth() +
				" hit points and is using their " + character.getWeapon().getName());
		System.out.println();
	}

}
