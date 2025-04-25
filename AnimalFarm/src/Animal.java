
public class Animal {
	private String sound;
	private int height;
	private int weight;
	private String type;
	
	public Animal() {
		this.sound = "Bleearch!";
		this.height = 0;
		this.weight = 0;
		
	}
	
	public Animal(String sound, int height, int weight) {
		this.sound = sound;
		this.height = height;
		this.weight = weight;
		this.type = "Animal";
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getType()
	{
		return this.type;
	}
	public void animalSound()
	{
		System.out.println("The animal makes a sound.");
	}
	
	@Override
 	public String toString() {
		return "Animal [sound=" + sound + ", height=" + height + ", weight=" + weight + "]";
	}

	public String getColor() {
		return null;
	}

}
