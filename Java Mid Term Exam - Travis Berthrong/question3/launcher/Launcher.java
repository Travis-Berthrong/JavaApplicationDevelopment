package question3.launcher;

import java.io.IOException;
import java.util.List;
import question3.datamodel.Movie;
import question3.service.MovieService;
import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {

        MovieService movieService = new MovieService();
        List<Movie> movieList = new ArrayList<>();
        try {
            movieList = movieService.readCSV();
            System.out.println("Printing all movies sorted by rating...");

            for (Movie movie : movieList) {
                System.out.println(movie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
