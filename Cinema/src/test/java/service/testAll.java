package service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import model.Movie;
import model.MovieType;

class testAll {
	private MovieService movieService = new MovieService();
	
	
	@Test
	void test() {
		Date date = new Date(0);
		date.toLocalDate();
		
	Movie movie = new Movie();
	movie.setMoviName("Ciocolatica");
	movie.setDate(date);
	movie.setGenres(MovieType.HORROR);
	movie = movieService.save(movie);
	
	
	Assert.assertNotNull(movieService.findById((long) 1));
		
	List<Movie> persons = movieService.findAll();
	Assert.assertNotNull(persons);
	Assert.assertEquals(1, persons.size());
	}

}
