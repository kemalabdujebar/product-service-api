package com.kemal.productserviceapi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name = "Review_table")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private int reviewId;
    private String author;
    private String subject;
    private String content;
    private String serviceAddress;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    @Override
    public String toString() {
        return "Review{" +
                "productId=" + productId +
                ", reviewId=" + reviewId +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", serviceAddress='" + serviceAddress + '\'' +
                '}';
    }
}


