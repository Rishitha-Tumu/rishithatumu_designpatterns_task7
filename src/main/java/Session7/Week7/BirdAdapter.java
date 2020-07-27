package Session7.Week7;

public class BirdAdapter implements Animals
{
	Birds bird;
	public BirdAdapter(Birds bird)
	{
		this.bird=bird;
	}
	public void wild()
	{
		bird.sound();
	}
	public void domestic()
	{
		bird.sound();
	}
}
