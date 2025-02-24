import java.util.Scanner;

/**
 *  This is my working code for going over loops.
 *  it will have while loops, and traditional for
 *  loops. Enhanced for loops will be covered later on.
 *  
 *  @author Bob Wonch
 *  @date 2/17/25
 *  
 */
public class Loopsies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// here is a while loop. Notice how much it looks like an if statement
		int x = 3;//initializer
		
		while (x > 0)//condition
		{
			System.out.println(x);
			x--;// ++ or -- add one or remove one from the variable
				//increments and decrements
				//this is the changer
		}
		//this happens after all the loops
		System.out.println("BLAST OFF!");
		//loops with extra decisions
		int i = 99;//intitializer
		
		while(i <= 100)//condition
		{
			//changer below
			System.out.println(i);
			if(i % 2 == 0) {//% happens first then == happens
				i = i / 2;// the division happens first then the =
			}else {
				i = 3 * i + 1; //* happens then + happens and then =
			}
		}//end of body of loop
		int people = 0;
		String another = "yes";//initializer
		while(another.charAt(0)=='y')//condition
		{
			people++;//not the changer
			
			System.out.println("Is there another person?");
			another = input.next();
			System.out.println(people);
//			while(true)
//			{
//				if(hero.health() <=0)break;//controls only this loop
//				if(monster.health() <= 0)break;
//				if(Monster.runaway()) break;
//			}
		}
		
		//   init      cond     changer
		for(int a = 10; a > 0; a--)
		{//body
			System.out.println(a);		
		}
		System.out.println("Blast On!!");
		
		
		
		
		
		
		
	}

}
