package repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.CinemaHall;
import model.Movie;

import service.HibernateService;
import transformer.MovieTransformer;

public class MovieRepository implements Repository<Movie> {

private MovieTransformer movieTransformer ;

 public MovieRepository() {
this.movieTransformer = new MovieTransformer();
}
	
	
	public Movie save(Movie entity) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		databaseSession.saveOrUpdate(entity);
		databaseSession.getTransaction().commit();
		return entity;
	}


	public Movie findById(Long id) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		Query query = databaseSession.createQuery("FROM Movie X WHERE X.id = :id");
		query.setParameter("id", id);
		List<Movie> result = query.list();
		return result.get(0);
	}
	
	public List<Movie> findMoviesInHall(Long id) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		Query query = databaseSession.createQuery("FROM Movie X WHERE X.idCinema = :id");
		query.setParameter("id", id);
		List<Movie> result = query.list();
		return result;
	}

	public CinemaHall findByIDHall(Long id)
	{
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		Query query = databaseSession.createQuery("FROM Movie X WHERE X.id = :id");
		query.setParameter("id", id);
		List<Movie> result = query.list();
		Movie movie = result.get(0);
		Query query2 = databaseSession.createQuery("FROM CinemaHall X WHERE X.id = :id");
		query2.setParameter("id", movie.getIdCinema());
		List<CinemaHall> result2 = query2.list();
		return result2.get(0);
	}

	
	public List<Movie> findAll() {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Movie> result = databaseSession.createCriteria(Movie.class).list();
		return result;
	}


	public boolean delete(Movie entity) {
		// the above implementations should be helpful for implementing this
				Session databaseSession = HibernateService.getSessionFactory().openSession();
				databaseSession.beginTransaction();
				if(findById(entity.getId()) != null) {
					Query query = databaseSession.createQuery("DELETE FROM Movie X WHERE X.id = :id");
					Long movieId = entity.getId();
					query.setParameter("id", movieId);
					query.executeUpdate();
					databaseSession.getTransaction().commit();
					return true;
				}
				else {
					return false;
				}
	}
	
	
	
	public boolean deleteById(long movieID) {
		// the above implementations should be helpful for implementing this
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		if(findById(movieID) != null) {
			Movie entity = new Movie();
			entity = findById(movieID);
			Query query = databaseSession.createQuery("DELETE FROM Movie X WHERE X.id = :id");
			query.setParameter("id", entity.getId());
			query.executeUpdate();
			databaseSession.getTransaction().commit();
			return true;
		}
		else {
			return false;
		}

	}
	

	
	public List<Movie> findGenre(Enum genre) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		Query query = databaseSession.createQuery("FROM Movie X WHERE X.genres = :genre");
		query.setParameter("genre", genre);
		List<Movie> result = query.list();
		return result;
	}

}
