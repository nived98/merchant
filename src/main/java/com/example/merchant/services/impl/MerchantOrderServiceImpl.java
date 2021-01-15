package com.example.merchant.services.impl;

import com.example.merchant.entity.MerchantOrder;
import com.example.merchant.repository.MerchantOrderRepository;
import com.example.merchant.services.MerchantOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MerchantOrderServiceImpl implements MerchantOrderService {

    @Autowired
    MerchantOrderRepository merchantOrderRepository;

    @Override
    public List<MerchantOrder> FindByMerchant(String email) {
        return merchantOrderRepository.FindByMerchant(email);
    }
}
