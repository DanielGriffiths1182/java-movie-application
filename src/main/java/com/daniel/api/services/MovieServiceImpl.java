package com.daniel.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// NOTE Write methods
@Service
public class MovieServiceImpl implements IMovieService{

		private IMovie movieRepo;

		@Autowired
		  public void setMovieRepo(IMovie movieRepo) {
		    this.movieRepo = movieRepo;
		}

		@Override
		  public Iterable<Movie> listAllMovies() {
		    return movieRepo.findAll();
		}

		@Override
		  public Movie getMovieById(long id) {
		    return movieRepo.findOne(id);
		}

		@Override
		  public Movie saveMovie(Movie movie) {
		    return movieRepo.save(movie);
		}

		@Override
		  public void deleteMovie(long id) {

		  movieRepo.delete(id);

		}


}
