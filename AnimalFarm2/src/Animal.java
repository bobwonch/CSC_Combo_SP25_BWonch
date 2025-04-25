
public class Animal {
	private int height;
	private int weight;
	private String name;
	private String type;
	private String color;
	
	public Animal(int height, int weight, String name) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.type = "Animal";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor()
	{
		return null;
	}
	
	public String getType()
	{
		return this.type;
	}
	public void animalSound()
	{
		System.out.println("The animal makes a sound: Bleee-arch!");
	}
	
	@Override
	public String toString() {
		return "Animal [height=" + height + ", weight=" + weight + ", name=" + name + "]";
	}
}
