package dao;

import db.IDBConnection;
import model.Movie;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import static db.Database.*;

public interface MovieDAO extends IDBConnection {
    default Movie setMovieViewed(Movie movie) {
        return movie;
    }

    default ArrayList<Movie> read() {
        ArrayList<Movie> movies = new ArrayList<>();

        try(Connection connection = connectToDB()) {
            String sql = "SELECT * FROM " + TMOVIE;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Movie movie = new Movie(
                        resultSet.getString(TMOVIE_TITLE),
                        resultSet.getString(TMOVIE_GENRE),
                        resultSet.getString(TMOVIE_CREATOR),
                        resultSet.getInt(TMOVIE_DURATION),
                        resultSet.getShort(TMOVIE_YEAR)
                );
                movie.setId(resultSet.getInt(TMOVIE_ID));
                movies.add(movie);
            }
        } catch (SQLException e) {

        }
        return movies;
    }

    default boolean getMovieViewed() {
        return false;
    }
}
