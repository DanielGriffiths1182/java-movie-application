package daniel.api;

// NOTE Service provides written methods for API requests
public interface IMovieService {

	   public Iterable<Movie> listAllMovies();

	   public Movie getMovieById(long id);

	   public Movie saveMovie(Movie movie);

	   public void deleteMovie(long id);

}
