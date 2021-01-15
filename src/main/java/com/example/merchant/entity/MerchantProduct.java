package com.example.merchant.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "merchant_product")
public class MerchantProduct {
    @Id
    private String productId;
    private String productName;
    private String productDescription;
    private String productImage;
    private double productPrice;
    private int productStock;
    private int productRating;
    private String productQuantity;
    private double productAge;
    private String productProducedIn;
    private String alcoholContent;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public int getProductRating() {
        return productRating;
    }

    public void setProductRating(int productRating) {
        this.productRating = productRating;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductAge() {
        return productAge;
    }

    public void setProductAge(double productAge) {
        this.productAge = productAge;
    }

    public String getProductProducedIn() {
        return productProducedIn;
    }

    public void setProductProducedIn(String productProducedIn) {
        this.productProducedIn = productProducedIn;
    }

    public String getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(String alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productImage='" + productImage + '\'' +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", productRating=" + productRating +
                ", productQuantity='" + productQuantity + '\'' +
                ", productAge=" + productAge +
                ", productProducedIn='" + productProducedIn + '\'' +
                ", alcoholContent='" + alcoholContent + '\'' +
                '}';
    }
}
