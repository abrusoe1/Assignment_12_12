import java.util.*;

public class MovieApp
{

	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		List<Movie> movies = new ArrayList<>();
		Movie movie;
		movie = new DVD("Generic Star Wars", 136);
		movie.scenes.add("Opening crawl");
		movie.scenes.add("Shootout");
		movie.scenes.add("Space battle");
		movie.scenes.add("Lightsaber fight");
		movies.add(movie);
		movie = new DVD("Generic MCU", 132);
		movie.scenes.add("Bring in the hero(es) of this one");
		movie.scenes.add("Small fight");
		movie.scenes.add("Superhero(es) of the movie group up");
		movie.scenes.add("CGI-heavy final fight");
		movies.add(movie);
		movie = new DVD("Generic Harry Potter", 147);
		movie.scenes.add("Preparing for a new year");
		movie.scenes.add("Getting to Hogwarts");
		movie.scenes.add("Shenanigans");
		movie.scenes.add("Harry pulls through via sheer luck");
		movies.add(movie);
		movie = new VHS("Generic James Bond", 139);
		movie.scenes.add("Bond gets his mission");
		movie.scenes.add("One-liner");
		movie.scenes.add("Ironic villain death");
		movie.scenes.add("Bond bangs the Bond girl");
		movies.add(movie);
		movie = new VHS("Generic Dreamworks", 90);
		movie.scenes.add("Jerk with a heart of gold winds up travelling with bumbling sidekick");
		movie.scenes.add("Misunderstanding");
		movie.scenes.add("Sad song montage");
		movie.scenes.add("The main characters make up and take down the villain");
		movies.add(movie);
		movie = new VHS("Generic Romance Movie", 85);  // I ran out of franchises/companies
		movie.scenes.add("The lead characters meet");
		movie.scenes.add("The lead characters get together");
		movie.scenes.add("Shoehorned in misunderstanding");
		movie.scenes.add("The lead characters get over the misunderstanding and get back together");
		movies.add(movie);

		System.out.println("Welcome to GC Blockbuster!");
		
		int movieIndex;
		boolean choosingMovie = true;
		while(choosingMovie)
		{
			System.out.println("Please select a movie from the list:");
			System.out.println("1) " + movies.get(0).title);
			System.out.println("2) " + movies.get(1).title);
			System.out.println("3) " + movies.get(2).title);
			System.out.println("4) " + movies.get(3).title);
			System.out.println("5) " + movies.get(4).title);
			System.out.println("6) " + movies.get(5).title);

			System.out.print("Please select the movie you want to watch: ");
			movieIndex = scnr.nextInt() - 1;
			if (movieIndex < movies.size() && movieIndex >= 0)
			{
				System.out.println();
				System.out.println("Title: " + movies.get(movieIndex).title);
				System.out.println("Runtime: " + movies.get(movieIndex).runTime + " minutes");
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
