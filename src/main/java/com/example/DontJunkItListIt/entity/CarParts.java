package com.example.DontJunkItListIt.entity;

import jakarta.persistence.*;

@Entity
public class CarParts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "partID") // Specify column name
    private Long partID; // Primary Key

    @Column(name = "partName") // Specify column name
    private String partName;

    @Column(name = "manufacturer") // Specify column name
    private String manufacturer;

    @Column(name = "year") // Specify column name
    private int year;

    @Column(name = "condition") // Specify column name
    private String condition;

    @Column(name = "category") // Specify column name
    private String category;

    @Column(name = "price") // Specify column name
    private double price;

    @Column(name = "color") // Specify column name
    private String color;

    @Column(name = "description") // Specify column name
    private String description;

    @ManyToOne
    @JoinColumn(name = "userID", referencedColumnName = "userID") // Specify the join column for User
    private User user; // Many-to-One relationship with User
    
    @ManyToOne
    @JoinColumn(name = "cartID") // Specify the join column for Cart
    private Cart cart; // Many-to-One relationship with Cart


    // Constructors, getters, setters, and other methods can be added here

    // Additional methods and attributes can be added as needed
}
