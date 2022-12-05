package com.ecommerce.Springbootecommerce.service;

import com.ecommerce.Springbootecommerce.dto.Purchase;
import com.ecommerce.Springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
