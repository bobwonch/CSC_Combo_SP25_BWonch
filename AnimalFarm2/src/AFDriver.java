import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AFDriver {

	public static void main(String[] args) {
		File myFile = createFile();
		ArrayList<Animal> animals = readFile(myFile);
		inputNew(animals);
		writeFile(myFile, animals);
		prettyPrint(animals);
	}

	private static void inputNew(ArrayList<Animal> animals) {
		Scanner input = new Scanner(System.in);
		Animal ani;
		System.out.println("What is the animal type: Cow, Pig or just Animal");
		String type = input.next();
		System.out.println("Height:");
		int height = input.nextInt();
		System.out.println("Weight:");
		int weight = input.nextInt();
		System.out.println("Name:");
		String name = input.next();
		if(type.equals("Pig"))
		{	input.nextLine();
			System.out.println("Color:");
			String color = input.nextLine();
			ani = new Pig(height, weight, name, color);	
		}
		else if(type.equals("Cow"))
		{
			ani = new Cow(height, weight, name);
		}
		else
		{
			ani = new Animal(height, weight, name);
		}
		
		animals.add(ani);
	}

	public static ArrayList<Animal> readFile(File myFile) {
		ArrayList<Animal> animals = new ArrayList<>();
		Animal ani;
		try {
			Scanner reader = new Scanner(myFile);
			while (reader.hasNextLine()) {
				String type = reader.nextLine();
				int height = Integer.parseInt(reader.nextLine());
				int weight = Integer.parseInt(reader.nextLine());
				String name = reader.nextLine();
				if (type.equals("Pig")) {
					String color = reader.nextLine();
					ani = new Pig(height, weight, name, color);
				} else if (type.equals("Animal")) {
					ani = new Animal(height, weight, name);
				} else {
					ani = new Cow(height, weight, name);
				}
				animals.add(ani);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return animals;
	}

	public static void prettyPrint(ArrayList<Animal> animals) {
		System.out.println("Bob's Animal Farm");
		for (Animal animal : animals) {
			System.out.println(animal.getClass());
			System.out.println(animal.getName() + ":");
			System.out.println("Height:" + animal.getHeight());
			System.out.println("Weight:" + animal.getWeight());
			if (animal instanceof Pig) {
				System.out.println("Color:" + ((Pig) animal).getColor());
			}
			System.out.println();
		}
	}

	public static File createFile() {
		File aFarm = new File("AnimalFarm.txt");
		try {
			if (aFarm.createNewFile()) {
				System.out.println("File created:" + aFarm.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occured while creating your file.");
			e.printStackTrace();
		}
		return aFarm;
	}

	public static void writeFile(File myFile, ArrayList<Animal> animals) {
		try {
			FileWriter myWriter = new FileWriter(myFile.getName());
			for (Animal animal : animals) {
				myWriter.write(animal.getType() + "\n");
				myWriter.write(animal.getHeight() + "\n");
				myWriter.write(animal.getWeight() + "\n");
				myWriter.write(animal.getName() + "\n");
				if (animal.getType().equals("Pig")) {
					myWriter.write(animal.getColor() + "\n");
				}
			}
			myWriter.close();
			System.out.println("Data sucessfully written to the file.");
		} catch (IOException e) {
			System.out.println("There was an error writing to your file.");
			e.printStackTrace();
		}
	}

}
