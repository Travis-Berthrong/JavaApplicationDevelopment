package question3.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import question3.datamodel.Movie;

public class MovieService {

    public void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
            System.out.println();
        }
    }

    public void sortByRating(List<Movie> movies) {
        Collections.sort( movies, (m1, m2) -> Float.valueOf(m1.getMovieRating()).compareTo(Float.valueOf(m2.getMovieRating())));
    }

    public List<Movie> readCSV() throws IOException {
        String line = null;
        String splitBy = ",";
        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tbert\\OneDrive\\Documents\\Travis_Classwork\\Java Applications\\movie.csv"));
        List<Movie> movieList = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            if (count != 0) {
                Movie movie = new Movie();
                String[] movie_info = line.split(splitBy);
                movie.setMovieId(movie_info[0].trim());
                movie.setMovieName(movie_info[1].trim());
                float rating;

                // if rating is not available, set it to 0
                if (movie_info[2].trim().equals("") || movie_info[2].trim() == null || movie_info[2].trim().equals("0")) {
                    rating = 0;
                    System.out.println("Rating not available for " + movie.getMovieName());
                    System.out.println("Setting rating to 0...");
                } else {
                    System.out.println("Rating available for " + movie.getMovieName());
                    rating = Float.parseFloat(movie_info[2].trim());
                }
                movie.setMovieRating(rating);
                System.out.println(movie);
                System.out.println();

                // if rating is greater than 4.5 and availability is not available, set availability to HouseFull
                String availability = movie_info[3].trim().toLowerCase();
                if (rating >= 4.5 & availability.equals("not available")) {
                    System.out.println(movie.getMovieName() + " is set to HouseFull");
                    availability = "HouseFull";
                }
                movie.setMovieAvailability(availability);

                movie.setMoviePrice(Float.parseFloat(movie_info[4].trim()));
                movie.setMovieTiming(movie_info[5].trim());

                // if availability is available, print the movie
                if (availability.equals("available")) {
                    System.out.println(movie.getMovieName() + " is available");
                    System.out.println(movie);
                    System.out.println();
                } else {
                    System.out.println(movie.getMovieName() + " is not available...");
                    System.out.println();
                }

                movieList.add(movie);
            }
            count++;
        }
        br.close();
        sortByRating(movieList);
        return movieList;
    }

    
}
