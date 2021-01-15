package com.example.merchant.controller;


import com.example.merchant.entity.Merchant;
import com.example.merchant.entity.MerchantOrder;
import com.example.merchant.entity.MerchantProduct;
import com.example.merchant.services.MerchantOrderService;
import com.example.merchant.services.MerchantProductService;
import com.example.merchant.services.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/merchant")
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @Autowired
    MerchantOrderService merchantOrderService;

    @Autowired
    MerchantProductService merchantProductService;

    @PostMapping(value = "/register")
    public void saveMerchant(@RequestBody Merchant merchant){
        merchantService.saveMerchant(merchant);
    }

    @GetMapping(value = "/login/{email}")
    public Merchant getMerchant(@PathVariable("email") String email){
        return merchantService.getMerchant(email);
    }

    @PostMapping(value = "/products/addProduct/{email}")
    public void addProduct(@PathVariable("email") String email, @RequestBody MerchantProduct merchantProduct){
        merchantProductService.saveProduct(email, merchantProduct);
    }

    @GetMapping(value = "/products/findAll/{email}")
    public List<MerchantProduct> findAllProducts(@PathVariable("email") String email){
        return merchantProductService.productsFindAll(email);
    }

    @GetMapping(value = "/products/findByName/{email}/{name}")
    public List<MerchantProduct> findByName(@PathVariable("email") String email, @PathVariable("name") String name){
        return merchantProductService.findByProductName(email, name);
    }

    @GetMapping(value = "/products/findByName/{email}/{id}")
    public MerchantProduct findById(@PathVariable("email") String email, @PathVariable("id") String id){
        return merchantProductService.findByProductId(email, id);
    }

    @PostMapping(value = "/products/updateProduct/{email}")
    public void updateProduct(@PathVariable("email") String email, @RequestBody MerchantProduct merchantProduct){
        merchantProductService.updateProduct(email, merchantProduct);
    }

    @GetMapping(value = "/orders/FindByMerchant/{email}")
    public List<MerchantOrder> getOrders(@PathVariable("email") String email){
        return merchantOrderService.FindByMerchant(email);
    }

    @DeleteMapping(value = "/products/deleteById/{email}/{id}")
    public void deleteProduct(@PathVariable("email") String email, @PathVariable("id") String id){
        merchantProductService.deleteProduct(email, id);
    }
}
