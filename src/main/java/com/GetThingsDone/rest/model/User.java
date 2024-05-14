package com.GetThingsDone.rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "User")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UserID")
    private Integer userID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Login")
    private Integer login;

    @Column(name = "Password")
    private String password;

    @Column(name = "Experience")
    private Integer experience;
}
