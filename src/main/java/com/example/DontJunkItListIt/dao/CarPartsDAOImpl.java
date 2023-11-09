package com.example.DontJunkItListIt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.DontJunkItListIt.entity.CarParts;

import jakarta.persistence.*;

@Repository
public class CarPartsDAOImpl implements CarPartsDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public CarParts findById(Long id) {
        return entityManager.find(CarParts.class, id);
    }

    @Override
    public List<CarParts> findAll() {
        TypedQuery<CarParts> query = entityManager.createQuery("SELECT p FROM CarParts p", CarParts.class);
        return query.getResultList();
    }

    @Override
    public void save(CarParts parts) {
        entityManager.persist(parts);
    }

    @Override
    public void update(CarParts parts) {
        entityManager.merge(parts);
    }

    @Override
    public void delete(CarParts parts) {
        entityManager.remove(parts);
    }
}

