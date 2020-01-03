package service;

import java.util.List;

import model.CinemaHall;
import model.Movie;
import repository.MovieRepository;

public class MovieService implements Service<Movie>{

	private MovieRepository movieRepository;
	
	public MovieService() {
		this.movieRepository=new MovieRepository();
	}
	
	
	@Override
	public Movie save(Movie entity) {
	return movieRepository.save(entity);
		
	}

	@Override
	public Movie findById(Long id) {
		return movieRepository.findById(id);
	}

	@Override
	public List<Movie> findAll() {
		return movieRepository.findAll();
	}

	@Override
	public boolean delete(Movie entity) {
		return movieRepository.delete(entity);
	}
	
	public boolean deleteById(long Id) {
		return movieRepository.deleteById(Id);
	}

	public List<Movie> findGenre(Enum genre){
		return movieRepository.findGenre(genre);
	}
	

	
	public CinemaHall findByIdHall(Long id)
	{
		return movieRepository.findByIDHall(id);
		
	}
	
	
	//public List<Movie> findMoviesInHall(Long id) {
	
	public List<Movie> findMovieInHall(Long id)
	{
		return movieRepository.findMoviesInHall(id);
	}
	
}
	
