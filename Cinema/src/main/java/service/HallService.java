package service;

import java.util.List;

import model.CinemaHall;
import repository.HallRepository;

public class HallService implements Service<CinemaHall>{

	private HallRepository hallRepository;
	
	public HallService() {
	this.hallRepository= new HallRepository();
	}
	
	@Override
	public CinemaHall save(CinemaHall entity) {
		// TODO Auto-generated method stub
		return hallRepository.save(entity);
	}

	@Override
	public CinemaHall findById(Long id) {
		// TODO Auto-generated method stub
		return hallRepository.findById(id);
	}

	@Override
	public List<CinemaHall> findAll() {
		// TODO Auto-generated method stub
		return hallRepository.findAll();
	}

	@Override
	public boolean delete(CinemaHall entity) {
		// TODO Auto-generated method stub
		return hallRepository.delete(entity);
	}

	public boolean deleteById(long Id) {
		return hallRepository.deleteById(Id);
	}
}
