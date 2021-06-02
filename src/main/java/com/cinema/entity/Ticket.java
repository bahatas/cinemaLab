package com.cinema.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Ticket extends BaseEntity {

    @Column(name = "seat_number")
    private Integer seatNumber;

    @Column(name = "row_number")
    private Integer rowNumber;


    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_cinema_id")
    private MovieCinema movieCinema;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private User user;


}