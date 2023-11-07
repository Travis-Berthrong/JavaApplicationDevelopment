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
        }
        System.out.println();
        System.out.println();
    }

    public void sortByRating(List<Movie> movies) {
        Collections.sort( movies, (m1, m2) -> Float.valueOf(m1.getMovieRating()).compareTo(Float.valueOf(m2.getMovieRating())));
        System.out.println("Printing all movies sorted by rating...");
        printMovies(movies);
    }

    public void findAvailable(List<Movie> movies) {
        List<Movie> availableMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getMovieAvailability().equals("available")) {
                availableMovies.add(movie);
            }
        }
        System.out.println("Printing all available movies...");
        printMovies(availableMovies);
    }

    public void setHouseFull(List<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.getMovieRating() >= 4.5 & movie.getMovieAvailability().equals("not available")) {
                movie.setMovieAvailability("HouseFull");
            }
        }
        System.out.println("Printing all movies after setting HouseFull...");
        printMovies(movies);
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
                } else {
                    rating = Float.parseFloat(movie_info[2].trim());
                }
                movie.setMovieRating(rating);
                movie.setMovieAvailability(movie_info[3].trim());
                movie.setMoviePrice(Float.parseFloat(movie_info[4].trim()));
                movie.setMovieTiming(movie_info[5].trim());
                movieList.add(movie);

                // // if rating is greater than 4.5 and availability is not available, set availability to HouseFull
                // String availability = movie_info[3].trim().toLowerCase();
                // if (rating >= 4.5 & availability.equals("not available")) {
                //     System.out.println(movie.getMovieName() + " is set to HouseFull");
                //     availability = "HouseFull";
                // }
                // movie.setMovieAvailability(availability);

                // movie.setMoviePrice(Float.parseFloat(movie_info[4].trim()));
                // movie.setMovieTiming(movie_info[5].trim());

                // // if availability is available, print the movie
                // if (availability.equals("available")) {
                //     System.out.println(movie.getMovieName() + " is available");
                //     System.out.println(movie);
                //     System.out.println();
                // } else {
                //     System.out.println(movie.getMovieName() + " is not available...");
                //     System.out.println();
                // }

                // movieList.add(movie);
            }
            count++;
        }
        br.close();
        sortByRating(movieList);
        findAvailable(movieList);
        setHouseFull(movieList);
        return movieList;
    }

    
}
