import java.util.*;

public abstract class Movie
{

	protected String title;
	protected int runTime;
	

	List<String> scenes = new ArrayList<>();
	final int FINAL_SCENE = 3;
	
	public void printInfo()
	{
		System.out.println(title);
		System.out.println(runTime);
	}
	
	public void printScenes()
	{
		for (int i = 0; i < 6; i++)
		{
			System.out.println("" + scenes.get(i) + i);
		}
	}

	public abstract void play();
	
	public Movie()
	{
	}
	
	public Movie (String title, int runtime)
	{
		this.title = title;
		this.runTime = runtime;
	}

	
}
