package Assignment3.assignment3.Iterator;

public class ArrayMovieIterator implements Iterator<String> {
    private String[] movies;
    private int position = 0;

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
    }

    @Override
    public boolean hasNext() {
        return position < movies.length && movies[position] != null;
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return movies[position++];
        }
        return null;
    }
}
