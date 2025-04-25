import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AFDriver {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();		
		File myFile = createFile();
		
		
		Animal animal = new Animal(70, 200, "Annie");
		System.out.println(animal);
		animal.animalSound();
		animals.add(animal);
		
		Animal pig = new Pig(70, 375, "Penelope", "Pink");
		System.out.println(pig);
		pig.animalSound();
		animals.add(pig);
		
		Animal cow = new Cow(93, 1200, "Cleo");
		System.out.println(cow);
		cow.animalSound();
		animals.add(cow);
		
		writeFile(myFile, animals);
//		System.out.println();
//		System.out.println();
//		prettyPrint(animals);
	}
	
	public static void prettyPrint(ArrayList<Animal>animals)
	{
		System.out.println("Bob's Animal Farm");
		for(Animal animal : animals)
		{
			System.out.println(animal.getClass());
			System.out.println(animal.getName() + ":");
			System.out.println("Height:" + animal.getHeight());
			System.out.println("Weight:" + animal.getWeight());
			if(animal instanceof Pig)
			{
				System.out.println("Color:" + ((Pig) animal).getColor());
			}
			System.out.println();
		}
	}
	
	public static File createFile()
	{
		File aFarm = new File("AnimalFarm.txt");
		try
		{
			if(aFarm.createNewFile())
			{
				System.out.println("File created:" + aFarm.getName());
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
		return aFarm;
	}

	public static void writeFile(File myFile, ArrayList<Animal> animals)
	{
		try{
			FileWriter myWriter = new FileWriter(myFile.getName());
			for(Animal animal : animals)
			{
				myWriter.write(animal.getType() + "\n");
				myWriter.write(animal.getHeight()+ "\n");
				myWriter.write(animal.getWeight()+ "\n");
				myWriter.write(animal.getName()+ "\n");
				if(animal.getType().equals("Pig"))
				{
					myWriter.write(animal.getColor()+ "\n");
				}
			}
			myWriter.close();
			System.out.println("Data sucessfully written to the file.");
		}catch(IOException e)
		{
			System.out.println("There was an error writing to your file.");
			e.printStackTrace();
		}
	}

}
