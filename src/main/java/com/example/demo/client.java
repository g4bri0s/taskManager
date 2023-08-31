package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Test", schema = "public")
public class client {

    @Id
    int id;

    @Column
    String userName;
}
