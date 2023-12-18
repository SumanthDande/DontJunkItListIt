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
    @Column(name= "image1", nullable = true)
    private byte[] image1;
    
    @Lob
    @Column(name= "image2", nullable = true)
    private byte[] image2;
    
    @Lob
    @Column(name= "image3", nullable = true)
    private byte[] image3;
    
    @Lob
    @Column(name= "image4", nullable = true)
    private byte[] image4;
    
    @Lob
    @Column(name= "image5", nullable = true)
    private byte[] image5;
    
    
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
    @JoinColumn(name = "userID") // Specify the join column for User
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

	
	

	public byte[] getImage1() {
		return image1;
	}

	public void setImage1(byte[] image1) {
		this.image1 = image1;
	}

	public byte[] getImage2() {
		return image2;
	}

	public void setImage2(byte[] image2) {
		this.image2 = image2;
	}

	public byte[] getImage3() {
		return image3;
	}

	public void setImage3(byte[] image3) {
		this.image3 = image3;
	}

	public byte[] getImage4() {
		return image4;
	}

	public void setImage4(byte[] image4) {
		this.image4 = image4;
	}

	public byte[] getImage5() {
		return image5;
	}

	public void setImage5(byte[] image5) {
		this.image5 = image5;
	}
	
	/**
	 * 
	 */

	public CarParts() {
		super();
	}
	
	/**
	 * @param partID
	 * @param partName
	 * @param manufacturer
	 * @param year
	 * @param image1
	 * @param condition
	 * @param price
	 * @param color
	 * @param description
	 * @param user
	 * @param cart
	 */
	public CarParts(Long partID, String partName, String manufacturer, int year, byte[] image1, String condition,
			double price, String color, String description, User user, Cart cart) {
		super();
		this.partID = partID;
		this.partName = partName;
		this.manufacturer = manufacturer;
		this.year = year;
		this.image1 = image1;
		this.condition = condition;
		this.price = price;
		this.color = color;
		this.description = description;
		this.user = user;
		this.cart = cart;
	}

	/**
	 * @param partID
	 * @param partName
	 * @param manufacturer
	 * @param year
	 * @param image1
	 * @param image2
	 * @param image3
	 * @param image4
	 * @param condition
	 * @param category
	 * @param price
	 * @param color
	 * @param description
	 * @param user
	 * @param cart
	 */
	public CarParts(Long partID, String partName, String manufacturer, int year, byte[] image1, byte[] image2,
			byte[] image3, byte[] image4, String condition, String category, double price, String color,
			String description, User user, Cart cart) {
		super();
		this.partID = partID;
		this.partName = partName;
		this.manufacturer = manufacturer;
		this.year = year;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.condition = condition;
		this.category = category;
		this.price = price;
		this.color = color;
		this.description = description;
		this.user = user;
		this.cart = cart;
	}

	/**
	 * @param partID
	 * @param partName
	 * @param manufacturer
	 * @param year
	 * @param image1
	 * @param image2
	 * @param image3
	 * @param condition
	 * @param category
	 * @param price
	 * @param color
	 * @param description
	 * @param user
	 * @param cart
	 */
	public CarParts(Long partID, String partName, String manufacturer, int year, byte[] image1, byte[] image2,
			byte[] image3, String condition, String category, double price, String color, String description, User user,
			Cart cart) {
		super();
		this.partID = partID;
		this.partName = partName;
		this.manufacturer = manufacturer;
		this.year = year;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.condition = condition;
		this.category = category;
		this.price = price;
		this.color = color;
		this.description = description;
		this.user = user;
		this.cart = cart;
	}

	/**
	 * @param partID
	 * @param partName
	 * @param manufacturer
	 * @param year
	 * @param image1
	 * @param image2
	 * @param condition
	 * @param category
	 * @param price
	 * @param color
	 * @param description
	 * @param user
	 * @param cart
	 */
	public CarParts(Long partID, String partName, String manufacturer, int year, byte[] image1, byte[] image2,
			String condition, String category, double price, String color, String description, User user, Cart cart) {
		super();
		this.partID = partID;
		this.partName = partName;
		this.manufacturer = manufacturer;
		this.year = year;
		this.image1 = image1;
		this.image2 = image2;
		this.condition = condition;
		this.category = category;
		this.price = price;
		this.color = color;
		this.description = description;
		this.user = user;
		this.cart = cart;
	}

	/**
	 * @param partID
	 * @param partName
	 * @param manufacturer
	 * @param year
	 * @param image1
	 * @param condition
	 * @param category
	 * @param price
	 * @param color
	 * @param description
	 * @param user
	 * @param cart
	 */
	public CarParts(Long partID, String partName, String manufacturer, int year, byte[] image1, String condition,
			String category, double price, String color, String description, User user, Cart cart) {
		super();
		this.partID = partID;
		this.partName = partName;
		this.manufacturer = manufacturer;
		this.year = year;
		this.image1 = image1;
		this.condition = condition;
		this.category = category;
		this.price = price;
		this.color = color;
		this.description = description;
		this.user = user;
		this.cart = cart;
	}

	/**
	 * 
	 */
	

	/**
	 * @param partID
	 * @param partName
	 * @param manufacturer
	 * @param year
	 * @param image1
	 * @param image2
	 * @param image3
	 * @param image4
	 * @param image5
	 * @param condition
	 * @param category
	 * @param price
	 * @param color
	 * @param description
	 * @param user
	 * @param cart
	 */
	public CarParts(Long partID, String partName, String manufacturer, int year, byte[] image1, byte[] image2,
			byte[] image3, byte[] image4, byte[] image5, String condition, String category, double price, String color,
			String description, User user, Cart cart) {
		super();
		this.partID = partID;
		this.partName = partName;
		this.manufacturer = manufacturer;
		this.year = year;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
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
