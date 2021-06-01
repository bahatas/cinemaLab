package com.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class UserAccount extends BaseEntity{

   private String username;
   private String email;
   private String password;




}
