package com.kemal.productserviceapi.Model;

import java.util.List;

public class Product {
    private int productId;
    private int weight;
    private String productName;
    private int price;
    private List<Recommendtion> recommendations;
    private List<Review> reviews;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Recommendtion> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Recommendtion> recommendations) {
        this.recommendations = recommendations;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public Product() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }





    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;


    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", weight=" + weight +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", recommendations=" + recommendations +
                ", reviews=" + reviews +
                '}';
    }
}


