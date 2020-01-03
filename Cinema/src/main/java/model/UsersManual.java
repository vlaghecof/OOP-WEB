package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsersManual {
	
	@JsonProperty("All Movies : ")
	public String row1 = " /movie";

	@JsonProperty("Find in which room a movie is by its id : ")
	public String row2 = " /findHall/movieId";
	
	@JsonProperty("All movies in a cinema hall ")
	public String row3 = " /movieByHall/hall Id";
	
	@JsonProperty("Movie Search by genre ")
	public String row4 = " /movie/Genre";

	@JsonProperty("Make a ticket ")
	public String row5 = " /movieS/MovieId/Ticket type(Deluxe,Ultra,Regular)";
	

}
