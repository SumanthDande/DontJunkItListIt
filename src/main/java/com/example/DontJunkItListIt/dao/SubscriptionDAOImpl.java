package com.example.DontJunkItListIt.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.DontJunkItListIt.entity.Subscription;

import jakarta.persistence.*;

@Repository
public class SubscriptionDAOImpl implements SubscriptionDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Subscription findById(Long id) {
        return entityManager.find(Subscription.class, id);
    }

    @Override
    public List<Subscription> findAll() {
        TypedQuery<Subscription> query = entityManager.createQuery("SELECT s FROM Subscription s", Subscription.class);
        return query.getResultList();
    }

    @Override
    public void save(Subscription subscription) {
        entityManager.persist(subscription);
    }

    @Override
    public void update(Subscription subscription) {
        entityManager.merge(subscription);
    }

    @Override
    public void delete(Subscription subscription) {
        entityManager.remove(subscription);
    }
}
