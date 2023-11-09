package com.example.DontJunkItListIt.service;

import java.util.List;

import com.example.DontJunkItListIt.entity.CarParts;
import com.example.DontJunkItListIt.entity.UserReview;

public interface UserReviewService {
    void addReview(UserReview review);
    List<UserReview> getReviewsForPart(CarParts part);
    double calculateAverageRating(CarParts part);
}

