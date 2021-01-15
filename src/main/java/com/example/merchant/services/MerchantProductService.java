package com.example.merchant.services;

import com.example.merchant.entity.MerchantProduct;

import java.util.List;

public interface MerchantProductService {

    public List<MerchantProduct> productsFindAll(String email);
    public MerchantProduct findByProductId(String email, String productId);
    public void saveProduct(String email, MerchantProduct merchantProduct);
    public void updateProduct(String email, MerchantProduct merchantProduct);
    public List<MerchantProduct> findByProductName(String email, String productName);

    void deleteProduct(String email, String id);
}
