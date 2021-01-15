package com.example.merchant.services.impl;


import com.example.merchant.entity.Merchant;
import com.example.merchant.entity.MerchantProduct;
import com.example.merchant.repository.MerchantProductRepository;
import com.example.merchant.repository.MerchantRepository;
import com.example.merchant.services.MerchantProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantProductServiceImpl implements MerchantProductService {

    @Autowired
    MerchantProductRepository merchantProductRepository;

    @Autowired
    MerchantRepository merchantRepository;

    @Override
    public List<MerchantProduct> productsFindAll(String email) {
        Merchant merchant = merchantRepository.findByMerchantEmail(email);
        return merchantProductRepository.findAll(merchant);
    }

    @Override
    public MerchantProduct findByProductId(String email, String productId) {
        Merchant merchant = merchantRepository.findByMerchantEmail(email);
        return merchantProductRepository.findByProductId(merchant, productId);
    }

    @Override
    public void saveProduct(String email, MerchantProduct merchantProduct) {
        Merchant merchant = merchantRepository.findByMerchantEmail(email);
        merchantProductRepository.saveProduct(merchant, email);
    }

    @Override
    public void updateProduct(String email, MerchantProduct merchantProduct) {
        Merchant merchant = merchantRepository.findByMerchantEmail(email);
        merchantProductRepository.updateProduct(merchant, email);
    }

    @Override
    public List<MerchantProduct> findByProductName(String email, String productName) {
        Merchant merchant = merchantRepository.findByMerchantEmail(email);
        return merchantProductRepository.findByProductName(merchant, email);
    }

    @Override
    public void deleteProduct(String email, String id) {
        Merchant merchant = merchantRepository.findByMerchantEmail(email);
        merchantProductRepository.deleteProduct(merchant, email);
    }
}
