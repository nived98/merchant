package com.example.merchant.repository;

import com.example.merchant.entity.Merchant;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MerchantRepository extends MongoRepository<Merchant, String> {
    Merchant findByMerchantEmail(String email);
}
