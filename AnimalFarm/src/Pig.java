
public class Pig extends Animal{
	private String color;
	private String type;
	
	public Pig() 
	{
		super("oink", 0 , 0);
		color = "";
		this.type = "Pig";
	}

	public Pig(String color,String sound, int height, int weight) {
		super(sound, height, weight);
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
	@Override
	public String getType()
	{
		return this.type;
	}
	@Override
	public void animalSound()
	{
		System.out.println("The pig goes wee wee wee");
	}
	@Override
	public String toString() {
		return "Pig color=" + color + " " + super.toString();
	}
		
}
