package com.example.merchant.services;

import com.example.merchant.entity.Merchant;


public interface MerchantService {
    public void saveMerchant(Merchant merchant);

    Merchant getMerchant(String email);
}
