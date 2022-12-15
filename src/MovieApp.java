import java.util.*;

public class MovieApp
{

	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		List<Movie> movies = new ArrayList<>();
		Movie movie;
		movie = new DVD("Generic Star Wars", 136);
		movie.getScenes().add("Opening crawl");
		movie.getScenes().add("Shootout");
		movie.getScenes().add("Space battle");
		movie.getScenes().add("Lightsaber fight");
		movies.add(movie);
		movie = new DVD("Generic MCU", 132);
		movie.getScenes().add("Bring in the hero(es) of this one");
		movie.getScenes().add("Small fight");
		movie.getScenes().add("Superhero(es) of the movie group up");
		movie.getScenes().add("CGI-heavy final fight");
		movies.add(movie);
		movie = new DVD("Generic Harry Potter", 147);
		movie.getScenes().add("Preparing for a new year");
		movie.getScenes().add("Getting to Hogwarts");
		movie.getScenes().add("Shenanigans");
		movie.getScenes().add("Harry pulls through via sheer luck");
		movies.add(movie);
		movie = new VHS("Generic James Bond", 139);
		movie.getScenes().add("Bond gets his mission");
		movie.getScenes().add("One-liner");
		movie.getScenes().add("Ironic villain death");
		movie.getScenes().add("Bond bangs the Bond girl");
		movies.add(movie);
		movie = new VHS("Generic Dreamworks", 90);
		movie.getScenes().add("Jerk with a heart of gold winds up travelling with bumbling sidekick");
		movie.getScenes().add("Misunderstanding");
		movie.getScenes().add("Sad song montage");
		movie.getScenes().add("The main characters make up and take down the villain");
		movies.add(movie);
		movie = new VHS("Generic Romance Movie", 85);  // I ran out of franchises/companies
		movie.getScenes().add("The lead characters meet");
		movie.getScenes().add("The lead characters get together");
		movie.getScenes().add("Shoehorned in misunderstanding");
		movie.getScenes().add("The lead characters get over the misunderstanding and get back together");
		movies.add(movie);

		System.out.println("Welcome to GC Blockbuster!");
		
		int movieIndex;
		boolean choosingMovie = true;
		while(choosingMovie)
		{
			System.out.println("Please select a movie from the list:");
			System.out.println("1) " + movies.get(0).getTitle());
			System.out.println("2) " + movies.get(1).getTitle());
			System.out.println("3) " + movies.get(2).getTitle());
			System.out.println("4) " + movies.get(3).getTitle());
			System.out.println("5) " + movies.get(4).getTitle());
			System.out.println("6) " + movies.get(5).getTitle());

			System.out.print("Please select the movie you want to watch: ");
			movieIndex = scnr.nextInt() - 1;
			if (movieIndex < movies.size() && movieIndex >= 0)
			{
				System.out.println();
				System.out.println("Title: " + movies.get(movieIndex).getTitle());
				System.out.println("Runtime: " + movies.get(movieIndex).getRunTime() + " minutes");
				boolean wannaWatch = true;
				while (wannaWatch)
				{	
					System.out.print("Do you want to watch the movie? Y/N ");
					String watchThis = scnr.next();
	
						if (watchThis.equalsIgnoreCase("y"))
						{
							choosingMovie = false;
							wannaWatch = false;
						}
						else if (watchThis.equalsIgnoreCase("n"))
						{
							System.out.println("Then please choose another movie");
							System.out.println();
							wannaWatch = false;
						}
						else
						{
							System.out.println("Try again");
							System.out.println();
						}
				}
				
				boolean watchingMovie = true;
				while (watchingMovie)
				{
					movies.get(movieIndex).play();
					
					boolean keepWatching = true;
					while (keepWatching)
					{
						System.out.println();
						System.out.print("Watch another scene? ");
						String watchMore = scnr.next();
						
						if (watchMore.equalsIgnoreCase("y"))
						{
							keepWatching = false;
						}
						else if (watchMore.equalsIgnoreCase("n"))
						{
							System.out.println("Bye!");
							watchingMovie = false;
							keepWatching = false;
						}
						else
						{
							System.out.println("Try again");
							System.out.println();
						}
					}
				}
			
			}
			else
			{
				System.out.println("Try again.");
				System.out.println();
			}	
		}
		
//		System.out.println(movies.get(3).scenes.get(2));
	}

}
