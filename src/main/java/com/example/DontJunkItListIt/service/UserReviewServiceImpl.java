package com.example.DontJunkItListIt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DontJunkItListIt.dao.UserReviewDAO;
import com.example.DontJunkItListIt.entity.CarParts;
import com.example.DontJunkItListIt.entity.UserReview;

@Service
public class UserReviewServiceImpl implements UserReviewService {

    @Autowired
    private UserReviewDAO userReviewDAO;

    @Override
    public void addReview(UserReview review) {
        userReviewDAO.save(review);
    }

    @Override
    public List<UserReview> getReviewsForPart(CarParts part) {
        return userReviewDAO.findByReviewedPart(part);
    }

    @Override
    public double calculateAverageRating(CarParts part) {
        List<UserReview> reviews = userReviewDAO.findByReviewedPart(part);

        if (reviews.isEmpty()) {
            return 0.0; // No reviews, return a default value
        }

        int totalRating = 0;
        for (UserReview review : reviews) {
            totalRating += review.getRating();
        }

        return (double) totalRating / reviews.size();
    }
}

