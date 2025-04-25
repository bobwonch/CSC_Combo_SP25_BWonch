
public class Cow extends Animal {
	private String type;
	public Cow(int height, int weight, String name) {
		super(height, weight, name);
		this.type = "Cow";
	}

	public String getType()
	{
		return this.type;
	}
	@Override 
	public void animalSound()
	{
		System.out.println("The says moo!");
	}

	@Override
	public String toString() {
		return super.toString() + "Cow []";
	}
	
	
	
}
