package com.example.DontJunkItListIt.dao;

import java.util.List;

import com.example.DontJunkItListIt.entity.Notification;

public interface NotificationDAO {
    Notification findById(Long id);
    List<Notification> findAll();
    void save(Notification notification);
    void update(Notification notification);
    void delete(Notification notification);
}

