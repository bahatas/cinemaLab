package com.cinema.entity;

import com.cinema.utility.MovieState;
import com.cinema.utility.MovieType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Movie extends BaseEntity{

    private int duration; // normally it is Integer
    private String name;
    private BigDecimal price;
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

    public Movie(int duration, String name, BigDecimal price,
                 LocalDate releaseDate, MovieState state, String summary, MovieType type) {
        this.duration = duration;
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
        this.state = state;
        this.summary = summary;
        this.type = type;
    }
}
