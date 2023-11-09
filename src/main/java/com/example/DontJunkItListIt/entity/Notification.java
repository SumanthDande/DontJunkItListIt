package com.example.DontJunkItListIt.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Notification {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long messageID; // Primary Key
    @Column
    private Date time;
    @Column
    private String message;

    @ManyToOne
    @JoinColumn(name = "userID", referencedColumnName="userID") // Specify the join column for User
    private User user; // Many-to-One relationship (Object type)

	public Long getMessageID() {
		return messageID;
	}

	public Notification() {
		super();
	}

	public void setMessageID(Long messageID) {
		this.messageID = messageID;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Notification(Long messageID, Date time, String message, User user) {
		super();
		this.messageID = messageID;
		this.time = time;
		this.message = message;
		this.user = user;
	}

    
}

