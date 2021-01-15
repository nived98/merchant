package com.example.merchant.services;

import com.example.merchant.entity.MerchantOrder;

import java.util.List;

public interface MerchantOrderService {
    List<MerchantOrder> FindByMerchant(String email);
}
