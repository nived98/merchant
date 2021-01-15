package com.example.merchant.repository;

import com.example.merchant.entity.Merchant;
import com.example.merchant.entity.MerchantProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MerchantProductRepository extends MongoRepository<MerchantProduct, String> {
    List<MerchantProduct> findByProductName(Merchant merchant, String productName);

    List<MerchantProduct> findAll(Merchant merchant);

    MerchantProduct findByProductId(Merchant merchant, String productId);

    void saveProduct(Merchant merchant, String email);

    void updateProduct(Merchant merchant, String email);

    void deleteProduct(Merchant merchant, String email);
}
