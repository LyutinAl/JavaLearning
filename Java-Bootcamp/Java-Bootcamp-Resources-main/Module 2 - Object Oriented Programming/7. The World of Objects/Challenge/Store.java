public class Store {
    Movie[] movies;
    
    public Store() {
        this.movies = new Movie[10];
    }

    public Movie getMovei(int index) {
        return new Movie(this.movies[index]);
    }

    public void setMovie(int index, Movie movie) {
        this.movies[index] = new Movie(movie);
    }

    public void changeRatng(int index, double rating) {
        this.movies[index].setRating(rating);
    }
}
