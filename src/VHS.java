import java.util.*;

public class VHS extends Movie
{

	private int currentTime = 0;
	
	@Override
	public void play()
	{
		System.out.println(scenes.get(currentTime));
		System.out.println();
		currentTime++;
		if (currentTime > FINAL_SCENE)
		{
			rewind();
			System.out.println("Rewinding");
		}
	}
	
	public void rewind() // Be kind
		{
		currentTime = 0;
		}
	
	public VHS (String title, int runtime)
	{
		this.title = title;
		this.runTime = runtime;
	}
	
}
