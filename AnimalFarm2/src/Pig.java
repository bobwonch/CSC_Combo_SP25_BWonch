
public class Pig extends Animal{
	private String color;
	private String type;
	public Pig(int height, int weight, String name, String color) {
		super(height, weight, name);
		this.color = color;
		this.type = "Pig";
	}
	@Override
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getType()
	{
		return this.type;
	}
	@Override 
	public void animalSound()
	{
		System.out.println("The pig says wee wee wee");
	}

	@Override
	public String toString() {
		return super.toString() + "Pig [color=" + color + "]";
	}
	
	
	
	
}
