package com.kemal.productserviceapi.Service;

import com.kemal.productserviceapi.Model.Recommendtion;
import com.kemal.productserviceapi.Model.Review;
import com.kemal.productserviceapi.Repository.RecommendtionRepository;
import com.kemal.productserviceapi.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;



    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    public Optional<Review> findById(Long id) {
        return reviewRepository.findById(id);
    }

    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    public void delete(Review review) {
        reviewRepository.delete(review);
    }
}
