package com.cinema.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class MovieCinema extends BaseEntity {

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="movie_id")
    private Movie movie;

    public MovieCinema(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
