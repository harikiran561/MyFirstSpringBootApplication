package com.springboot.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Table(name = "user")
@Entity
public class User {

    @Id
    private int id;
    private String name;
    private double salary;

    public User() {

    }
}
