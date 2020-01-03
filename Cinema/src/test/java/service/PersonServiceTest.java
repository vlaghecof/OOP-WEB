package service;

import java.sql.Date;
import java.util.List;

import org.apache.tomcat.jni.Time;
import org.junit.Assert;
import org.junit.Test;

import model.CinemaHall;
import model.Movie;
import model.MovieType;


public class PersonServiceTest {

	//private PersonService personService = new PersonService();
	private MovieService movieService = new MovieService();
	private HallService hallService = new HallService();
	
	//private ExamSER examService = new ExamSER();
	
	@Test
	public void testFindAll() {
		

		
		Date date = new Date(0);
		date.toLocalDate();
		
		java.sql.Time time = new java.sql.Time(4);
		
		
	Movie movie = new Movie();
	movie.setMoviName("Ciocolatica");
	movie.setDate(date);
	movie.setTime(time);
	movie.setGenres(MovieType.HORROR);
	movie = movieService.save(movie);
		
		
		CinemaHall hall = new CinemaHall();
		hall.setAvailableSeats(40);
		hall.setDeluxe(10);
		hall.setRegular(20);
		hall.setRoomSector("top floor");
		hall.setUltra(10);
		hall = hallService.save(hall);
		/*
		 * Person newPerson2 = new Person(); newPerson2.setFirstName("Vlad");
		 * newPerson2.setLastName("Cofaru"); newPerson2.setCalendarId(1L);
		 * newPerson2.setType(PersonType.TEACHER); newPerson2 =
		 * personService.save(newPerson2);
		 */
		 
		/* 
		 * Person newPerson3 = new Person(); newPerson3.setFirstName("Zsofia");
		 * newPerson3.setLastName("Fodor"); newPerson3.setCalendarId(1L);
		 * newPerson3.setType(PersonType.STUDENT); newPerson3 =
		 * personService.save(newPerson3);
		 */
	
		List<Movie> persons = movieService.findAll();
		Assert.assertNotNull(persons);
		Assert.assertEquals(1, persons.size());
	}
}
