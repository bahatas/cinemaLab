package com.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class AccountDetails extends BaseEntity{


    private String name;
    private String adress;
    private String country;
    private String city;
    private String state;
    private int age;
    private String postalCode;





}
