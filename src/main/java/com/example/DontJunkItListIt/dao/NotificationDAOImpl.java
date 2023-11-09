package com.example.DontJunkItListIt.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.DontJunkItListIt.entity.Notification;

import jakarta.persistence.*;

@Repository
public class NotificationDAOImpl implements NotificationDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Notification findById(Long id) {
        return entityManager.find(Notification.class, id);
    }

    @Override
    public List<Notification> findAll() {
        TypedQuery<Notification> query = entityManager.createQuery("SELECT n FROM Notification n", Notification.class);
        return query.getResultList();
    }

    @Override
    public void save(Notification notification) {
        entityManager.persist(notification);
    }

    @Override
    public void update(Notification notification) {
        entityManager.merge(notification);
    }

    @Override
    public void delete(Notification notification) {
        entityManager.remove(notification);
    }
}

