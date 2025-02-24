import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		int dmg;
		
		Character player = new Character("Bilbo", "Hobbit", 200, 25);
		
		Character enemy = new Character("Greg", "Goblin", 180, 20);
		
		//enemy = Character.createCharacter(enemy);
		
		player.setWeapon("Sting", 30);
		enemy.setWeapon("Claws", 20);
		
		while(player.getHealth() > 0 && enemy.getHealth() > 0)
		{
			dmg = player.attack();
			enemy.damage(dmg);
			
			dmg = enemy.attack();
			player.damage(dmg);
			
			System.out.println("Player health: " + player.getHealth());
			System.out.println("Enemy health: " + enemy.getHealth());
		}
		if(player.getHealth() > 0) {
			System.out.println(player.getName() + " wins!\n" + player.getHealth() );
		}
		else
		{
			System.out.println(enemy.getName() + " wins!\n" + enemy.getHealth());
		}
		
	}

}
