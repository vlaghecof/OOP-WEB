package aWebApp.Cinema;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.CinemaHall;
import model.Movie;
import service.HallService;

@RestController
public class HallController {
	private HallService hallService = new HallService();

	
	@GetMapping("/hall")
	@ResponseBody
	public List<CinemaHall> getAllMovies()
	{
		return hallService.findAll();
	}
	
	
	@PostMapping("/hall")
	@ResponseBody
	public CinemaHall saveMovie(@RequestBody CinemaHall hall)
	{
		if(hall != null) {
			return hallService.save(hall);
		}
		return null;
	}
	
}
