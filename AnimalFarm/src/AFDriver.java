import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AFDriver {

	public static void main(String[] args) {
		ArrayList<Animal> afarm = new ArrayList<>();
		File aFile = createFile();
		
		
		Animal ani = new Animal("Boo", 75, 275);
		afarm.add(ani);
		Animal pig = new Pig("Pink","Oink", 50, 375);
		afarm.add(pig);
		Animal cow = new Cow("Moo", 90, 1400);
		afarm.add(cow);
		
//		System.out.println(ani);
//		System.out.println(pig);
//		System.out.println(cow);
		System.out.println(ani.getType());
		writeFile(aFile, afarm);
//		prettyPrint(afarm);
	
	}

	private static void prettyPrint(ArrayList<Animal> afarm) {
		for(Animal animal : afarm)
		{
			System.out.println(animal.getClass());
			
			animal.animalSound();
			if(animal instanceof Pig) {
				System.out.println("wee wee wee wee and wee some more!");
			}
		}
		
	}

	private static File createFile()
	{
		File myFile = new File("AnimalFarm.txt");
		try
		{
			if(myFile.createNewFile())
			{
				System.out.println("File created:" + myFile.getName());
			}
			else
			{
				System.out.println("File already exists");
			}			
		}
		catch(IOException e)
		{
			System.out.println("An error occured while creating your file.");
			e.printStackTrace();
		}
		return myFile;
	}
	
	private static void writeFile(File file, ArrayList<Animal> animals)
	{
		try
		{
			FileWriter myWriter = new FileWriter("AnimalFarm.txt");
			for(Animal animal : animals)
			{
				myWriter.write(animal.getType() + "\n");
				myWriter.write(animal.getSound() + "\n");
				myWriter.write(animal.getHeight()+ "\n");
				myWriter.write(animal.getWeight()+ "\n");
				if(animal.getType().equals("Pig"))
				{
					myWriter.write(animal.getColor()+ "\n");
				}
				myWriter.write("\n");
				
			}
			myWriter.close();
			System.out.println("Successfully writen to file.");
		}
		catch(IOException e)
		{
			System.out.println("An eror occured while writing to your file.");
			e.printStackTrace();
		}
	}
}
