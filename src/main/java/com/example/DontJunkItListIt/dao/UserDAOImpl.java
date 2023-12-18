package com.example.DontJunkItListIt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.DontJunkItListIt.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> findAll() {
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
        return query.getResultList();
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Override
    public User findByEmail(String email) {
    	String jpql = "from User u where u.email=:email";
    	TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
       // TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email", User.class);
        query.setParameter("email", email);

        List<User> users = query.getResultList();
        System.out.println("Printing DAO password: " +users.get(0).getPassword());
        return users.isEmpty() ? null : users.get(0);
    }

	
		
	}


