package com.xworkz.Movie.external;

import com.xworkz.Movie.internal.Movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = (title, genre) -> "Movie: " + title + ", Genre: " + genre;
        System.out.println(movie.movieDetails("Leo", "Action"));
    }
}

