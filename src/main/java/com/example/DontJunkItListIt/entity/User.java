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
	    
	    @Column(name="password")
	    private String password;


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

		public Long getUserID() {
			return userID;
		}

		public void setUserID(Long userID) {
			this.userID = userID;
		}

		public String getUserName() {
			return userName;
		}
		
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getRegistrationDate() {
			return registrationDate;
		}

		public void setRegistrationDate(Date registrationDate) {
			this.registrationDate = registrationDate;
		}

		public double getUserRating() {
			return userRating;
		}

		public void setUserRating(double userRating) {
			this.userRating = userRating;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Long getSubscriptionID() {
			return subscriptionID;
		}

		public void setSubscriptionID(Long subscriptionID) {
			this.subscriptionID = subscriptionID;
		}

		public Date getSubscriptionExpiry() {
			return subscriptionExpiry;
		}

		public void setSubscriptionExpiry(Date subscriptionExpiry) {
			this.subscriptionExpiry = subscriptionExpiry;
		}

		public User(Long userID, String userName, String location, String phoneNumber, String email,
				Date registrationDate, double userRating, String role, String status, String address,
				Long subscriptionID, Date subscriptionExpiry) {
			super();
			this.userID = userID;
			this.userName = userName;
			this.location = location;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.registrationDate = registrationDate;
			this.userRating = userRating;
			this.role = role;
			this.status = status;
			this.address = address;
			this.subscriptionID = subscriptionID;
			this.subscriptionExpiry = subscriptionExpiry;
		}

		

		public User(String userName, String location, String phoneNumber, String email, String password,
				String address) {
			super();
			this.userName = userName;
			this.location = location;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.password = password;
			this.address = address;
		}

		public User() {
			super();
		}

		@Override
		public String toString() {
			return "User [userID=" + userID + ", userName=" + userName + ", location=" + location + ", phoneNumber="
					+ phoneNumber + ", email=" + email + ", registrationDate=" + registrationDate + ", userRating="
					+ userRating + ", role=" + role + ", status=" + status + ", address=" + address
					+ ", subscriptionID=" + subscriptionID + ", subscriptionExpiry=" + subscriptionExpiry + "]";
		}

		 public User(String userName, String location, String phoneNumber, String email, String password,
					Date registrationDate, double userRating, String role, String status, String address,
					Long subscriptionID, Date subscriptionExpiry) {
				super();
				this.userName = userName;
				this.location = location;
				this.phoneNumber = phoneNumber;
				this.email = email;
				this.password = password;
				this.registrationDate = registrationDate;
				this.userRating = userRating;
				this.role = role;
				this.status = status;
				this.address = address;
				this.subscriptionID = subscriptionID;
				this.subscriptionExpiry = subscriptionExpiry;
			}

		/**
		 * Constructor to update user details from front end
		 * @param phoneNumber
		 * @param password
		 * @param address
		 */
		public User(String phoneNumber, String password, String address) {
			super();
			this.phoneNumber = phoneNumber;
			this.password = password;
			this.address = address;
		}
		 
		 
	    
	    
	}


