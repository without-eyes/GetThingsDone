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

    public Integer getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public Integer getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(Integer login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
