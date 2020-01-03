package transformer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.CinemaHall;

public class HallTransformer implements Transformer<CinemaHall> {

	@Override
	public CinemaHall toModel(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CinemaHall> toModelList(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}

	private CinemaHall builddHall(ResultSet resultSet)throws SQLException{
		CinemaHall hall = new CinemaHall();
		hall.setId(resultSet.getLong("id"));
		hall.setAvailableSeats(resultSet.getInt("AvailableSeats"));
		hall.setRoomSector(resultSet.getString("Sector"));
		hall.setDeluxe(resultSet.getInt("DeluxeSeats"));
		hall.setRegular(resultSet.getInt("RegularSeats"));
		hall.setUltra(resultSet.getInt("UltraSeats"));
		return hall;
	}
}
