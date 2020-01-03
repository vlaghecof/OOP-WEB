package controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import model.Movie;
import service.MovieService;

@RestController
public class MovieController {
	private MovieService movieService = new MovieService();

	@GetMapping("/movie")
	@ResponseBody
	public List<Movie> getAllMovies()
	{
		return movieService.findAll();
	}
	
	@PostMapping("/movie")
	@ResponseBody
	public Movie saveMovie(@RequestBody Movie movie)
	{
		if(movie != null) {
			return movieService.save(movie);
		}
		return null;
	}
	
}
