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

    @Lob
    @Column(name= "imageData", nullable = true)
    private byte[] imageData;
    
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

	public Long getPartID() {
		return partID;
	}

	public void setPartID(Long partID) {
		this.partID = partID;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	
	public CarParts() {
		super();
	}
	

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	
	public CarParts(Long partID, String partName, String manufacturer, int year, byte[] imageData, String condition,
			String category, double price, String color, String description, User user, Cart cart) {
		super();
		this.partID = partID;
		this.partName = partName;
		this.manufacturer = manufacturer;
		this.year = year;
		this.imageData = imageData;
		this.condition = condition;
		this.category = category;
		this.price = price;
		this.color = color;
		this.description = description;
		this.user = user;
		this.cart = cart;
	}

	public CarParts(String partName, String manufacturer, int year, byte[] imageData, String condition, String category,
			double price, String color, String description, User user, Cart cart) {
		super();
		this.partName = partName;
		this.manufacturer = manufacturer;
		this.year = year;
		this.imageData = imageData;
		this.condition = condition;
		this.category = category;
		this.price = price;
		this.color = color;
		this.description = description;
		this.user = user;
		this.cart = cart;
	}

	public CarParts(String partName, String manufacturer, int year, String condition, String category, double price,
			String color, String description, User user, Cart cart) {
		super();
		this.partName = partName;
		this.manufacturer = manufacturer;
		this.year = year;
		this.condition = condition;
		this.category = category;
		this.price = price;
		this.color = color;
		this.description = description;
		this.user = user;
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "CarParts [partID=" + partID + ", partName=" + partName + ", manufacturer=" + manufacturer + ", year="
				+ year + ", condition=" + condition + ", category=" + category + ", price=" + price + ", color=" + color
				+ ", description=" + description + ", user=" + user + ", cart=" + cart + "]";
	}


    
}
