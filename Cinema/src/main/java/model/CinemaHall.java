package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cinemaHall")
public class CinemaHall extends AbstractEntity{
	
	@Column
	private String roomSector;//where is the room placed
	@Column
	private Integer availableSeats;
	@Column
	private Integer deluxe;
	@Column
	private Integer regular;
	@Column
	private Integer ultra;
	public String getRoomSector() {
		return roomSector;
	}
	public void setRoomSector(String roomSector) {
		this.roomSector = roomSector;
	}
	public Integer getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Integer getDeluxe() {
		return deluxe;
	}
	public void setDeluxe(Integer deluxe) {
		this.deluxe = deluxe;
	}
	public Integer getRegular() {
		return regular;
	}
	public void setRegular(Integer regular) {
		this.regular = regular;
	}
	public Integer getUltra() {
		return ultra;
	}
	public void setUltra(Integer ultra) {
		this.ultra = ultra;
	}
	
	

}
