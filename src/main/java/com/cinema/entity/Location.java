package com.cinema.entity;


import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
public class Location extends BaseEntity{

private String name;
private String adress;
private int postalCode;
private String country;
private String state;
private String city;



}
