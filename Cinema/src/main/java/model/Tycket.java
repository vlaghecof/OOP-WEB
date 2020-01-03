package model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tycket {
	
	 @JsonProperty("Status : ")
	private String status;
	 @JsonProperty("Movie Name : ")
	private String movieName;
	 @JsonProperty("Date :")
	private Date date;
	 @JsonProperty("price :")
	private Integer price;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	

}
