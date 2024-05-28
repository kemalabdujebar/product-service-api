package com.kemal.productserviceapi.Service;

import com.kemal.productserviceapi.Model.Product;
import com.kemal.productserviceapi.Model.Recommendtion;
import com.kemal.productserviceapi.Repository.ProductRepository;
import com.kemal.productserviceapi.Repository.RecommendtionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecommendtionService {
    @Autowired
    private RecommendtionRepository recommendtionRepository;



    public List<Recommendtion> findAll() {
        return recommendtionRepository.findAll();
    }

    public Optional<Recommendtion> findById(Long id) {
        return recommendtionRepository.findById(id);
    }

    public Recommendtion save(Recommendtion recommendtion) {
        return recommendtionRepository.save(recommendtion);
    }

    public void delete(Recommendtion recommendtion) {
         recommendtionRepository.delete(recommendtion);
    }
}

