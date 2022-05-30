package com.example.moviehw.Reopositories;


import com.example.moviehw.models.Movie;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepositoryImplementation<Movie,Integer> {
}
