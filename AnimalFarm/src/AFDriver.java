import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AFDriver {

	public static void main(String[] args) {

		File aFile = createFile();
		ArrayList<Animal> afarm = readFile(aFile);
		writeFile(aFile, afarm);
		prettyPrint(afarm);

	}

	private static ArrayList<Animal> readFile(File myFile) {
		ArrayList<Animal> afarm = new ArrayList<>();

		try {
			Scanner myReader = new Scanner(myFile);
			while (myReader.hasNextLine()) {
				Animal ani;
				String type = myReader.nextLine();
				String sound = myReader.nextLine();
				int height = myReader.nextInt();
				int weight = myReader.nextInt();
				if (myReader.hasNextLine()) {
					myReader.nextLine();
				}
				if (type.equals("Pig")) {
					String color = myReader.nextLine();
					ani = new Pig(sound, color, height, weight);
				} else if (type.equals("Cow")) {
					ani = new Cow(sound, height, weight);
				} else {
					ani = new Animal(sound, height, weight);
				}
				afarm.add(ani);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return afarm;
	}

	private static void prettyPrint(ArrayList<Animal> afarm) {
		for (Animal animal : afarm) {
			System.out.println(animal.getType());
			System.out.println(animal.getSound());
			System.out.println(animal.getHeight());
			System.out.println(animal.getWeight());
			
			if (animal instanceof Pig) {
				System.out.println(animal.getColor());;
			}
			animal.animalSound();
		}

	}

	private static File createFile() {
		File myFile = new File("AnimalFarm.txt");
		try {
			if (myFile.createNewFile()) {
				System.out.println("File created:" + myFile.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occured while creating your file.");
			e.printStackTrace();
		}
		return myFile;
	}

	private static void writeFile(File file, ArrayList<Animal> animals) {
		try {
			FileWriter myWriter = new FileWriter("AnimalFarm.txt");
			for (Animal animal : animals) {
				myWriter.write(animal.getType() + "\n");
				myWriter.write(animal.getSound() + "\n");
				myWriter.write(animal.getHeight() + "\n");
				myWriter.write(animal.getWeight()+ "\n");
				if (animal.getType().equals("Pig")) {
					myWriter.write(animal.getColor()+"\n");
				}

			}
			myWriter.close();
			System.out.println("Successfully writen to file.");
		} catch (IOException e) {
			System.out.println("An eror occured while writing to your file.");
			e.printStackTrace();
		}
	}
}
