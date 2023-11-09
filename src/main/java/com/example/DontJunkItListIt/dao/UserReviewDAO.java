package com.example.DontJunkItListIt.dao;

import java.util.List;


import com.example.DontJunkItListIt.entity.CarParts;
import com.example.DontJunkItListIt.entity.UserReview;

public interface UserReviewDAO {
    List<UserReview> findByReviewedPart(CarParts reviewedPart);
    void save(UserReview userReview);

}

