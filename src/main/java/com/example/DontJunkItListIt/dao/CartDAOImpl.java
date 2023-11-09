package com.example.DontJunkItListIt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.DontJunkItListIt.entity.Cart;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class CartDAOImpl implements CartDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Cart findById(Long id) {
        return entityManager.find(Cart.class, id);
    }

    @Override
    public List<Cart> findAll() {
        TypedQuery<Cart> query = entityManager.createQuery("SELECT c FROM Cart c", Cart.class);
        return query.getResultList();
    }

    @Override
    public void save(Cart cart) {
        entityManager.persist(cart);
    }

    @Override
    public void update(Cart cart) {
        entityManager.merge(cart);
    }

    @Override
    public void delete(Cart cart) {
        entityManager.remove(cart);
    }
}
