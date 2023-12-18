package com.example.DontJunkItListIt.dto;

//ProductDetailsRequest.java
public class ProductDetailsRequest {

 private String partName;
 private Double price;
 private String color;
 private String description;

public String getPartName() {
	return partName;
}
public void setPartName(String partName) {
	this.partName = partName;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
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
/**
 * @param partName
 * @param price
 * @param color
 * @param description
 */
public ProductDetailsRequest(String partName, Double price, String color, String description) {
	super();
	this.partName = partName;
	this.price = price;
	this.color = color;
	this.description = description;
}
/**
 * 
 */
public ProductDetailsRequest() {
	super();
}



 
}
