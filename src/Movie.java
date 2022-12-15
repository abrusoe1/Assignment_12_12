import java.util.*;

public abstract class Movie
{

	private String title;
	private int runTime;
	

	private List<String> scenes = new ArrayList<>();
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public List<String> getScenes() {
		return scenes;
	}

	public void setScenes(List<String> scenes) {
		this.scenes = scenes;
	}
}
