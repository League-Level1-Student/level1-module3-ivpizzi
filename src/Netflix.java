
public class Netflix
{
	public static void main(String[] args)
	{
		Netflix n = new Netflix();
		n.start();
	}
	
	void start()
	{
		 Movie movie1 = new Movie("Sunshine", 5);
		 //System.out.println(movie1.getTitle() + ": " + movie1.getTicketPrice());
		 Movie movie2 = new Movie("Twilight", 2);
		 //.out.println(movie2.getTitle() + ": " + movie2.getTicketPrice());
		 Movie movie3 = new Movie("Hotel Transylvania 3", 2);
		 //System.out.println(movie3.getTitle() + ": " + movie3.getTicketPrice());
		 Movie movie4 = new Movie("Beauty and the Beast", 4);
		 //System.out.println(movie4.getTitle() + ": " + movie4.getTicketPrice());
		 
		 NetflixQueue nq = new NetflixQueue();
		 nq.addMovie(movie1);
		 nq.addMovie(movie2);
		 nq.addMovie(movie3);
		 nq.addMovie(movie4);
		 nq.printMovies();
		 System.out.println("The best movie is " + nq.getBestMovie());
		 System.out.println("The 2nd best movie is " + nq.getMovie(1));
	}
}
