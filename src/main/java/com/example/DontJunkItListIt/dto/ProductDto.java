package com.example.DontJunkItListIt.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ProductDto {

    private String name;

    private String description;

    private String color;

    private String manufacturer;

    private int yearOfManufacture;

    private String condition;
    

    private List<MultipartFile> images;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public List<MultipartFile> getImages() {
		return images;
	}

	public void setImages(List<MultipartFile> images) {
		this.images = images;
	}

	public ProductDto(String name, String description, String color, String manufacturer, int yearOfManufacture,
			String condition, List<MultipartFile> images) {
		super();
		this.name = name;
		this.description = description;
		this.color = color;
		this.manufacturer = manufacturer;
		this.yearOfManufacture = yearOfManufacture;
		this.condition = condition;
		this.images = images;
	}

	public ProductDto() {
		super();
	}

	public ProductDto(String name, String description, String color, String manufacturer, int yearOfManufacture,
			String condition) {
		super();
		this.name = name;
		this.description = description;
		this.color = color;
		this.manufacturer = manufacturer;
		this.yearOfManufacture = yearOfManufacture;
		this.condition = condition;
	}

    
}
