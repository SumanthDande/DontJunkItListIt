package com.example.DontJunkItListIt.entity;

import jakarta.persistence.*;

@Entity
public class Subscription {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subscriptionID; // Primary Key
    @Column
    private String subscriptionName;
    @Column
    private int validity; // Assuming validity is represented in days

    @OneToOne
    @JoinColumn(name = "userID", referencedColumnName="userID") // Specify the join column for User
    private User user; // One-to-One relationship with User

	public Subscription(Long subscriptionID, String subscriptionName, int validity, User user) {
		super();
		this.subscriptionID = subscriptionID;
		this.subscriptionName = subscriptionName;
		this.validity = validity;
		this.user = user;
	}

	public Subscription() {
		super();
	}

	public Long getSubscriptionID() {
		return subscriptionID;
	}

	public void setSubscriptionID(Long subscriptionID) {
		this.subscriptionID = subscriptionID;
	}

	public String getSubscriptionName() {
		return subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    
}

