package daniel.api;

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


}
