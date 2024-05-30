package com.kemal.productserviceapi.Controller;

import com.kemal.productserviceapi.Model.Recommendtion;
import com.kemal.productserviceapi.Model.Review;
import com.kemal.productserviceapi.Service.RecommendtionService;
import com.kemal.productserviceapi.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<Review> getAllProducts() {
        return reviewService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Review> getProductById(@PathVariable Long id) {
        Optional<Review> review = reviewService.findById(id);
        if (review.isPresent()) {
            return ResponseEntity.ok(review.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Review createProduct(@RequestBody Review review) {
        return reviewService.save(review);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Review> updateProduct(@PathVariable Long id, @RequestBody Review reviewDetails) {
        Optional<Review> review = reviewService.findById(id);
        if (review.isPresent()) {
            Review existingReview = review.get();
            existingReview.setContent(reviewDetails.getContent());
            existingReview.setAuthor(reviewDetails.getAuthor());
            return ResponseEntity.ok(reviewService.save(existingReview));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        Optional<Review> review = reviewService.findById(id);
        if (review.isPresent()) {
            reviewService.delete(review.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }}




