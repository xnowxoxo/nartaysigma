package Assignment3.Iterator;

public class ArrayMovieCollection implements MovieCollection {
    private String[] movies;
    private int index = 0;

    public ArrayMovieCollection(int size) {
        movies = new String[size];
    }

    public ArrayMovieCollection addMovie(String movie) {
        if (index < movies.length) {
            movies[index++] = movie;
        }
        return this;
    }

    @Override
    public Iterator<String> createIterator() {
        return new ArrayMovieIterator(movies);
    }
}
