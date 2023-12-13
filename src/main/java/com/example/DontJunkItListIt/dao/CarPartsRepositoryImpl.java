package com.example.DontJunkItListIt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.DontJunkItListIt.entity.CarParts;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Repository
public class CarPartsRepositoryImpl  {
//
//	@PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public List<CarParts> getAllCarParts() {
//        return entityManager.createQuery("SELECT c FROM CarParts c", CarParts.class)
//                .getResultList();
//    }
//
//    @Override
//    @Transactional
//    public CarParts addCarPart(CarParts carPart) {
//        entityManager.persist(carPart);
//        return carPart;
//    }
}
