package com.example.DontJunkItListIt.entity;

import jakarta.persistence.*;

@Entity
public class UserReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reviewID; // Primary Key
    private String reviewText;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "partID")
    private CarParts reviewedPart;

	public Long getReviewID() {
		return reviewID;
	}

	public void setReviewID(Long reviewID) {
		this.reviewID = reviewID;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public CarParts getReviewedPart() {
		return reviewedPart;
	}

	public void setReviewedPart(CarParts reviewedPart) {
		this.reviewedPart = reviewedPart;
	}

    
}

