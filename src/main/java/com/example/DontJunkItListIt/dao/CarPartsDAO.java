package com.example.DontJunkItListIt.dao;

import java.util.List;

import com.example.DontJunkItListIt.entity.CarParts;

public interface CarPartsDAO {
    CarParts findById(Long id);
    List<CarParts> findAll();
    void save(CarParts parts);
    void update(CarParts parts);
    void delete(CarParts parts);
    
    List<CarParts> findByCategoryAndPriceBetweenAndLocationContaining(String category, double minPrice, double maxPrice, String location);

    List<CarParts> findByPartNameContaining(String keyword);

    List<CarParts> findByCategoryAndPartNameContaining(String category, String keyword);

    List<CarParts> findByCategoryAndLocationContaining(String category, String location);
}
