package com.example.DontJunkItListIt.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.DontJunkItListIt.entity.CarParts;
import com.example.DontJunkItListIt.entity.UserReview;
import com.example.DontJunkItListIt.service.UserReviewService;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/reviews")
public class UserReviewController {

    @Autowired
    private UserReviewService userReviewService;

    // End point to add a user review
    @PostMapping("/add")
    public ResponseEntity<String> addReview(@RequestBody UserReview review) {
        userReviewService.addReview(review);
        return ResponseEntity.ok("Review added successfully");
    }

    // End point to retrieve reviews for a specific part
    @GetMapping("/part/{partId}")
    public ResponseEntity<List<UserReview>> getReviewsForPart(@PathVariable Long partId) {
        CarParts part = new CarParts();
        part.setPartID(partId);
        List<UserReview> reviews = userReviewService.getReviewsForPart(part);
        return ResponseEntity.ok(reviews);
    }

    // End point to calculate the average rating for a part
    @GetMapping("/average-rating/{partId}")
    public ResponseEntity<Double> calculateAverageRating(@PathVariable Long partId) {
        CarParts part = new CarParts();
        part.setPartID(partId);
        double averageRating = userReviewService.calculateAverageRating(part);
        return ResponseEntity.ok(averageRating);
    }
}

