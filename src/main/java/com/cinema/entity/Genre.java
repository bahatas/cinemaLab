package com.cinema.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class Genre extends BaseEntity{



private String name;

@ManyToMany(mappedBy = "genreList",cascade = CascadeType.ALL)
private List<Movie> movieList = new ArrayList<>();






}
