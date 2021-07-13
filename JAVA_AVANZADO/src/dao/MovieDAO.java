package dao;

import model.Movie;

import java.util.ArrayList;

public interface MovieDAO {
    default Movie setMovieViewed(Movie movie) {
        return movie;
    }

    default ArrayList<Movie> read() {
        ArrayList<Movie> movies = new ArrayList<>();
        return movies;
    }

    default boolean getMovieViewed() {
        return false;
    }
}
