package com.example.DontJunkItListIt.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.DontJunkItListIt.entity.CarParts;
import com.example.DontJunkItListIt.entity.UserReview;

@Repository
public class UserReviewDAOImpl implements UserReviewDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UserReview> findByReviewedPart(CarParts reviewedPart) {
        // Implement the custom query to retrieve reviews for a specific part
        return entityManager.createQuery("SELECT ur FROM UserReview ur WHERE ur.reviewedPart = :part", UserReview.class)
                .setParameter("part", reviewedPart)
                .getResultList();
    }


}
