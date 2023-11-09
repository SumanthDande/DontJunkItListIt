package com.example.DontJunkItListIt.service;

import java.util.List;

import com.example.DontJunkItListIt.entity.CarParts;

public interface CarPartsListingService {

    List<CarParts> searchParts(String keyword, String category, double minPrice, double maxPrice, String location);
    void createPartListing(CarParts part);

}
