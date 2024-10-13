package Assignment3.assignment3.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ListMovieCollection implements MovieCollection {
    private List<String> movies;

    public ListMovieCollection() {
        movies = new ArrayList<>();
    }

    public ListMovieCollection addMovie(String movie) {
        movies.add(movie);
        return this;
    }

    @Override
    public Iterator<String> createIterator() {
        return new ListMovieIterator(movies);
    }
}
