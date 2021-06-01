package com.cinema.entity;

import com.cinema.utility.MovieState;
import com.cinema.utility.MovieType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Movie extends BaseEntity{

    private int duration; // normally it is Integer
    private String name;
    private double price;
    private LocalDate releaseDate;

    @Enumerated(EnumType.STRING)
    private MovieState state;

    @Column(columnDefinition = "text")
    private String summary;

    @Enumerated(EnumType.STRING)
    private MovieType type;

    @ManyToMany()
    @JoinTable(
            name = "movie_genre_rel",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")

    )
    private List<Genre> genreList = new ArrayList<>();




}
