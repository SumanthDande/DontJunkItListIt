package com.example.DontJunkItListIt.dao;

import java.util.List;

import com.example.DontJunkItListIt.entity.Subscription;

public interface SubscriptionDAO {
    Subscription findById(Long id);
    List<Subscription> findAll();
    void save(Subscription subscription);
    void update(Subscription subscription);
    void delete(Subscription subscription);
}

