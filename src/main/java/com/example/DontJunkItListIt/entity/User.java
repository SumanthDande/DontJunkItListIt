package com.example.DontJunkItListIt.entity;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class User {
	

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "userID") // Specify column name
	    private Long userID; // Primary Key

	    @Column(name = "userName") // Specify column name
	    private String userName;

	    @Column(name = "location") // Specify column name
	    private String location;

	    @Column(name = "phoneNumber") // Specify column name
	    private String phoneNumber;

	    @Column(name = "email") // Specify column name
	    private String email;

	    @Column(name = "registrationDate") // Specify column name
	    private Date registrationDate; // Using java.util.Date for date fields

	    @Column(name = "userRating") // Specify column name
	    private double userRating;

	    @Column(name = "role") // Specify column name
	    private String role;

	    @Column(name = "status") // Specify column name
	    private String status;

	    @Column(name = "address") // Specify column name
	    private String address;

	    @Column(name = "subscriptionID") // Specify column name
	    private Long subscriptionID;

	    @Column(name = "subscriptionExpiry") // Specify column name
	    private Date subscriptionExpiry; // Using java.util.Date for date fields

	    // Constructors, getters, setters, and other methods can be added here

	    // Additional methods and attributes can be added as needed
	}

    // Constructors, getters, setters, and other methods can be added here

