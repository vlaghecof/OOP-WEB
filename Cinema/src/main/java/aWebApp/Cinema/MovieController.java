package aWebApp.Cinema;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import model.CinemaHall;
import model.Tycket;
import model.UsersManual;
import model.Movie;
import model.MovieType;
import service.HallService;
import service.MovieService;

@RestController
public class MovieController {
	private MovieService movieService = new MovieService();

	@GetMapping("/")
	@ResponseBody
	public UsersManual Manual()
	{
		UsersManual manual = new UsersManual();
		return manual;
	}
	
	@GetMapping("/movie")
	@ResponseBody
	public List<Movie> getAllMovies() {
		return movieService.findAll();
	}

	@GetMapping("/findHall/{id}")
	@ResponseBody
	public CinemaHall findByIdHall(@PathVariable String id) {
		if (id != null) {
			return movieService.findByIdHall(Long.parseLong(id));
		}
		return null;
	}

	@GetMapping("/movieByHall/{id}")
	@ResponseBody
	public List<Movie> findMoviesInHall(@PathVariable String id) {
		if (id != null) {
			return movieService.findMovieInHall(Long.parseLong(id));
		}
		return null;
	}

	@GetMapping("/movie/{genre}")
	@ResponseBody
	public List<Movie> getGenres(@PathVariable String genre) {
		if (genre != null) {
			MovieType genres = MovieType.valueOf(genre);
			return movieService.findGenre(genres);
		}
		return null;
	}

	@GetMapping("movieS/{id}/{zone}")
	@ResponseBody
	public Tycket takeTicked(@PathVariable String id, @PathVariable String zone) {
		if (id != null) {
			Movie movie = movieService.findById(Long.parseLong(id));
			movie.setEmptySeats(movie.getEmptySeats() - 1);
			movieService.save(movie);
			CinemaHall hall = movieService.findByIdHall(Long.parseLong(id));
			HallService hallService = new HallService();
			Tycket ticket = new Tycket();

			if (zone != null) {
				switch (zone.charAt(0)) {
				case 'D':
					hall.setDeluxe(hall.getDeluxe() - 1);
					hallService.save(hall);
					break;

				case 'U':
					hall.setUltra(hall.getUltra() - 1);
					hallService.save(hall);
					break;

				case 'R':
					hall.setRegular(hall.getRegular() - 1);
					hallService.save(hall);
					break;

				default:
					ticket.setStatus("  Please specify the type of seat you want(Deluxe , Ultra ,Regular)");
					return ticket;
				}

			} else {
				// hall.setRegular(hall.getRegular() - 1);
				// hallService.save(hall);
				ticket.setStatus("Please specify the tipe of seat you want");
				return ticket;
			}

			// return movieService.findAll();
			ticket.setDate(movie.getDate());
			ticket.setMovieName(movie.getMoviName());
			ticket.setStatus("Ticket succesfully purchased ");
			ticket.setPrice((int) zone.charAt(0));
			return ticket;
		}
		Tycket ticket = new Tycket();
		ticket.setStatus("Something Went Wrong");
		return ticket;

	}

	@PostMapping("/movie")
	@ResponseBody
	public Movie saveMovie(@RequestBody Movie movie) {
		if (movie != null) {
			return movieService.save(movie);
		}
		return null;
	}

	@DeleteMapping("/movie")
	@ResponseBody
	public Boolean deleteMovie(@RequestBody Movie movie) {

		if (movie != null) {
			return movieService.delete(movie);
		}
		return false;
	}

	@DeleteMapping("/movie/{id}")
	@ResponseBody
	public Boolean deletePerson(@PathVariable String id) {
		if (id != null) {
			long aux = Long.parseLong(id);
			return movieService.deleteById(aux);
		}
		return false;
	}

	@GetMapping("/test")
	@ResponseBody
	public Tycket tets() {
		Tycket t = new Tycket();

		return t;

	}
}
