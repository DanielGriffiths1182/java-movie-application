package com.daniel.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// NOTE Set base API URL write endpoints
@Controller
@RequestMapping("/index")
public class MovieController {

  // NOTE instantiate movie service to allow method calls
	private IMovieService movieService;

	@Autowired
	public void setMovieService(IMovieService movieService) {
		this.movieService = movieService;
	}

	@RequestMapping(value="", method=RequestMethod.GET)
	  public ModelAndView index() {
	      ModelAndView model = new ModelAndView("index");
	      model.addObject("list", movieService.listAllMovies());
	      return model;
	  }

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	 public ModelAndView deleteMovies(@PathVariable long id) {
	  movieService.deleteMovie(id);
	    return new ModelAndView("redirect:/index");
	 }

  @RequestMapping(value="/add", method = RequestMethod.POST)
  public ModelAndView movieRegister(@ModelAttribute("movie")Movie movie){
  	ModelAndView model = new ModelAndView("index");
  	if(movie!=null){
  	movieService.saveMovie(movie);
  	model.addObject("notify", "Success");

  	}
  	else{
  		model.addObject("error","Error" );

  	}
  	return new ModelAndView("redirect:/index");
  }
  @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") long id) {
	  ModelAndView model = new ModelAndView("edit");
        Movie movie = movieService.getMovieById(id);
        model.addObject("movie", movie);
        return model;
    }

   @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("id") long id,
                               @RequestParam("title") String title,@RequestParam("director") String director) {
        Movie movie = movieService.getMovieById(id);
        movie.setTitle(title);
        movie.setDirector(director);
        movieService.saveMovie(movie);
        return new ModelAndView("redirect:/index");
    }

}
