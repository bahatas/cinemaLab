package com.cinema.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_account")
public class User extends BaseEntity{

   private String email;
   private String password;
   private String username;


   @OneToOne(fetch = FetchType.LAZY) // delete and try
   @JoinColumn(name = "account_details_id")
   private Account account;

   public User(String email, String password, String username) {
      this.email = email;
      this.password = password;
      this.username = username;
   }
}
