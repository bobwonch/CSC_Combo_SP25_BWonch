
public class Cow extends Animal{
	private String type;
	
	public Cow(String sound, int height, int weight) {
		super(sound, height, weight);
		this.type = "Cow";
	}
	@Override
	public String getType()
	{
		return this.type;
	}
	@Override
	public void animalSound()
	{
		System.out.println("The cow says moo!");
	}
	@Override
	public String toString() {
		return "Cow " + super.toString();
	}

	
}
