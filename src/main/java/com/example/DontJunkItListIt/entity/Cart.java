package com.example.DontJunkItListIt.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Cart {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cartID") // Specify column name
    private Long cartID; // Primary Key

    @Column(name = "quantity") // Specify column name
    private int quantity;

    @Column(name = "price") // Specify column name
    private double price;

    @Column(name = "status") // Specify column name
    private String status;


    @ManyToOne
    @JoinColumn(name = "userID", referencedColumnName="userID") // Specify the join column for User
    private User user; // One-to-Many relationship with User

//    @OneToMany
//    @JoinColumn(name = "partID", referencedColumnName="partID") // Specify the join column for Part
//    private List<CarParts> parts; // One-to-Many relationship with Part

    // Constructors, getters, setters, and other methods can be added here

    // Additional methods and attributes can be added as needed
}

