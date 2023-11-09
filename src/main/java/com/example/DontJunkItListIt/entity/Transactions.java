package com.example.DontJunkItListIt.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="transactions")
public class Transactions {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionID; // Primary Key
    @Column
    private Date time;
    @Column
    private String status;
    @Column
    private double amount;

    @ManyToOne
    @JoinColumn(name = "userID", referencedColumnName="userID") // Specify the join column for User
    private User user; // Many-to-One relationship with User

	public Long getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(Long transactionID) {
		this.transactionID = transactionID;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Transactions(Long transactionID, Date time, String status, double amount, User user) {
		super();
		this.transactionID = transactionID;
		this.time = time;
		this.status = status;
		this.amount = amount;
		this.user = user;
	}

	public Transactions() {
		super();
	}

    
}
