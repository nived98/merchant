package com.example.merchant.services.impl;


import com.example.merchant.entity.Merchant;
import com.example.merchant.repository.MerchantRepository;
import com.example.merchant.services.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantRepository merchantRepository;

    @Override
    public void saveMerchant(Merchant merchant) {
        merchantRepository.save(merchant);
    }

    @Override
    public Merchant getMerchant(String email) {
        return merchantRepository.findByMerchantEmail(email);
    }
}
