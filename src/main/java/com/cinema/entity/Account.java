package com.cinema.entity;

import com.cinema.utility.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "account_details")
public class Account extends BaseEntity{


    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private int age;

    @Column(name = "postal_code")
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private UserRole role= UserRole.USER;

    @OneToOne(mappedBy = "account")
    private User user;

    public Account(String name, String address,
                   String country, String city,
                   String state, int age, String postalCode, UserRole role) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.city = city;
        this.state = state;
        this.age = age;
        this.postalCode = postalCode;
        this.role = role;
    }


}
