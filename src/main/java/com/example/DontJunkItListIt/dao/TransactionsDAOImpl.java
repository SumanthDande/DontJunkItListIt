package com.example.DontJunkItListIt.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.DontJunkItListIt.entity.Transactions;

import jakarta.persistence.*;
@Repository
public class TransactionsDAOImpl implements TransactionsDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Transactions findById(Long id) {
        return entityManager.find(Transactions.class, id);
    }

    @Override
    public List<Transactions> findAll() {
        TypedQuery<Transactions> query = entityManager.createQuery("SELECT t FROM Transaction t", Transactions.class);
        return query.getResultList();
    }

    @Override
    public void save(Transactions transactions) {
        entityManager.persist(transactions);
    }

    @Override
    public void update(Transactions transactions) {
        entityManager.merge(transactions);
    }

    @Override
    public void delete(Transactions transactions) {
        entityManager.remove(transactions);
    }
}

