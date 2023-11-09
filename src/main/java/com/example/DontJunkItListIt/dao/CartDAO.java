package com.example.DontJunkItListIt.dao;

import java.util.List;

import com.example.DontJunkItListIt.entity.Cart;

public interface CartDAO {
    Cart findById(Long id);
    List<Cart> findAll();
    void save(Cart cart);
    void update(Cart cart);
    void delete(Cart cart);
}

