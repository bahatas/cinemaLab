package com.cinema.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Cinema extends BaseEntity{

private String name;
private String sponsoredName;

@ManyToOne(fetch = FetchType.LAZY)
private Location location;





}
