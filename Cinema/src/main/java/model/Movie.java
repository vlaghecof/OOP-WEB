package model;

import java.awt.GridBagConstraints;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


import service.MovieService;

import javax.persistence.Entity;




@Entity
@Table(name = "movie")
public class Movie extends AbstractEntity{

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	@Column 
	private String movieName;
	@Column 
	private MovieType genres;
	@Column 
	private Date date;
	@Column
	private Time time;
	@Column 
	private Integer emptySeats;
	@Column
	private Long idCinema;
	public String getMoviName() {
		return movieName;
	}
	public void setMoviName(String moviName) {
		this.movieName = moviName;
	}
	public MovieType getGenres() {
		return genres;
	}
	public void setGenres(MovieType genres) {
		this.genres = genres;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getEmptySeats() {
		return emptySeats;
	}
	public void setEmptySeats(Integer emptySeats) {
		this.emptySeats = emptySeats;
	}
	public Long getIdCinema() {
		return idCinema;
	}
	public void setIdCinema(Long idCinema) {
		this.idCinema = idCinema;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
}
