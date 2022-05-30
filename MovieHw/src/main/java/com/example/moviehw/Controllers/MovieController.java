package com.example.moviehw.Controllers;


import com.example.moviehw.Service.MovieService;
import com.example.moviehw.models.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;


    @GetMapping
    public ResponseEntity<List<Movie>> getMovie(){
        return ResponseEntity.status(200).body(movieService.getMovie());
    }


    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }


    @PutMapping("/{id}")
    public ResponseEntity<List<Movie>> updateUser(@RequestBody Movie movie ,@PathVariable Integer id){
        List<Movie> result = movieService.updateMovie(id , movie);
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Movie>> deleteMovie(@PathVariable Integer id){
        movieService.delMovie(id);
        return null;
    }


}
