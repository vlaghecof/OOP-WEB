package transformer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Movie;
import model.MovieType;


public class MovieTransformer implements Transformer<Movie>{
	@Override
	public Movie toModel(ResultSet resultSet) {
		try {
			if (resultSet.next()) {
				return buildMovie(resultSet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Movie> toModelList(ResultSet resultSet) {
		List<Movie> movies = new ArrayList<>();
		try {
			while (resultSet.next()) {
				Movie movie = buildMovie(resultSet);
				if (movie != null) {
					movies.add(movie);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies;
	}
	
	private Movie buildMovie(ResultSet resultSet) throws SQLException{
		Movie movie = new Movie();
		movie.setId(resultSet.getLong("id"));
		movie.setMoviName(resultSet.getString("movie_Name"));
		movie.setDate(resultSet.getDate("date"));
		movie.setTime(resultSet.getTime("time"));
		movie.setGenres(MovieType.valueOf(resultSet.getString("genres")));
		movie.setEmptySeats(resultSet.getInt("emptySeats"));
		movie.setIdCinema(resultSet.getLong("idCinema"));
		return movie;
	}

}
