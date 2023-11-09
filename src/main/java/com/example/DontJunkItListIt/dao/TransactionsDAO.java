package com.example.DontJunkItListIt.dao;

import java.util.List;

import com.example.DontJunkItListIt.entity.Transactions;

public interface TransactionsDAO {
    Transactions findById(Long id);
    List<Transactions> findAll();
    void save(Transactions transaction);
    void update(Transactions transaction);
    void delete(Transactions transaction);
}

