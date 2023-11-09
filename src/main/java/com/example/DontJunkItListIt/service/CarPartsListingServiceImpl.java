package com.example.DontJunkItListIt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.DontJunkItListIt.dao.CarPartsDAO;
import com.example.DontJunkItListIt.entity.CarParts;

public class CarPartsListingServiceImpl implements CarPartsListingService {

	 @Autowired
	    private CarPartsDAO carPartsDAO;

	    @Override
	    public List<CarParts> searchParts(String keyword, String category, double minPrice, double maxPrice, String location) {
	        if (category != null && !category.isEmpty() && minPrice >= 0 && maxPrice >= minPrice && location != null && !location.isEmpty()) {
	            // Filter by category, price range, and location
	            return carPartsDAO.findByCategoryAndPriceBetweenAndLocationContaining(category, minPrice, maxPrice, location);
	        } else if (category != null && !category.isEmpty() && keyword != null && !keyword.isEmpty()) {
	            // Filter by category and keyword
	            return carPartsDAO.findByCategoryAndPartNameContaining(category, keyword);
	        } else if (category != null && !category.isEmpty() && location != null && !location.isEmpty()) {
	            // Filter by category and location
	            return carPartsDAO.findByCategoryAndLocationContaining(category, location);
	        } else if (keyword != null && !keyword.isEmpty()) {
	            // Filter by keyword
	            return carPartsDAO.findByPartNameContaining(keyword);
	        } else {
	            // No specific criteria provided, return all parts
	            return carPartsDAO.findAll();
	        }
	    }
	    @Override
	    public void createPartListing(CarParts part) {
	        if (part.getPartName() == null || part.getCategory() == null || part.getPrice() <= 0) {
	            throw new IllegalArgumentException("Invalid part data");
	        }

	        carPartsDAO.save(part);
	    }

}
