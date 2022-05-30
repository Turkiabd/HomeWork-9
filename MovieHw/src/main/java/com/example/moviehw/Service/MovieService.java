package com.example.moviehw.Service;


import com.example.moviehw.Reopositories.MovieRepository;
import com.example.moviehw.models.Movie;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {
private final MovieRepository movieRepository;
    public List<Movie> getMovie() {
    return movieRepository.findAll();

    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> updateMovie(Integer id, Movie movie) {
        Movie moviee = movieRepository.getReferenceById(id);
        moviee.setName(movie.getName());
        moviee.setGenre(movie.getGenre());
        return null;
    }

    public void delMovie(Integer id){
        movieRepository.deleteById(id);
    }
}
