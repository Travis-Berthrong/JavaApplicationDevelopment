package question3.datamodel;

public class Movie {
    private String movieId;
    private String movieName;
    private float movieRating;
    private String movieAvailability;
    private float moviePrice;
    private String movieTiming;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String string) {
        this.movieId = string;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String string) {
        this.movieName = string;
    }

    public float getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(float f) {
        this.movieRating = f;
    }

    public String getMovieAvailability() {
        return movieAvailability;
    }

    public void setMovieAvailability(String string) {
        this.movieAvailability = string;
    }

    public float getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(float f) {
        this.moviePrice = f;
    }

    public String getMovieTiming() {
        return movieTiming;
    }

    public void setMovieTiming(String string) {
        this.movieTiming = string;
    }

    @Override
    public String toString() {
        return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieRating=" + movieRating
                + ", movieAvailability=" + movieAvailability + ", moviePrice=" + moviePrice + ", movieTiming="
                + movieTiming + "]";
    }

}
