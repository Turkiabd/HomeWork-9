package com.example.moviehw.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.sql.Date;

@Entity//sql db
@AllArgsConstructor @Data @NoArgsConstructor // lombok
public class Movie {


    @Id
    @Column(nullable = false , unique = true )
    @Size(min = 3)
    private Integer id;

    @Column(nullable = false , unique = true )
    @Size(min = 2)
    private String name;
    @NotEmpty
    @Column(nullable = false)
    @Pattern(regexp = "Drame|Action|Cpmedy")
    private String genre;

    @Column(nullable = false)
    @Positive
    @Range(min = 1, max = 5)
    private Integer rating;

    @Column(nullable = false)
    @Positive
    private Integer duration;
    @DateTimeFormat
    private Date launchDate;


}
