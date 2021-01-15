package com.example.merchant.repository;

import com.example.merchant.entity.MerchantOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MerchantOrderRepository extends MongoRepository<MerchantOrder, String> {
    List<MerchantOrder> FindByMerchant(String email);
}
