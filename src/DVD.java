import java.util.*;

public class DVD extends Movie
{

	@Override
	public void play()
	{
		Scanner scnr1 = new Scanner(System.in);  // Closing this scanner causes a NoSuchElementException
		
		boolean choosingScene = true;
		while(choosingScene)
		{
			System.out.println();
			System.out.print("Which scene of the DVD " + getTitle() + " would you like to watch? Select 0 to 3: ");
			int sceneSelect = scnr1.nextInt();
			if (sceneSelect > FINAL_SCENE || sceneSelect < 0)
			{
				System.out.println("Try again.");
			}
			else
			{
				System.out.println(getScenes().get(sceneSelect));
				choosingScene = false;
			}
		}
	}
	
	public DVD (String title, int runTime)
	{
		setTitle(title);
		setRunTime(runTime);
	}
	
}
