package com.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class Cinema extends BaseEntity{
private String name;
private String sponsoredName;

@OneToOne
private Location location;




}
