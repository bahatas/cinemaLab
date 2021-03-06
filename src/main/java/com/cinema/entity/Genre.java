package com.cinema.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Genre extends BaseEntity{



private String name;

@ManyToMany(mappedBy = "genreList")
private List<Movie> movieList = new ArrayList<>();

    public Genre(String name) {
        this.name = name;
    }
}
