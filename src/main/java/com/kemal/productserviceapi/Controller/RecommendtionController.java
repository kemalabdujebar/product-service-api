package com.kemal.productserviceapi.Controller;

import com.kemal.productserviceapi.Model.Product;
import com.kemal.productserviceapi.Model.Recommendtion;
import com.kemal.productserviceapi.Service.ProductService;
import com.kemal.productserviceapi.Service.RecommendtionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recommendtion")

 public class RecommendtionController {
    @Autowired
    private RecommendtionService recommendtionService;

    @GetMapping
    public List<Recommendtion> getAllProducts() {
        return recommendtionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recommendtion> getProductById(@PathVariable Long id) {
        Optional<Recommendtion> recommendtion = recommendtionService.findById(id);
        if (recommendtion.isPresent()) {
            return ResponseEntity.ok(recommendtion.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Recommendtion createProduct(@RequestBody Recommendtion recommendtion) {
        return recommendtionService.save(recommendtion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recommendtion> updateProduct(@PathVariable Long id, @RequestBody Recommendtion recommendtionDetails) {
        Optional<Recommendtion> recommendtion = recommendtionService.findById(id);
        if (recommendtion.isPresent()) {
            Recommendtion existingRecommendtion = recommendtion.get();
            existingRecommendtion.setContent(recommendtionDetails.getContent());
            existingRecommendtion.setAuthor(recommendtionDetails.getAuthor());
            return ResponseEntity.ok(recommendtionService.save(existingRecommendtion));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        Optional<Recommendtion> recommendtion = recommendtionService.findById(id);
        if (recommendtion.isPresent()) {
            recommendtionService.delete(recommendtion.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }}


