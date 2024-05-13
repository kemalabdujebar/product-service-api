package com.kemal.productserviceapi.Service;

import com.kemal.productserviceapi.Model.Product;
import com.kemal.productserviceapi.Model.Recommendtion;
import com.kemal.productserviceapi.Model.Review;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public Product getProduct(int productId){
        Recommendtion recommendtion = new Recommendtion();
        recommendtion.setProductId(productId);
        recommendtion.setContent("kemal Abdujebar");
        recommendtion.setRate(10);

        List<Recommendtion> recommendtionList = new ArrayList<>();
        recommendtionList.add(recommendtion);


        Review review = new Review();
        review.setProductId(productId);
        review.setContent("this is extrmaly good");

        List<Review> reviewList = new ArrayList<>();
        reviewList.add(review);



        Product product = new Product();
        product.setProductId(productId);
        product.setProductName("Product "+productId);
        product.setPrice(100);
        product.setWeight(23);
        product.setRecommendations(recommendtionList);
        product.setReviews(reviewList);

        return product;
    }
}


