package repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.CinemaHall;
import model.Movie;
import service.HibernateService;
import transformer.HallTransformer;

public class HallRepository  implements Repository<CinemaHall> {

	private HallTransformer hallTransformer;
	
	public HallRepository() {
	this.hallTransformer = new HallTransformer();
	}
	
	@Override
	public CinemaHall save(CinemaHall entity) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		databaseSession.saveOrUpdate(entity);
		databaseSession.getTransaction().commit();
		return entity;
	}

	
	/*
	 * public List<Movie> showRoom(Long id) {
	 * 
	 * Session databaseSession = HibernateService.getSessionFactory().openSession();
	 * Query query = databaseSession.createQuery("FROM Movie X WHERE X.id = :id");
	 * query.setParameter("id", id); List<Movie> result = query.list(); Movie movie
	 * = result.get(0); Query query2 =
	 * databaseSession.createQuery("FROM CinemaHall X WHERE X.id = :id");
	 * query2.setParameter("id", movie.getIdCinema()); List<CinemaHall> result2 =
	 * query2.list(); return result2.get(0); }
	 */

	
	@Override
	public CinemaHall findById(Long id) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		Query query = databaseSession.createQuery("FROM CinemaHall X WHERE X.id = :id");
		query.setParameter("id", id);
		List<CinemaHall> result = query.list();
		return result.get(0);
	}

	@Override
	public List<CinemaHall> findAll() {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<CinemaHall> result = databaseSession.createCriteria(CinemaHall.class).list();
		return result;	}

	@Override
	public boolean delete(CinemaHall entity) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		if(findById(entity.getId()) != null) {
			Query query = databaseSession.createQuery("DELETE FROM CinemaHall X WHERE X.id = :id");
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
		CinemaHall entity = new CinemaHall();
			entity = findById(movieID);
			Query query = databaseSession.createQuery("DELETE FROM CinemaHall X WHERE X.id = :id");
			query.setParameter("id", entity.getId());
			query.executeUpdate();
			databaseSession.getTransaction().commit();
			return true;
		}
		else {
			return false;
		}

	}

	
	}


